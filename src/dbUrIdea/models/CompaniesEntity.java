package dbUrIdea.models;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Yoshinon on 15/06/2017.
 */
public class CompaniesEntity extends BaseEntity {

    //-----

    private Connection conn = null;
    private Statement st = null;
    private ResultSet rs = null;

    public boolean validar(String nom ,
                           String clave ){
        boolean encontrado = false;
        try {
            conn = this.getConnection();
            st = conn.createStatement();
            rs=st.executeQuery("select * from" +
                    " companies where name_company = '"+nom+"' and password = '"+clave+"'");
            if (rs.next()){
                encontrado=true;
            }
                this.closesConnection();

        }catch (Exception e){

        }
            return encontrado;
    }


/*  public boolean consulta(String nom,String clave) {
        //boolean encontrado = false;
        PreparedStatement pst = null;
        Statement ps = null;
        Connection conn = null;
        Statement st = null;
        ResultSet rs = null;

        try {

           String consulta = "select * from" +
                   " companies where name_company = '"+nom+"' and password = '"+clave+"'";

           //-----
           pst = getConnection().createStatement(consulta);


           pst.setString(1,nom);
           pst.setString(2,clave);
           rs = pst.executeQuery();

           if (rs.absolute(1)){
               return true;
           }
        } catch (SQLException e) {
            System.err.println("Error"+e);
        }finally {
            try {
                if (getConnection() != null) getConnection().close();
                if(pst != null) pst.close();
                if (rs != null) rs.close();
            } catch (SQLException e) {
                System.err.println("Error"+e);
            }
        }
        return false;
    }*/






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


    public List<Company> ListById(int idCom, EmailAddressesEntity emailAddressEntit) {
        String criteria = "id = " + idCom;
        return findByCriteria(criteria,emailAddressEntit);
    }





    public Company findByState(String state, EmailAddressesEntity emailAddressEntit) {
        String criteria = "id_state_company = " + "'" + state + "'";
        return findByCriteria(criteria, emailAddressEntit).get(0);
    }


    public Company findByNameAndPass(String email,String password ,EmailAddressesEntity emailAddressEntity) {
        return findIdByEmailAndPassword(email,password ,emailAddressEntity).get(0);
    }

    public List<Company> findIdByEmailAndPassword(String email, String password,
                                                  EmailAddressesEntity emailAddressEntity) {
        String sql ="select a.id,a.password,a.name_company,a.description," +
                "a.company_state,a.id_email_address,a.photo,a.address,a.phone_number from" +
                " companies a left join email_addresses b on a.id_email_address = b.id" +
                " where email_data= '"+email+"' and a.password = '"+password+"'";
        List<Company> companies = new ArrayList<>();
        try {
            ResultSet rs = getConnection()
                    .createStatement().executeQuery(sql);
            if(rs == null) return null;
            while(rs.next()) companies.add(
                    Company.build(rs, emailAddressEntity));
            return companies;
        } catch(SQLException e) {
            e.printStackTrace();
        }
        return companies;
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


    public List<Company> findByCriteriaId(String criteria,
                                        EmailAddressesEntity emailAddressEntit) {
        String sql = getDefaultIdQuery() +
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

    public boolean add2(Company company) {
        String sql = "INSERT companies ("+
                "password, name_company, company_state," +
                "id_email_address) " +
                "VALUES(" +
                company.getPasswordAsValue() + ", " +
                company.getNameCompanyAsValue()+ ", " +
                company.getCompanyStateAsString()+ ", " +
                company.getEmailAdress().getIdAsString()
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

    public boolean Confe(String name,String clave) {
        String sql = "select * companies where name_company = '"+name+"' and password = '"+clave+"'";
        return change(sql);
    }









}
