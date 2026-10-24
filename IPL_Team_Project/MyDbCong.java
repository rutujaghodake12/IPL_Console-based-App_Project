package IPL_Team_Project;

import java.sql.Connection;
import java.sql.DriverManager;

public class MyDbCong {

    public static Connection getMySQLDbConnection() {
        String url = "jdbc:mysql://localhost:3306/ipl1?createDatabaseIfNotExist=true";
        String user = "root";
        String password = "CurrentPassMysql#123";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            return DriverManager.getConnection(url, user, password);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}