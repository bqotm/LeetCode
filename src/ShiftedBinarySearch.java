public class ShiftedBinarySearch {

    public static int search(int[] arr, int l, int h, int target){
        if(l<h){
            int m=(l+h)/2;
            if(arr[m]==target)
                return m;
            return search(arr, l, m, target);
        }
        return l;
    }

    public static void main(String[] args) {
        int[] arr={-2,1,2,4,5,7,11,13};
        System.out.println(search(arr,0, arr.length-1,11));
    }
}
