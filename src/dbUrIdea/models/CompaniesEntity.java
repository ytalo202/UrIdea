package dbUrIdea.models;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Yoshinon on 15/06/2017.
 */
public class CompaniesEntity extends BaseEntity {

    //-----
    private Connection conn = null;
    private Statement st = null;
    private  ResultSet rss = null;

    public boolean validarUserCompany(String nom,String clave) {
        boolean encontrado = false;

        try {
            conn = this.getConnection();
            st = conn.createStatement();
            rss = st.executeQuery("select * from companies " +
                    "where name_company = '" + nom + "' " +
                    "and password = '" + clave + "'");

            if (rss.next()) {
                encontrado = true;

            }
            this.closesConnection();
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
        return encontrado;


    }


    public CompaniesEntity() {
        super();
    }


    public CompaniesEntity(Connection connection) {
        super(connection,"companies");
    }

    public List<Company> findAll( EmailAddressesEntity emailAddressesEntity) {
        return findByCriteria("", emailAddressesEntity);
    }

    public Company findById(int id, EmailAddressesEntity emailAddressEntit) {
        String criteria = "id = " + String.valueOf(id);
        return findByCriteria(criteria,emailAddressEntit).get(0);
    }
    public Company findByName(String name, EmailAddressesEntity emailAddressEntit) {
        String criteria = "name_company = " + "'" + name + "'";
        return findByCriteria(criteria,emailAddressEntit).get(0);
    }



    public Company findByEmailId(int idE, EmailAddressesEntity emailAddressEntit) {
        String criteria = "id_email_address = " +
                String.valueOf(idE);

        return findByCriteria(criteria,emailAddressEntit).get(0);
    }

    public Company findByState(String state, EmailAddressesEntity emailAddressEntit) {
        String criteria = "id_state_company = " + "'" + state + "'";
        return findByCriteria(criteria, emailAddressEntit).get(0);
    }

    public List<Company> findByCriteria(String criteria,
                                        EmailAddressesEntity emailAddressEntit) {
        String sql = getDefaultQuery() +
                (criteria.equalsIgnoreCase("") ?
                        "" : " WHERE " + criteria);
        List<Company> companies = new ArrayList<>();
        try {
            ResultSet rs = getConnection()
                    .createStatement().executeQuery(sql);
            if(rs == null) return null;
            while(rs.next()) companies.add(
                    Company.build(rs, emailAddressEntit));
            return companies;
        } catch(SQLException e) {
            e.printStackTrace();
        }
        return companies;
    }

    public List<Company> findAllOrderByName( EmailAddressesEntity emailAddressEntit, boolean isAscending) {
        return findByCriteria("true ORDER BY name_company" +
                (isAscending ? "" : " DESC"), emailAddressEntit );
    }

    public boolean add(Company company) {
        String sql = "INSERT companies ("+
                "password, name_company, description, company_state," +
                "id_email_address, address, phone_number ) " +
                "VALUES(" +
                company.getPasswordAsValue() + ", " +
                company.getNameCompanyAsValue()+ ", " +
                company.getDescriptionAsValue()+ ", " +
                company.getCompanyStateAsString()+ ", " +
                company.getEmailAdress().getIdAsString()+ ", " +
                company.getAddressAsValue()+ ", " +
                company.getPhoneNumberAsString()
                + ")";
        return change(sql);
    }
    public boolean update(Company company) {
        String sql = "UPDATE companies SET password = " + company.getPasswordAsValue() + ", " +
                "name_company = " + company.getNameCompanyAsValue() + ", " +
                "description = " + company.getDescriptionAsValue() + ", " +
                "company_state = " + company.getCompanyStateAsString() + ", " +
                "address = "+company.getAddressAsValue()+ ", " +
                "phone_number = "+company.getPhoneNumberAsString()+
                " WHERE id = " + company.getIdAsString();
        return change(sql);
    }




    public boolean delete(Company company) {
        String sql = "DELETE FROM companies WHERE id = " +
                company.getIdAsString();
        return change(sql);
    }
    public boolean delete(String id) {
        String sql = "DELETE FROM companies WHERE id = " +
                "'" + id + "'";
        return change(sql);
    }









}
