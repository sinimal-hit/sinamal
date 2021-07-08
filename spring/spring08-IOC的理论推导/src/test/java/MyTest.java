import com.doer.dao.JavaUserDaoImpl;
import com.doer.service.UserService;
import com.doer.service.UserServiceImpl;
import org.junit.Test;

public class MyTest {
    @Test
    public void test(){
        //用户实际调用的是业务层,dao层用户不需要接触 业务层只做一个事情,调用DAO层 增删改查
        UserService userService = new UserServiceImpl();
        ((UserServiceImpl) userService).setUserDao(new JavaUserDaoImpl());
        userService.getUser();
    }
}
