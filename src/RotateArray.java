public class RotateArray {

    /*
        0,1,2,3,4,5  k=4
        2 chains because gcd(6 , 4)=2;
        0 -> 4 -> 2 -> 0
            0 1 2 3 4 5
            swap 0 & 4 : 4 1 2 3 0 5
            swap 4 & 2 : 2 1 4 3 0 5
        1 -> 5 -> 3 -> 1
            swap 1 & 5 : 2 5 4 3 0 1
            swap 5 & 3 : 2 3 4 5 0 1
    */


    public void rotate(int[] nums, int k) {

        int x=0;
        int count=0, n= nums.length;
        int step=k%n;
        for(int i=0; i<n; i++){
            int s=nums[i];
            int j=i;
            do {

                j=(j+step)%n;
                int tmp=s;
                s=nums[j];
                nums[j]=tmp;
                count++;
            } while(j!=i);
            if(count==n)
                break;
        }
    }
}
