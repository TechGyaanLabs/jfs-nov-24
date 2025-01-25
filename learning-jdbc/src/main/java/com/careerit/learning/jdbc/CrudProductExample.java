package com.careerit.learning.jdbc;

import java.sql.*;
import java.util.UUID;

public class CrudProductExample {

    public static void main(String[] args) {
        //createProductTable();
       /* Product product = new Product();
        product.setName("iPhone16 ProMax");
        product.setPrice(145000);
        addProduct(product);*/
        //showAllProducts();
        Product product = getProduct(UUID.fromString("643bada8-82f6-43ac-abe6-91d33b120adf"));
        product.setPrice(120000);
        product.setName("iPhone 16 ProMax with 256GB");
        updateProduct(product);
    }
    public static void createProductTable(){
        String sql = """
                CREATE TABLE IF NOT EXISTS product (
                     id UUID DEFAULT uuid_generate_v4() PRIMARY KEY,
                     name VARCHAR(50),
                     price FLOAT
                 );
                """;
        Connection con = null;
        Statement st = null;
        try{
            con = DbConnectionUtil.getConnection();
            st = con.createStatement();
            boolean isCreated = st.execute(sql);
            System.out.println("Table creation status : "+isCreated);
        }catch (SQLException e){
            e.printStackTrace();
        }finally {
            DbConnectionUtil.close(st,con);
        }

    }
    public static void addProduct(Product product){
        String sql = "INSERT INTO product (name,price) VALUES (?,?)";
        Connection con = null;
        PreparedStatement st = null;
        try{
            con = DbConnectionUtil.getConnection();
            st = con.prepareStatement(sql);
            st.setString(1,product.getName());
            st.setDouble(2,product.getPrice());
            int count = st.executeUpdate();
            System.out.println("No of records inserted : "+count);

        }catch (SQLException e){
            e.printStackTrace();
        }finally {
            DbConnectionUtil.close(st,con);
        }

    }

    public static void updateProduct(Product product){
        String sql = "update product set name = ?, price = ? where id = ?";
        Connection con = null;
        PreparedStatement st = null;
        try{
            con = DbConnectionUtil.getConnection();
            st = con.prepareStatement(sql);
            st.setString(1,product.getName());
            st.setDouble(2,product.getPrice());
            st.setObject(3,product.getId());
            int count = st.executeUpdate();
            System.out.println("No of records updated : "+count);
        }catch (SQLException e){
            e.printStackTrace();
        }finally {
            DbConnectionUtil.close(st,con);
        }
    }

    public static Product getProduct(UUID id){
        String sql = "select id,name,price from product where id = ?";
        Connection con = null;
        PreparedStatement st = null;
        ResultSet rs = null;
        try {
            con = DbConnectionUtil.getConnection();
            st = con.prepareStatement(sql);
            st.setObject(1,id);
            rs = st.executeQuery();
            if(rs.next()){
                Product product = new Product();
                product.setId(UUID.fromString(rs.getString("id")));
                product.setName(rs.getString("name"));
                product.setPrice(rs.getDouble("price"));
                return product;
            }
            throw new RuntimeException("Product with id : "+id+" not found");
        }catch (SQLException e){
            e.printStackTrace();
        }
        return null;
    }

    public static void deleteProduct(UUID id){
        String sql = "delete from product where id = ?";
        Connection con = null;
        PreparedStatement st = null;
        try {
            con = DbConnectionUtil.getConnection();
            st = con.prepareStatement(sql);
            st.setObject(1, id);
            int count = st.executeUpdate();
            System.out.println("No of records deleted : " + count);
        }catch (SQLException e){
            e.printStackTrace();
        }finally {
            DbConnectionUtil.close(st,con);
        }
    }

    public static void showAllProducts(){
        String sql = "select id,name,price from product";
        Connection con = null;
        Statement st = null;
        ResultSet rs = null;
        try{

            con = DbConnectionUtil.getConnection();
            st = con.createStatement();
            rs = st.executeQuery(sql);
            while(rs.next()){
                UUID id = UUID.fromString(rs.getString("id"));
                String name = rs.getString("name");
                double price = rs.getDouble("price");
                System.out.println(id+","+name+","+price);
            }

        }catch (SQLException e){
            e.printStackTrace();
        }finally {
            DbConnectionUtil.close(rs,st,con);
        }
    }

}
