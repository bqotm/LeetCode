import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;

public class KthLargestElementinanArray {




    public int findKthLargest(int[] nums, int k) {

        PriorityQueue<Integer> priorityQueue=new PriorityQueue<>(k, (a,b)->b-a);
        for (int i = 0; i < nums.length; i++) {
            priorityQueue.offer(nums[i]);
        }
        for(int i=1; i<k; i++){
            priorityQueue.poll();
        }
        return priorityQueue.poll();

    }



}
