package oracle.docs.demo2;

/**
 * @Desc:TODO
 * @author: Cui Pai
 * @date 2020/1/5 19:17
 */
public abstract class GraphicObject {
    int x, y;

    void moveTo(int newX, int newY) {

    }
    abstract void draw();
    abstract void resize();
}
