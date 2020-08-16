package test.test1;

/**
 * @Desc:TODO
 * @author: Cui Pai
 * @date 2020/3/31 18:00
 */
public class Son extends Father implements Father2{

    @Override
    public void back() {
        System.out.println("son back method()");
    }

    public void say() {
        System.out.println("son say method()");
    }
}
