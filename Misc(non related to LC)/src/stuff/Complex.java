package stuff;

import java.util.Objects;

public class Complex {

    double re;
    double im;

    public Complex(){this.re=0.0;this.im=0.0;}
    public Complex(double re, double im){
        this.re=re;
        this.im=im;
    }

    public Complex plus(Complex z){
        Complex res=new Complex(this.re, this.im);
        res.re+=z.re;
        res.im+=z.im;
        return res;
    }

    public Complex minus(Complex z){
        Complex res=new Complex(this.re, this.im);
        res.re-=z.re;
        res.im-=z.im;
        return res;
    }

    public Complex multiply(Complex z){
        Complex res=new Complex();
        res.re=this.re*z.re-this.im*z.im;
        res.im=this.re*z.im+this.im*z.re;
        return res;
    }

    public double absVal(){
        return Math.sqrt(this.re*this.re+this.im*this.im);
    }

    public Complex scale(double coeff){
        Complex res=this;
        res.re*=coeff;
        res.im*=coeff;
        return res;
    }

    @Override
    public String toString() {
        if(im==0)
            return re+"";
        if(re==0)
            return "i"+im;
        if(im<0)
            return re+" - "+(-im)+"i";
        return re+" + "+im+"i";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Complex complex = (Complex) o;
        return Double.compare(complex.re, re) == 0 && Double.compare(complex.im, im) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(re, im);
    }

    public static void main(String[] args) {
        Complex a=new Complex(1, 2);
        Complex b=new Complex(0.5, 3);
        System.out.println(a.multiply(b));
        System.out.println(a.scale(0.5));

    }


}
