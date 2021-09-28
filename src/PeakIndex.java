public class PeakIndex {


    public int peakIndexInMountainArray(int[] arr) {

        for(int i=1; i<arr.length-1; i++){
            if(arr[i]>arr[i+1])
                return i;
        }
        return 0;
    }

    public int findPeakElement(int[] nums) {
        int l=0, h=nums.length-1;
        int m;
        nums[nums.length]=nums[-1]=Integer.MIN_VALUE;

        while(l<h){
            m=(l+h)/2;
            if(nums[m+1]>nums[m])
                l=m+1;
            else
                h=m;
        }
        return l;
    }

}
