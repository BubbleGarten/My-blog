package bean;

import java.util.Date;
import annotation.Column;
import annotation.Table;

@Table(tableName = "t_article")
public class Article {

@Column(type = "varchar(100)" ,field = "id" ,primaryKey = true ,defaultNull = false)
	private String id;

@Column(type="VARCHAR(100)" ,field="header")
	private String header;

@Column(type="VARCHAR(100)" ,field="name")
	private String name;

@Column(type="text(10000)" ,field="content")
	private String content;

@Column(type="VARCHAR(100)" ,field="author")
	private String author;

@Column(type="int(1)" ,field="isDelete")
	private int isDelete;

@Column(type = "datetime", field = "create_time")
	private Date createTime;

@Column(type = "varchar(100)" ,field = "userId")
	private int userId;

@Column(type = "int(3)" ,field = "categoryId")
	private int categoryId;
}
