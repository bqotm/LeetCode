import java.util.Arrays;

public class PlusOne {

    /*

    [1,2,3]
    [1,2,4]
     */

    public static int[] plusOne(int[] digits) {
        int[] arr=new int[digits.length+1];
        int i=digits.length-1;
        int j=arr.length-1;
        int d;
        arr[j]=(digits[i]+1)%10;
        d=(digits[i]+1)/10;
        i--;
        j--;
        while(i>=0){
            arr[j]=(digits[i]+d)%10;
            d=(digits[i]+d)/10;
            j--;
            i--;
        }
        arr[j]=d;
        if(arr[0]==0){
            return Arrays.copyOfRange(arr, 1, arr.length);
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] digits={5};
        int[] a=plusOne(digits);
        System.out.println(Arrays.toString(a));
    }

}
