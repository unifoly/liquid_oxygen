package com.unifoly.ppl.register;

import com.unifoly.ppl.utils.JDBCUtils;
/**
@author lenovo
**/

public class RegisterDao extends JDBCUtils {
    public int register(User user){
        String sql = "insert into user(username,password,email) value(?,?,?)";
        return super.executeUpdate(sql, user.getUsername(), user.getPassword(), user.getEmail());
    }
}
