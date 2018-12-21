package com.neuedu.bm.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.neuedu.bm.entity.User;
import com.neuedu.bm.util.DBUtils;
import com.neuedu.bm.util.StringUtils;

public class UserDao extends DaoAdapter<User> {


	@Override
	public User findOne(User condition) {
		Connection conn =null;
		PreparedStatement ptmt = null;
		ResultSet rs=  null;
		StringBuilder sql = new StringBuilder("select * from bm_user where 1=1 ");
		List<Object> params = new ArrayList();
		try{
			
			if(StringUtils.isNotBlank(condition.getUsername())) {
				sql.append(" and username = ?");
				params.add(condition.getUsername());
			}
			if(StringUtils.isNotBlank(condition.getPassword())) {
				sql.append(" and password = ?");
				params.add(condition.getPassword());
			}
			if(StringUtils.isNotBlank(condition.getType())) {
				sql.append(" and user_type = ?");
				params.add(condition.getType());
			}
			
			conn = DBUtils.getConn();
			ptmt = conn.prepareStatement(sql.toString());
			for(int i = 0;i<params.size();i++) {
				ptmt.setObject(i+1, params.get(i));
			}
			rs = ptmt.executeQuery();
			
			while(rs.next()) {
				User user =new User(rs.getInt("id"),
						rs.getString("username"),
						rs.getString("password"),
						rs.getString("user_type"),
						rs.getInt("borrow_limit"),
						rs.getInt("borrow_count"));
				return user;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}
