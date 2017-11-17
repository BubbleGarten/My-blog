package test;

import java.sql.Connection;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import bean.User;
import util.DataBaseUtils;

public class TestDatabase {
	public static void main(String args[]) {
		DataBaseUtils.config("jdbc.properties");
		Connection conn = DataBaseUtils.getConnection();
		System.out.println(conn);
		
		String id = UUID.randomUUID() + "";
		String createTime = new SimpleDateFormat("yyyy-MM-dd").format(new Date());
		DataBaseUtils.update("INSERT INTO t_user(id,username,password,create_time,update_time)"
		        + "VALUES (?, ?, ?, ?, ?)", id,"张三",123456,createTime,null);
		
		DataBaseUtils.config("jdbc.properties");
		List list = DataBaseUtils.queryForList("select * from t_user");
		System.out.println(list);
		
		User user = DataBaseUtils.queryForBean("select * from t_user  limit 1", User.class);
		System.out.println(user);
	}
}
