package com.careerit.learning.jdbc;

import java.sql.*;

public class DbConnectionUtil {


    public static Connection getConnection(){
        String url = "jdbc:postgresql://dpg-cu7eqoij1k6c73fkjdgg-a.oregon-postgres.render.com:5432/jan_jfs_25_db";
        String username = "dbuser";
        String password = "XkA0wgU54PYLQb6f07p2IrBp4Js3z3a6";
        try{
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
