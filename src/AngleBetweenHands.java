public class AngleBetweenHands {


    public double angleClock(int hour, int minutes) {
        double deviation=30./(60./minutes); // how much(in angle) the hour arrow id deviated from the exact position

        //if the hour arrow is following the minute's one then we have to add the deviation, else we substract it
        if((hour*5)%60>minutes)
            deviation*=-1;
        double res=Math.abs( Math.abs((hour*5)%60-minutes)*6-deviation )%360;
        return (res>180) ? 360-res : res;

    }

}
