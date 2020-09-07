import com.wang.pojo.Student;
import com.wang.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    @Test
    public void SpringTest() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Student student = (Student) context.getBean("student");
        System.out.println(student.toString());
    }

    @Test
    public void SpringTest2() {
        ApplicationContext context = new ClassPathXmlApplicationContext("userbeans.xml");
        //可以向getBean的第二个参数利用反射传入User的类型,这样就不用再进行类型转换
        User user = context.getBean("user", User.class);
        System.out.println(user.toString());
    }

    @Test
    public void SpringTest3() {
        ApplicationContext context = new ClassPathXmlApplicationContext("userbeans.xml");
        //可以向getBean的第二个参数利用反射传入User的类型,这样就不用再进行类型转换
        User user = context.getBean("user2", User.class);
        System.out.println(user.toString());
    }
}
