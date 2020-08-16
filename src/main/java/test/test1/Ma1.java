package test.test1;

/**
 * @Desc:TODO
 * @author: Cui Pai
 * @date 2020/3/31 18:13
 */
public class Ma1 {
    public static void main(String[] args) {
        Son son = new Son();
        System.out.println(son instanceof Father);
        System.out.println(son instanceof Father2);
        Father father = new Son();
        father.back();
        Integer integer1 = 1;
        Integer integer3 = Integer.valueOf(1);
        Integer integer4 = new Integer(1);
        System.out.println(integer1 == integer3);
        System.out.println(integer1 == integer4);
        Integer integer = 23;
        Long long1 = 24l;

        int a = -1;
        int b = 0;
        int c=  1;
        int d = 5;
    }
}
