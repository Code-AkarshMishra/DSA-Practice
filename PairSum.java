import java.util.*;

public class PairSum {
    public static int countPairs(int[] arr,int target){

        Map<Integer,Integer> map=new HashMap<>();
        int count=0;

        for(int x:arr){

            int diff=target-x;

            if(map.containsKey(diff))
                count+=map.get(diff);

            map.put(x,map.getOrDefault(x,0)+1);
        }

        return count;
    }
}