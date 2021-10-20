import java.util.PriorityQueue;

class KthLargest {

    int k;
    PriorityQueue<Integer> minHeap;

    public KthLargest(int k, int[] nums) {
        this.k=k;
        minHeap=new PriorityQueue<>();
        for(int i=0; i<nums.length; i++){
            minHeap.add(nums[i]);
            if(minHeap.size()>k){
                minHeap.poll();
            }
        }
    }

    public int add(int val) {
        if(minHeap.size()<k){
            minHeap.add(val);
            return minHeap.size()==k ? minHeap.peek() : -1;
        }
        if(val > minHeap.peek()){
            minHeap.poll();
            minHeap.add(val);
        }
        return minHeap.peek();
    }
}
