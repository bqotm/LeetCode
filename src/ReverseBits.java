public class ReverseBits {



    public static int reverseBits(int n) {
        /*String op = String.format("%32s", Integer.toBinaryString(n)).replace(' ', '0');
        op = new StringBuilder(op).reverse().toString();
        return Integer.parseUnsignedInt(op, 2);*/
        int rev = 0;
        for (int i = 0; i < 32; i++) {
            rev = ( rev << 1 ) | ( n & 1 );
            n = n >> 1;
        }
        return rev;
    }

    public static void main(String[] args) {
        System.out.println(reverseBits(43261596));
        int n=43261596;
        System.out.println(Integer.toBinaryString(n));
        System.out.println(Integer.toBinaryString(reverseBits(n)));
    }


}
