package dbUrIdea.models;

import java.sql.Connection;
import java.sql.SQLException;
/**
 * Created by Yoshinon on 15/06/2017.
 */
public class BaseEntity {
    private Connection connection;
    private static String BASE_QUERY = "SELECT * FROM ";

    private static String BASE_ID = "SELECT id FROM ";
    private String tableName;

    public BaseEntity() {
    }

    public BaseEntity(Connection connection) {
        this.setConnection(connection);
    }

    public BaseEntity(Connection connection, String tableName) {
        this.setConnection(connection);
        this.setTableName(tableName);
    }

    public static String getBaseQuery() {
        return BASE_QUERY;
    }

    public static void setBaseQuery(String baseQuery) {
        BASE_QUERY = baseQuery;
    }

    public static String getBaseId() {
        return BASE_ID;
    }

    public static void setBaseId(String baseId) {
        BASE_ID = baseId;
    }

    public Connection getConnection() {
        return connection;
    }

    public BaseEntity setConnection(Connection connection) {
        this.connection = connection;
        return this;
    }
    //------------
    public Connection closesConnection(){
        connection= null;
        return  connection;
    }
    //-----------

    public String getTableName() {
        return tableName;
    }

    public BaseEntity setTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }

    public String getDefaultQuery() {

        return BASE_QUERY + getTableName();
    }

    public String getDefaultIdQuery() {

        return BASE_ID + getTableName();
    }



    public boolean change(String sql) {
        try {
            int result = getConnection().createStatement().executeUpdate(sql);
            return result > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }



}
