public class Nth_tribonacci {

    public static int tribonacci(int n) {

        int[] trib=new int[38];
        trib[0]=0;
        trib[1]=trib[2]=1;
        if(n<3)
            return trib[n];
        for(int i=3; i<=n; i++){
            trib[i]=trib[i-1]+trib[i-2]+trib[i-3];
        }
        return trib[n];
    }

    public static int fib(int n) {
        int[] fib=new int[n+2];
        fib[0]=0;
        fib[1]=1;
        for(int i=2; i<=n; i++){
            fib[i]=fib[i-1]+fib[i-2];
        }
        return fib[n];
    }

    public static void main(String[] args) {
        System.out.println(tribonacci(2));
    }

}
