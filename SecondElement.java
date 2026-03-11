import java.util.*;

public class SecondElement {
    public static void main(String[] args){
        int[] arr={1,2,4,7,7,5};

        TreeSet<Integer> set=new TreeSet<>();
        for(int x:arr) set.add(x);

        if(set.size()<2){
            System.out.println(-1);
            System.out.println(-1);
        }else{
            System.out.println(set.higher(set.first()));
            System.out.println(set.lower(set.last()));
        }
    }
}