package test.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Desc:TODO
 * @author: Cui Pai
 * @date 2020/2/4 10:55
 */
public class TestMa {
    public static void main(String[] args) {
        ApplicationContext appletContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserDao userDao = (UserDao) appletContext.getBean("UserDao");
        userDao.login();
    }
}
