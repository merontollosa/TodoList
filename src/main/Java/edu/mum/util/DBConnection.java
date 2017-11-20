package edu.mum.util;
import java.sql.*;
import java.util.logging.*;
public class DBConnection {
    private static String db_url;
    private static String db_port;
    private static String db_name;
    private static String db_user;
    private static String db_password;
    private static Statement connection;
    private static DBConnection ourInstance = new DBConnection();

    public static DBConnection getInstance() {

            try {
                return DbSingletonManagerHolder.instance;
            } catch (ExceptionInInitializerError ex) {

            }
        return null;
    }

    private static class DbSingletonManagerHolder {
        private final static DBConnection instance = new DBConnection();
    }

    public static Statement getStatement() {
        return connection;
    }


    private DBConnection() {

    }
    private static Statement setConnection() {
        try {
            String url = "" + db_url + ":" + db_port + "/" + db_name + "";
            java.sql.Connection conn = DriverManager.getConnection(url, db_user, db_password);

            //Creation of the Statement object
             db_url = "jdbc:mysql://localhost";
            db_port = "3306";
            db_name = "taskdb";
            db_user = "root";
            db_password = "root";
            connection = setConnection();
            java.sql.Statement state = conn.createStatement();
            return  state;
        } catch (SQLException ex) {
            Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }



}
