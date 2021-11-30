package stuff;

public class FastFourierTransform {


    /*
            assumption : N is a power of 2
            X[k]=sum(n : 0->N-1) : x[n]*exp(-i*2*pi*n*k/N)
     */

    public static Complex[] FFT(Complex[] x){
        int n=x.length;
        if(n==1)
            return new Complex[]{x[0]};
        if(!(n>0 &&((n&(n-1))==0)))
            throw new IllegalArgumentException("n is not a power of 2");
        Complex[] even=new Complex[n/2];
        for (int i = 0; i < n/2; i++) {
            even[i]=x[2*i];
        }
        Complex[] evenFFT=FFT(even);
        Complex[] odd =even;
        for (int i = 0; i < n/2; i++) {
            odd[i] = x[2*i+1];
        }
        Complex[] oddFFT = FFT(odd);

        Complex[] X=new Complex[n];
        for (int i = 0; i < n/2; i++) {
            double THETA=-2*Math.PI*i/n;
            Complex omega=new Complex(Math.cos(THETA), Math.sin(THETA));
            X[i]=evenFFT[i].plus(omega.multiply(oddFFT[i]));
            X[i+n/2]=evenFFT[i].minus(omega.multiply(oddFFT[i]));
        }
        return X;
    }

    public static void main(String[] args) {
        Complex[] x=new Complex[2];
        Double[] doubles=new Double[]{
                -0.03480425839330703,
                0.07910192950176387,
        };
        for (int i = 0; i < 2; i++) {
            x[i]=new Complex(doubles[i], 0);
        }

        Complex[] X=FFT(x);
        for (int i = 0; i < 2; i++) {
            System.out.println(X[i]);
        }
    }



}
