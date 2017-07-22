package dbUrIdea.models;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Yoshinon on 21/07/2017.
 */
public class AreasEntity extends BaseEntity {


    public AreasEntity() {
        super();
    }

    public AreasEntity(Connection connection) {
        super(connection,"areas");

    }

    public List<Area> findAll(CompaniesEntity companiesEntity,
                              EmailAddressesEntity emailAddressesEntity)
    {
        return findByCriteria("", companiesEntity, emailAddressesEntity);
    }

    public Area findById(int id,CompaniesEntity companiesEntity,
                         EmailAddressesEntity emailAddressesEntity
    ) {
        String criteria = "id = " + String.valueOf(id);
        return findByCriteria(criteria
                ,companiesEntity, emailAddressesEntity).get(0);
    }


    public List<Area> findByCriteria(String criteria,
                                           CompaniesEntity companiesEntity,
                                           EmailAddressesEntity emailAddressesEntity)
    {
        String sql = getDefaultQuery() +
                (criteria.equalsIgnoreCase("") ? "" : " WHERE " + criteria);
        List<Area> areas = new ArrayList<>();
        try {
            ResultSet rs = getConnection().createStatement().executeQuery(sql);
            if(rs == null) return null;
            while(rs.next()) areas.add(Area.build(
                    rs,companiesEntity, emailAddressesEntity));
            return areas;
        } catch(SQLException e) {
            e.printStackTrace();
        }
        return areas;
    }

    public boolean add(Area area) {
        String sql = "INSERT areas(id_companies, name_area) " +
                "VALUES("
                + area.getCompany().getIdAsString()+", "
                + area.getNameAreAsValue()+")";

        return change(sql);
    }

    public boolean update(Area area) {
        String sql = "UPDATE areas SET name_area = "
                + area.getNameAreAsValue()+
                " WHERE id = " + area.getIdAsString();
        return change(sql);
    }





}
