import java.util.Arrays;

public class Quicksort {

    /*3   5   4   11  6   9   7   2   10*/

    public static int[] sortArray(int[] nums) {
        sort(nums, 0, nums.length-1);
        return nums;
    }
    public static void sort(int[] nums, int start, int end){
        if(start>=end)
            return;
        int index=partition(nums, start, end);
        sort(nums, start, index-1);
        sort(nums, index+1, end);
    }

    public static int partition(int[] arr, int start, int end){
        int k;
        int i=start-1;
        for(int j=start; j<end; j++){
            if(arr[j]>arr[end])
                continue;
            i++;
            k=arr[i];
            arr[i]=arr[j];
            arr[j]=k;

        }
        k=arr[i+1];
        arr[i+1]=arr[end];
        arr[end]=k;
        return i+1;
    }

    public static void main(String[] args) {
        int[] nums={3,5,4,11,10,9,7,2,6};
        System.out.println(Arrays.toString(sortArray(nums)));
    }


}
