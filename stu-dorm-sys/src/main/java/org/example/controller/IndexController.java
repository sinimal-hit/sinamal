package org.example.controller;

import org.example.model.User;
import org.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller

public class IndexController {

    @Autowired
    private UserService userService;

    /**
     * 登录页面，在Controller中自行处理
     * （1）通过request.getCookies()获取请求携带的所有cookie
     *      再遍历获取登录时设置的账号密码
     * （2）根据Cookie携带的账号密码去数据库查询
     * （3）查询到，表示是记住我，返回首页，否则返回登录页面
     */
    @GetMapping({"/", "/index.html"})
    public String index(HttpServletRequest req){
        Cookie[] cookies = req.getCookies();
        if(cookies != null){
            //临时变量保存账号和密码
            String username = null;
            String password = null;
            for(Cookie c : cookies){
                if("username".equals(c.getName())){
                    username = c.getValue();
                }
                if("password".equals(c.getName())){
                    password = c.getValue();
                }
            }
            //如果都有值，在数据库查询
            if(username != null & password != null){
                User condition = new User();
                condition.setUsername(username);
                condition.setPassword(password);
                User query = userService.queryOne(condition);
                if(query != null){//Cookie携带的账号密码是正确的
                    //返回首页: 因为首页会执行拦截器会话校验，所以这里也要保存session
                    HttpSession session = req.getSession();
                    session.setAttribute("user", query);
                    return "redirect:/page/main.html";
                }
            }
        }
        //其他情况，返回登录页面
        return "forward:/page/index.html";
    }
}
