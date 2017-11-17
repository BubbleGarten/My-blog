package bean;

import annotation.Column;
import annotation.Table;

@Table(tableName = "t_user")
public class User {
	@Column(type = "varchar(100)" ,field = "id" ,primaryKey = true ,defaultNull = false)
	public int id;
	
	@Column(type = "VARCHAR(20)", field = "username")
	public String name;
	
	@Column(type = "VARCHAR(20)", field = "password")
	public String password;
	
	@Column(type = "datetime", field = "create_time")
	private String createTime;//创建时间
	
	@Column(type = "timestamp", field = "update_time")
	private String updateTime;//最后更新时间
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password= password;
	}
	public String getCreateTime() {
		return createTime;
	}
	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}
	public String getUpdateTime() {
		return updateTime;
	}
	public void setUpdateTime(String updateTime) {
		this.updateTime = updateTime;
	}
}
    
