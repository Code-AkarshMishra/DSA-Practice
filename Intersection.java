import java.util.*;

public class Intersection {
    public static int[] intersect(int[] a,int[] b){

        Set<Integer> set=new HashSet<>();
        Set<Integer> res=new HashSet<>();

        for(int x:a) set.add(x);

        for(int x:b)
            if(set.contains(x))
                res.add(x);

        return res.stream().mapToInt(i->i).toArray();
    }
}