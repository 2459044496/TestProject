package test.ioc;

/**
 * @Desc:TODO
 * @author: Cui Pai
 * @date 2020/2/4 10:53
 */
public class UserDaoImpl implements UserDao {
    @Override
    public void login() {
        System.out.println("登录成功");
    }
}
