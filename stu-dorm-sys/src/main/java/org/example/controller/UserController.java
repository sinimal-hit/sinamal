package org.example.controller;

import org.example.exception.AppException;
import org.example.model.User;
import org.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    /**
     * 登录接口：
     * POST api/user/login
     * {username: "abc", password: "111", rememberMe: "true"}
     * 其中rememberMe代表免登陆
     *
     * User类没有rememberMe字段，需要添加
     */
    @PostMapping("/login")
    public Object login(@RequestBody User input,
                        HttpServletRequest req,
                        HttpServletResponse resp){
       //通过用户输入的账号在数据库查询对应的用户
        User query = userService.queryByUsername(input.getUsername());
        if(query == null)
            throw new AppException("账号不存在");
        if(!query.getPassword().equals(input.getPassword()))
            throw new AppException("账号或密码错误");
        //账号密码校验通过
        //创建session对象，并保存用户信息
        HttpSession session = req.getSession();
        session.setAttribute("user", query);
        //如果选择了免登陆，要设置Cookie（响应Set-Cookie头: 键=值）
        if(input.getRememberMe() != null && input.getRememberMe()) {
            Cookie username = new Cookie("username", query.getUsername());
            Cookie password = new Cookie("password", query.getPassword());
            username.setDomain("localhost");
            username.setPath("/");
            username.setMaxAge(60 * 60 * 24 * 7);//7天免登陆
            password.setDomain("localhost");
            password.setPath("/");
            password.setMaxAge(60 * 60 * 24 * 7);//7天免登陆
            resp.addCookie(username);
            resp.addCookie(password);
        }
        return 1;
    }

    @GetMapping("/query")
    public Object query(User user){
        List<User> list = userService.query(user);
        return list;
    }

    @GetMapping("/queryById")
    public Object queryById(Integer id){
        User user = userService.queryById(id);
        return user;
    }

    @PostMapping("/register")
    public Object add(@RequestBody User user){
        int n = userService.add(user);
        return null;
    }

    @PostMapping("/update")
    public Object update(@RequestBody User user){
        int n = userService.update(user);
        return null;
    }

    @GetMapping("/delete")
    public Object delete(@RequestParam List<Integer> ids){
        int n = userService.delete(ids);
        return null;
    }
}
