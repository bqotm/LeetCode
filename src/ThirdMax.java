public class ThirdMax {




    public static int thirdMax(int[] nums) {
        long x,y,z;
        x=y=z=Long.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]>z){
                x=y;
                y=z;
                z=nums[i];
            }
            if(z>nums[i] && nums[i]>y){
                x=y;
                y=nums[i];
            }
            if(y>nums[i] && nums[i]>x){
                x=nums[i];
            }
        }
        return (nums.length<=2) ? ((int) z) : (x==Integer.MIN_VALUE) ? (int)z : (int)x;
    }

    public static void main(String[] args) {
        int[] arr={3,2,4,8,1,0,9};
        int[] ar={1,2};
        int[] arrr={2,1};
        int[] a={2};
        int[] t={3,2,1};
        System.out.println(thirdMax(arr));
    }
}
