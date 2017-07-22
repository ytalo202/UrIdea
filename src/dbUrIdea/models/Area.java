package dbUrIdea.models;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by Yoshinon on 21/07/2017.
 */

public class Area {
    private int id;
    private Company company;
    private String nameArea;


    public Area() {
    }

    public Area(int id, Company company, String nameArea) {
        this.setId(id);
        this.setCompany(company);
        this.setNameArea(nameArea);
    }


    public String getIdAsString() {
        return String.valueOf(getId());
    }

    public String getNameAreAsValue(){return "'"+ getNameArea()+"'";}

    public int getId() {
        return id;
    }

    public Area setId(int id) {
        this.id = id;
        return this;
    }

    public Company getCompany() {
        return company;
    }

    public Area setCompany(Company company) {
        this.company = company;
        return this;
    }

    public String getNameArea() {
        return nameArea;
    }

    public Area setNameArea(String nameArea) {
        this.nameArea = nameArea;
        return this;
    }

    public static Area build(ResultSet rs,
                           CompaniesEntity companiesEntity,
                           EmailAddressesEntity emailAddressesEntity
    )
    {
        try {
            return (new Area())
                    .setId(rs.getInt("id"))
                    .setCompany(companiesEntity.findById(
                            rs.getInt("id_companies")
                            ,emailAddressesEntity))

                    .setNameArea(rs.getString("name_area"));


        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
