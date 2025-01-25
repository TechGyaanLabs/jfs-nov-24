package com.careerit.learning.jdbc;

import java.sql.*;

public class PostgresqlConnectionExample {


    public static void main(String[] args) {

        String url = "jdbc:postgresql://dpg-cu7eqoij1k6c73fkjdgg-a.oregon-postgres.render.com:5432/jan_jfs_25_db";
        String username = "dbuser";
        String password = "XkA0wgU54PYLQb6f07p2IrBp4Js3z3a6";


        Connection con = null;
        Statement st = null;
        ResultSet rs = null;
        try{
            con = DriverManager.getConnection(url,username,password);
            DatabaseMetaData metaData = con.getMetaData();
            st = con.createStatement();
            rs = st.executeQuery("select name,country,role,team,price from player");
            while(rs.next()){
                String name = rs.getString("name");
                String country = rs.getString("country");
                String role = rs.getString("role");
                String team = rs.getString("team");
                double price = rs.getDouble("price");
                System.out.println(name+","+country+","+role+","+team+","+price);
            }


        }catch (Exception e){
            e.printStackTrace();
        }finally {
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
            }catch (Exception e){
                e.printStackTrace();
            }
        }


    }
}
