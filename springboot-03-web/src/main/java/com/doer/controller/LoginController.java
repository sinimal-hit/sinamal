package com.doer.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

@Controller
public class LoginController {
    @RequestMapping("/user/login")

    public String login(@RequestParam("username") String username,
                        @RequestParam("password") String password,
                        Model model,
                        HttpSession session) {


        /**
         * 具体的业务,用户登录的的密码只要是123456都可以登录成功,进入视图解析器中的main.html对应的网页,
         * 中间我们需要加入拦截器,如果不加入拦截器,用户可以直接访问main.html也可以进入登陆成功后
         * 的网页,对应LoginHandlerInterceptor
         */
        if (!username.isEmpty() && "123456".equals(password)) {
            session.setAttribute("loginUser", username);
            return "redirect:/main.html";
        } else {
            //告诉用户登陆失败
            model.addAttribute("msg", "用户名或者密码错误");
            return "index";
        }

    }
}
