package oracle.docs.demo1;

/**
 * @Desc:TODO
 * @author: Cui Pai
 * @date 2020/1/5 18:12
 */
public interface Interface1 {
    public int jisuan1();
    default boolean did(int i){
        return false;
    }
}
