import com.doer.dao.BlogMapper;
import com.doer.pojo.Blog;
import com.doer.utils.IDUtils;
import com.doer.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.*;

public class MyTest {

    @Test
    public void addBlog(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
        Blog blog = new Blog();
        blog.setId(IDUtils.getId());
        blog.setTitle("Mybatis");
        blog.setAuthor("狂神说");
        blog.setCreateTime(new Date());
        blog.setViews(9999);

        mapper.addBlog(blog);

        blog.setId(IDUtils.getId());
        blog.setTitle("Java");
        mapper.addBlog(blog);

        blog.setId(IDUtils.getId());
        blog.setTitle("Spring");
        mapper.addBlog(blog);

        blog.setId(IDUtils.getId());
        blog.setTitle("微服务");
        mapper.addBlog(blog);

        sqlSession.close();
    }

    @Test
    public void queryBlogIf(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
        Map map = new HashMap();
//        map.put("title","Mybatis");
        map.put("author","狂神说");
        List<Blog> blogs = mapper.queryBlogIf(map);
        for (Blog blog : blogs) {
            System.out.println(blog);
        }
        sqlSession.close();
    }

    @Test
    public void queryBlogChoose(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
        Map map = new HashMap();
        map.put("title","Mybatis");
        map.put("author","狂神说");
        List<Blog> blogs = mapper.queryBlogChoose(map);
        for (Blog blog : blogs) {
            System.out.println(blog);
        }
        sqlSession.close();
    }

    @Test
    public void updateBlog(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
        mapper.updateBlog(new Blog("c78a6f45a8da4fe8bb29dbf0c2c01816","三月","doer",new Date(),1114));
        sqlSession.commit();
        sqlSession.close();

    }
    @Test
    public void queryBlogForEach(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
        Map map = new HashMap();
        ArrayList<Integer> ids = new ArrayList<Integer>();
        //ids.add(1);
        ids.add(2);
        ids.add(3);
        map.put("ids",ids);

        List<Blog> blogs = mapper.queryBlogForEach(map);
        for (Blog blog : blogs) {
            System.out.println(blog);
        }
        sqlSession.close();
    }
}
