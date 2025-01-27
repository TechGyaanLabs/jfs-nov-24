package com.careerit.learning.jdbc;

import java.sql.*;
import java.util.Properties;

public class DbConnectionUtil {

    private static final Properties properties = new Properties();

    static {
        try{
            properties.load(DbConnectionUtil.class.getResourceAsStream("/application.properties"));
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static Connection getConnection(){
        try{
            String url = properties.getProperty("db.url");
            String username = properties.getProperty("db.username");
            String password = properties.getProperty("db.password");
            return DriverManager.getConnection(url,username,password);
        }catch (SQLException e) {
            e.printStackTrace();
        }
        throw new RuntimeException("Problem while connecting to database");
    }

    public static void close(ResultSet rs, Connection con){
        try{
            if(rs!=null){
                rs.close();
            }
            if(con != null){
                con.close();
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
    public static void close(ResultSet rs, Statement st, Connection con){
        try{
            if(rs!=null){
                rs.close();
            }
            if(st != null){
                st.close();
            }
            if(con != null){
                con.close();
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
    public static void close(Statement st, Connection con){
        try{
            if(st != null){
                st.close();
            }
            if(con != null){
                con.close();
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
}
