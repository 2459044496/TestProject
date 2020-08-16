package test.generic;

/**
 * @Desc:TODO
 * @author: Cui Pai
 * @date 2019/12/4 22:52
 */
public class ma {

    public static void main(String[] args) {
        Integer integer1 = new Integer(33);
        Integer integer2 = new Integer(33);
        System.out.println(integer1.equals(integer2));
        Integer integer3 = 33;
        Integer integer4 = 33;
        System.out.println(integer3==integer4);
        System.out.println(1e-10);
        System.out.println(Integer.toBinaryString(-1));
        System.out.println(Integer.toBinaryString(1));
        Shape shape = new Shape();
        Square square = new Square();
        Circle circle = new Circle();
        doSomething(shape);
        doSomething(square);
        doSomething(circle);
    }

    static void doSomething(Shape shape) {
        shape.erase();
        shape.draw();
    }
}
