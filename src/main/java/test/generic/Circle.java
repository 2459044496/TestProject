package test.generic;

/**
 * @Desc:TODO
 * @author: Cui Pai
 * @date 2019/12/4 22:50
 */
public class Circle extends Shape {
    @Override
    public void erase() {
        System.out.println("I am Circle,erase");
    }
    //被调用的重写实例方法的版本是子类中的版本。
    //被调用的隐藏静态方法的版本取决于是从超类还是从子类调用。
    //实例方法优于接口默认方法。
    //接口中的静态方法永远不会被继承。


/*    定义签名与超类方法相同的方法
                超类实例方法	    超类静态方法
    子类实例方法	覆写	        产生编译时错误
    子类静态方法	产生编译时错误	隐藏*/


}
