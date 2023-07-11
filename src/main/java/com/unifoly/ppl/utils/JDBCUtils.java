package com.unifoly.ppl.utils;

import com.unifoly.ppl.utils.Log;

import java.sql.*;

/**
 * @author Lenovo
 */
public class JDBCUtils {
    public Connection getConnection(){
        String url="jdbc:mysql://localhost:3305/ppl";
        String username="root";
        String password="root";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn= DriverManager.getConnection(url,username,password);
            return conn;
        } catch (SQLException | ClassNotFoundException e) {
            Log.logger.error(e.getMessage(),e);
        }
        return null;
    }

    public ResultSet executeQuery(String sql,Object...params){
        Connection conn=this.getConnection();
        try {
            PreparedStatement pamt=conn.prepareStatement(sql);
            if (params!=null && params.length!=0){
                for (int i=0;i<params.length;i++){
                    pamt.setObject(i+1,params[i]);
                }
            }
            ResultSet rs=pamt.executeQuery();
            return rs;
        } catch (SQLException e) {
            Log.logger.error(e.getMessage(),e);
        }
        return null;
    }

    public int executeUpdate(String sql,Object...params){
        Connection conn=this.getConnection();
        try {
            PreparedStatement pamt=conn.prepareStatement(sql);
            if (params!=null && params.length!=0){
                for (int i=0;i<params.length;i++){
                    pamt.setObject(i+1,params[i]);
                }
            }
            int result=pamt.executeUpdate();
            return result;
        } catch (SQLException e) {
            Log.logger.error(e.getMessage(),e);
        }finally {
            try {
                conn.close();
            } catch (SQLException e) {
                Log.logger.error(e.getMessage(),e);
            }
        }
        return 0;
    }

    public void close(ResultSet rs){
        try {
            rs.getStatement().getConnection().close();
        } catch (SQLException e) {
            Log.logger.error(e.getMessage(),e);
        }
    }
}