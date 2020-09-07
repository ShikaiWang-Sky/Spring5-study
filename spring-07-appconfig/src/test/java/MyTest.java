import com.wang.config.MyConfig;
import com.wang.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyTest {

    @Test
    public void Test1() {
        //如果完全使用了配置类方法去做, 我们就只能通过AnnotationConfig 上下文来获取容器, 通过配置类的class对象加载!
        ApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        User getUser = context.getBean("user", User.class);
        System.out.println(getUser.toString());
    }
}
