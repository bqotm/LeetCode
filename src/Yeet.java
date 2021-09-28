import java.util.Scanner;

class Yeet {

    public static void main(String[] args) {

        System.out.println(myPow(1.00000
                ,-2147483648));
    }

    public static double myPow(double x, int n) {
        double ans=1.0;
        int a=(n<0) ? -n : n;
        while(a!=0) {
            if(a%2==0){
                x=x*x;
                a=a>>1;
            } else {
                ans=ans*x;
                a=a-1;
            }
        }
        if(n<0)
            return (double)1/ans;
        return ans;
    }


}
