package test;

import java.util.UUID;

import org.junit.Test;

import util.DataBaseUtils;

public class TestInsertOperation {
	/**
	 *  测试：给文章插入数据
	 */
	@Test
	public void insertArticle(){
		String sql = "INSERT INTO t_article(id,header,name,content,author,"
	            + "isDelete,create_time,"
	            + "user_id,category_id) VALUES (?,?,?,?,?,?,?,?,?) ";
	String id = UUID.randomUUID().toString(); //主键
	String header = "Java Web实用技术";
	String name  = "如何将MyEclipse项目导入eclipse";
	String content = "我们经常会在网上下载一些开源项目，或者从别的地方迁移一些项目进来，但经常会发现导入后各种报错。这是初学java肯定会遇到的问题，本文对一些常见的处理方案做一个总结。（本文将MyEclipse项目导入eclipse的过程为例，其他情况也可参考这个流程）";
	String author = "Jack";
	int isDelete = 0;
	String create_time = "2016-10-19 10:43:10";
	String userId = "319600c3-550a-4f9f-80cf-deebe2376528";
	int categoryId = 2;
	DataBaseUtils.update(sql, id,header,name,content,author,isDelete,create_time,userId,categoryId);
	System.out.println("新增成功！");
	}
}
