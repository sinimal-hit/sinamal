package org.example.dao;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import org.example.model.Article;
import org.example.util.DBUtil;

import javax.sql.DataSource;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ArticleDAO {
    public static List<Article> query(int useId) throws SQLException {
        //jdbc 查询用户关联的文章列表
        //1:创建连接 Connection对象
        Connection connection = DBUtil.getConnection();
        //2:根据连接 创建操作命令对象 Statement
        String sql = "select id,title from article where user_id=?";
        PreparedStatement ps = connection.prepareStatement(sql);

        //替换占位符的值,第一个参数表示占位符的索引(从1开始),第二个参数是需要替换的值,
        ps.setInt(1,useId);

        //3:执行sql
        ResultSet resultSet = ps.executeQuery();
        List<Article> query = new ArrayList<>();
        //4:如果查询操作,处理结果集 把提取中的结果集放到List当中
        while (resultSet.next()){
            int id = resultSet.getInt("id");//获取id字段的值
            String title = resultSet.getString("title");
            //每一行数据对应一个独享
            Article article = new Article();
            article.setId(id);
            article.setTitle(title);
            query.add(article);
        }
        //5:释放资源
        DBUtil.close(connection, ps, resultSet);
        return query;
    }




    public static void main(String[] args) throws SQLException {
        System.out.println(query(1));
    }

    public static int insert(Article article,Integer user_id) throws SQLException {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        try{

            connection = DBUtil.getConnection();

            String sql = "insert into article(title, content,user_id) values(?,?,?)";
            preparedStatement = connection.prepareStatement(sql);
            //替换占位符,在执行sql
            preparedStatement.setString(1,article.getTitle());
            preparedStatement.setString(2,article.getContent());
            preparedStatement.setInt(3,article.getUserId());

            return preparedStatement.executeUpdate();
        }catch (Exception e){

            e.printStackTrace();
            System.out.println("sql语句插入失败");
            return 0;
        }finally {
            DBUtil.close(connection,preparedStatement);
        }
    }

    public static Article queryById(int id) throws SQLException {
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        try {
            connection = DBUtil.getConnection();
            String sql = "select * from article where id=?";
            statement = connection.prepareStatement(sql);
            statement.setInt(1,id);
            resultSet = statement.executeQuery();
            Article article = null;
            while (resultSet.next()){
                article = new Article();
                article.setId(id);
                article.setTitle(resultSet.getString("title"));
                article.setContent(resultSet.getString("content"));

            }
            return article;
        }finally {
            DBUtil.close(connection,statement,resultSet);
        }
    }

    public static int update(Article article) throws SQLException {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        try{

            connection = DBUtil.getConnection();
            //修改操作
            String sql = "update article set title=?,content=? where id=?";
            preparedStatement = connection.prepareStatement(sql);

            //替换占位符,在执行sql
            preparedStatement.setString(1,article.getTitle());
            preparedStatement.setString(2,article.getContent());
            preparedStatement.setInt(3,article.getId());


            return preparedStatement.executeUpdate();
        }catch (Exception e){

            e.printStackTrace();
            System.out.println("sql语句插入失败");
            return 0;
        }finally {
            DBUtil.close(connection,preparedStatement);
        }
    }

    public static int delete(String[] ids) throws SQLException {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        try{

            connection = DBUtil.getConnection();
            //修改操作
            StringBuilder sql = new StringBuilder("delete from article where id in (");
            for(int i = 0; i < ids.length; i++){
                if(i != 0){
                    sql.append(",");

                }else {
                    sql.append("?");
                }
            }
            sql.append(")");
            preparedStatement = connection.prepareStatement(sql.toString());
            for (int i = 0; i <ids.length ; i++) {
                //数组索引从0开始,占位符替换的方法从1开始
                preparedStatement.setInt(i + 1,Integer.parseInt(ids[i]));
            }
            //先替换占位符的值,在执行sql
            //替换占位符,在执行sql
            return preparedStatement.executeUpdate();
        }catch (Exception e){

            e.printStackTrace();
            System.out.println("sql语句插入失败");
            return 0;
        }finally {
            DBUtil.close(connection,preparedStatement);
        }
    }
}
