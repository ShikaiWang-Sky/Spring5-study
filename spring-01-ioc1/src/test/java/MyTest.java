import com.wang.service.UserServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {

    @Test
    public void Test() {
        //获取ApplicationContext, 拿到spring的容器
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        //需要什么就直接get什么,getBean("")里面放在xml中的id的名字!
        UserServiceImpl userServiceImpl = (UserServiceImpl) context.getBean("userServiceImpl");

        userServiceImpl.getUser();
    }

}
