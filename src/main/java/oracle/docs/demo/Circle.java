package oracle.docs.demo;

import lombok.Data;

/**
 * @Desc:TODO
 * @author: Cui Pai
 * @date 2020/1/4 18:01
 */
@Data
public class Circle {

    private int x;

    private int y;

    public Circle(int x,int y) {
        this.x = x;
        this.y = y;
    }



}
