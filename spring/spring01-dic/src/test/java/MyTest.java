import com.doer.Student;
import com.doer.User;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Student student = (Student) context.getBean("student");
        System.out.println(student.getName());

        System.out.println(student.toString());
        /*
        Student(name=朵儿,
                address=Address(address=null),
                books=[红楼梦, 西游记, 水浒传, 三国演义],
                hobbys=[听歌, 敲代码, 看电影],
                card={身份证=6101010, 银行卡=464546},
                game=[lol, coc, bob], wife=null,
                info={学号=18050412106, 性别=男, password=123456, username=root})
         */
    }
    @Test
    public void test01(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("userbeans.xml");
        User user = (User) context.getBean("user2");
        System.out.println(user.toString());
        User user2 = context.getBean("user2", User.class);
        System.out.println(user2.toString());
        System.out.println(user==user2);

    }
}
