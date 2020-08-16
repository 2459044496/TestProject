package oracle.docs.demo;

/**
 * @Desc:TODO
 * @author: Cui Pai
 * @date 2020/1/4 17:18
 */
public class MountainBike extends Bicycle{

    //座位高度
    private int seatHeight;

    public MountainBike(int startSeatHeight,int startCadence,int startGear,int startSpeed) {
        super(startCadence,startGear,startSpeed);
        seatHeight = startSeatHeight;
    }

    public void setHeight(int newValue) {
        seatHeight = newValue;
    }

}
