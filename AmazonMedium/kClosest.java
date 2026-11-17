package AmazonMedium;

import java.util.*;

public class kClosest{
    public static void KclosestElements(int[] arr, int k, int x){
        PriorityQueue<Integer> pq = new PriorityQueue<>(k);
        for(int a: arr){
            if(k>0){
                pq.offer(a);
                k--;
            }else if(Math.abs(x-pq.peek()) > (Math.abs(a-x))){
                pq.poll();
                pq.offer(a);
            }
        }
        List<Integer> ans = new ArrayList<>();
        while(!pq.isEmpty()){
            ans.add(pq.poll());
        }
        for(int y:ans){
            System.out.print(y + " ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int k = 4;
        int x=3;
        KclosestElements(arr, k, x);

        
    }
}