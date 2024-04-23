package utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbUtilMySql {

    public enum ConnectionType {
        MSSQL,MYSQL,ORACLEDB

    }

    public Connection connectToDB(String dbUrl, String dbPort, String userName, String password,
                                  String defaultDB, ConnectionType connectionType){

        String JTDS_Driver = "net.source.jtds.Driver"; // For MSSQL

        String MYSQL_Driver = "com.mysql.cj.jdbc.Driver"; // For MYSQL

        Connection connection = null;

        switch (connectionType){
            case MYSQL :
                try {
                    Class.forName(MYSQL_Driver); // For Active Driver
                } catch (ClassNotFoundException e) {
                    throw new RuntimeException(e);
                }

                // For Connect DataBase Server
                String mySQLConnectPath = "jdbc:mysql://" + dbUrl + ":" + dbPort + "/" + defaultDB + "?useSSL=false";

                try {
                    connection = DriverManager.getConnection(mySQLConnectPath,userName,password);
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
                try {
                    if (!connection.isClosed()) {
                        System.out.println("DataBase Connection is Established Successfully!!");
                    }
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
                break;

            case MSSQL:
                try {
                    Class.forName(JTDS_Driver);
                } catch (ClassNotFoundException e) {
                    throw new RuntimeException(e);
                }

                String connectionPath = "jdbc:jtds:sqlserver://" + dbUrl + ":" + dbPort +  ";dataBaseName=" + defaultDB;

                try {
                    connection = DriverManager.getConnection(connectionPath,userName,password);
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
                break;

        }
        return connection;

    }


}
