public class AngleBetweenHands {


    public double angleClock(int hour, int minutes) {
        double deviation=30./(60./minutes);
        if((hour*5)%60>minutes)
            deviation*=-1;
        double res=Math.abs((hour*5)%60-minutes)*6-deviation;
        res=res%360;
        return (res>180) ? 360-res : res;

    }

}
