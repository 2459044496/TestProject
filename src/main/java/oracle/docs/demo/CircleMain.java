package oracle.docs.demo;

import java.util.Arrays;

/**
 * @Desc:TODO
 * @author: Cui Pai
 * @date 2020/1/4 18:01
 */
public class CircleMain {

    public static void main(String[] args) {
        /*Circle myCircle = new Circle(10,10);
        moveCircle(myCircle,1,1);
        System.out.println(myCircle.toString());*/
        String a = "aa";
        a.compareToIgnoreCase(a);

        String[] stringArray = { "Barbara", "James", "Mary", "John",
                "Patricia", "Robert", "Michael", "Linda" };
        Arrays.sort(stringArray, String::compareToIgnoreCase);
        //调用String.compareToIgnoreCase参数是strignArray


    }

    /*public static Circle moveCircle(Circle circle,int x,int y) {
        System.out.println(circle.toString());
        circle.setX(circle.getX()+x);
        circle.setY(circle.getY()+y);

        return circle;
    }*/
}
