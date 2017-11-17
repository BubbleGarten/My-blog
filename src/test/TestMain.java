package test;

import bean.Article;
import util.DataBaseUtils;
public class TestMain {
	public static void main(String[] args) {

    //String sql = TableUtils.getCreateTableSQl(User.class);
    //System.out.println(sql);
    
    //String sql = TableUtils.getCreateTableSQl(Article.class);
    //System.out.println(sql);

    String sql = "select * from t_article where id = ?";
    Article article = DataBaseUtils.queryForBean(sql, Article.class, "2145ed72-164a-401c-af29-248625a775b8");
    System.out.println(article);
}
}
