package test.generic;

/**
 * @Desc:TODO
 * @author : Cui Pai
 * @date 2019/12/4 22:50
 */
public class Square extends Shape {
    @Override
    public void erase() {
        System.out.println("I am Square,erase");
    }

    @Override
    public void draw() {
        System.out.println("I am Square,draw");
    }
}
