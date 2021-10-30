public class SQRT {


    public static double _sqrt(int x) {
        double sqrt=x;
        for (int i = 0; i < 10; i++) {
            sqrt=0.5*(sqrt+x/sqrt);
        }
        return (int)sqrt;
    }


    public static void main(String[] args) {
        System.out.println(_sqrt(4));
        System.out.println(Math.sqrt(4));
    }


}
