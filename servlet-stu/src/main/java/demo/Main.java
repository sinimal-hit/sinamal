package demo;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.example.servlet.User;

public class Main {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException, ClassNotFoundException, JsonProcessingException {
//        Class<Main> c = Main.class;
//        //基于Class对象可以实例化一个对象
//
//        Class c2 = Class.forName("java.lang.String");
//
//
//        Object o = c.newInstance();
//        //运行时动态的获取信息,方法,字段的信息


        //序列化操作:java对象转变为json字符串
        ObjectMapper mapper = new ObjectMapper();
        User user = new User();
        user.setUsername("猴哥");
        user.setPassword("悟空,快来救我");
        String json = mapper.writeValueAsString(user);
        System.out.println(json);


        //反序列化:把json字符串转为java对象
        String  s = "{\"username\":\"猴哥\",\"password\":\"悟空,快来救我\"}";
        User u2 = mapper.readValue(s,User.class);
        System.out.println(u2);
    }
}
