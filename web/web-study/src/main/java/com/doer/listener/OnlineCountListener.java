package com.doer.listener;

import javax.servlet.ServletContext;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;
@WebListener("/")
//统计网站在线人数
public class OnlineCountListener implements HttpSessionListener {


    //创建session的监听
    //一旦创建一个session就会出发一次这个
    @Override
    public void sessionCreated(HttpSessionEvent se) {
        ServletContext context = se.getSession().getServletContext();
        Integer onlineCount =(Integer) context.getAttribute("OnlineCount");
        if(onlineCount == null){
            onlineCount = new Integer(1);
        }else {
            int count = onlineCount.intValue();
            onlineCount = new Integer(count+ 1);
        }
        context.setAttribute("OnlineCount",onlineCount);
    }

    //销毁session的监听
    //一旦Session销毁就会出发这一次事件
    @Override
    public void sessionDestroyed(HttpSessionEvent se) {
        ServletContext context = se.getSession().getServletContext();
        Integer onlineCount =(Integer) context.getAttribute("OnlineCount");
        if(onlineCount == null){
            onlineCount = new Integer(0);
        }else {
            int count = onlineCount.intValue();
            onlineCount = new Integer(count-1);
        }
        context.setAttribute("OnlineCount",onlineCount);
    }
}
