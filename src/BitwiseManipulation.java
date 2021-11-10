public class BitwiseManipulation {



    public static boolean isPowerof2(int x){

        /*if(x!=0 && ((x&(x-1))==0))
            return true;
        return false;*/

        return x>0 &&((x&(x-1))==0);

    }

    public int hammingWeight(int n) {
        int s=0;
        while(n!=0){
            n=n&(n-1);
            s++;
        }
        return s;
    }





    public static int rightMost1(int x){
        return x^(x&(x-1));
    }

    public static void main(String[] args) {
        int a=10>>2;
        //System.out.println(a);
        //System.out.println(isPowerof2(15));
        /*String x="1000";
        int dec_x=Integer.parseInt(x,2);
        String x_1=Integer.toString(dec_x-1,2);
        int dec_x_1=Integer.parseInt(x_1, 2);
        int res=dec_x&dec_x_1;
        String re=Integer.toString(res, 2);
        System.out.println(dec_x+" "+x);
        System.out.println(dec_x_1+" "+x_1);
        System.out.println(res+" "+re);
        System.out.println(dec_x^res);
        System.out.println(rightMost1(24));*/

        int mask=1<<8;
        String mas=Integer.toString(mask, 2);
        System.out.println(mas);
        System.out.println(mask);

    }


}
