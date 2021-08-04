package org.example.service;

import com.github.pagehelper.PageHelper;
import org.example.mapper.UserMapper;
import org.example.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;

    public User queryByUsername(String username) {
        User param = new User();
        param.setUsername(username);
        return userMapper.selectOne(param);
    }

    public User queryOne(User condition) {
        User param = new User();
        param.setUsername(condition.getUsername());
        param.setPassword(condition.getPassword());
        return userMapper.selectOne(param);
    }

    public List<User> query(User user) {
        PageHelper.startPage(user);
        return userMapper.selectAll();//可以自定义sql，根据searchText搜索
    }

    public User queryById(Integer id) {
        return userMapper.selectByPrimaryKey(id);
    }

    public int add(User user) {
        return userMapper.insertSelective(user);
    }

    public int update(User user) {
        return userMapper.updateByPrimaryKeySelective(user);
    }

    public int delete(List<Integer> ids) {
        return userMapper.deleteByIds(ids);
    }
}
