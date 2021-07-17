package com.doer.dao;

import com.doer.pojo.Blog;

import java.util.List;
import java.util.Map;

public interface BlogMapper {
    //插入数据
    int addBlog(Blog blog);

    //查询博客,如果传入的是一个title就查询title对应的博客,如果是什么都不传入,将所有博客查询出来
    List<Blog> queryBlogIf(Map map);


    List<Blog> queryBlogChoose(Map map);

    int updateBlog(Blog blog);

    List<Blog> queryBlogForEach(Map map);

}
