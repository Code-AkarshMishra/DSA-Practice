import java.util.*;

public class KthLargest {
    public static int find(int[] nums,int k){
        PriorityQueue<Integer> pq=new PriorityQueue<>();

        for(int n:nums){
            pq.add(n);
            if(pq.size()>k) pq.poll();
        }

        return pq.peek();
    }
}