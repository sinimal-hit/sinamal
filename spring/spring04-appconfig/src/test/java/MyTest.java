import com.doer.config.DoerConfig;
import com.doer.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyTest {
    @Test
    public void test01(){
        //如果完全使用了配置类方式去做,只能通过AnnotationConfig来获取上下文容器,通过配置类的class对象加载
        ApplicationContext context = new AnnotationConfigApplicationContext(DoerConfig.class);
        User user = context.getBean("user", User.class);
        System.out.println(user.getName());

    }
}
