package testcollection;

/**
 * @Desc:TODO
 * @auther: Cui Pai
 * @date 2019/12/3 22:36
 */
public class MyClass {

    static int x = 99;
    int y = 100;

    public static void showx() {
        int x = 9;
        System.out.println("x is" +x);
        System.out.println("MyClass.x is" + MyClass.x);
    }

    public void showy() {
        int y = 10;
        System.out.println("y is"+y);
        System.out.println("this.y is"+this.y);
    }

}
