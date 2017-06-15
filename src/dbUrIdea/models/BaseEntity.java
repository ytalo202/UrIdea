package dbUrIdea.models;

import java.sql.Connection;
/**
 * Created by Yoshinon on 15/06/2017.
 */
public class BaseEntity {
    private Connection connection;
    private static String BASE_QUERY = "SELECT * FROM ";
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

    public Connection getConnection() {
        return connection;
    }

    public BaseEntity setConnection(Connection connection) {
        this.connection = connection;
        return this;
    }

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



}
