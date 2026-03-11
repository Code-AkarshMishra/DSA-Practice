import java.util.*;

public class Frequency {
    public static void main(String[] args){
        int[] arr={1,2,3,3,4,1,4,5,1,2};

        Map<Integer,Integer> map = new HashMap<>();

        for(int x:arr)
            map.put(x,map.getOrDefault(x,0)+1);

        for(int k:map.keySet())
            System.out.println(k+" occurs "+map.get(k)+" times");
    }
}