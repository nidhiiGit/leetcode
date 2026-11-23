package AmazonMedium;
import java.util.*;
public class kthLargestEl {
    public static int KthLargest(int nums[], int k){
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i=0; i<nums.length; i++){
            pq.offer(nums[i]);
            if(pq.size() > k){
                pq.poll();
            }
        }
        return pq.peek();
    }
    public static void main(String[] args) {
        int nums[] = {3,2,1,5,6,4};
        int k=2;
        System.out.println(KthLargest(nums,k));
    }
}
