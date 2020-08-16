package oracle.docs.demo;

import lombok.Data;

/**
 * @Desc:TODO
 * @author: Cui Pai
 * @date 2020/1/4 17:08
 * 自行车
 */
@Data
public class Bicycle {

    int a;
    protected int b;

    //终止
    private int cadence;
    //齿轮
    private int gear;
    //速度
    private int speed;

    public Bicycle(int startCadence,int startGear,int startSpeed) {
        cadence = startCadence;
        gear = startGear;
        speed = startSpeed;
    }


}
