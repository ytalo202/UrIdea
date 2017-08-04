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

    private static String Base_Avg= "select id_user_employee, id_company, avg(grade),avg(grade1)," +
            "avg(grade2),avg(avg_grade) from ";


    private static String Base_Email= "select id from ";

    private static String Base_Evaluation= "SELECT id,from_unixtime( UNIX_TIMESTAMP(  evaluation_date_and_time),'%Y')," +
            " from_unixtime( UNIX_TIMESTAMP(  evaluation_date_and_time),'%m'),from_unixtime( UNIX_TIMESTAMP(  evaluation_date_and_time),'%d')" +
            " from ";


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



    public static String getBase_Avg() {
        return Base_Avg;
    }

    public static void setBase_Avg(String base_Avg) {
        Base_Avg = base_Avg;
    }

    public static String getBase_Email() {
        return Base_Email;
    }

    public static void setBase_Email(String base_Email) {
        Base_Email = base_Email;
    }

    public static String getBase_Evaluation() {
        return Base_Evaluation;
    }

    public static void setBase_Evaluation(String base_Evaluation) {
        Base_Evaluation = base_Evaluation;
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

    public String getDefaultAgvQuery() {

        return  Base_Avg+ getTableName();
    }

    public String getDefaultEmailQuery() {

        return  Base_Email+ getTableName();
    }

    public String getDefaultEvaluationQuery() {

        return  Base_Evaluation+ getTableName();
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
