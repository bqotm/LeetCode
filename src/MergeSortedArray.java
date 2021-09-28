import java.util.Arrays;

public class MergeSortedArray {


    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i=m-1, j=n-1, l=m+n-1;
        while(i>=0 && j>=0){
            nums1[l--]=(nums1[i]<=nums2[j]) ? nums2[i--] : nums1[j--];
        }
        while (j>=0)
            nums1[l--]=nums2[j--];
    }

    public static void main(String[] args) {

    }

}
