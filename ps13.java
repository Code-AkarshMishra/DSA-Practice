import java.util.*;

class MergeIntervals{
    public static int[][] merge(int[][] intervals){

        Arrays.sort(intervals,(a,b)->a[0]-b[0]);
        List<int[]> list=new ArrayList<>();

        int[] cur=intervals[0];

        for(int[] in:intervals){
            if(in[0]<=cur[1])
                cur[1]=Math.max(cur[1],in[1]);
            else{
                list.add(cur);
                cur=in;
            }
        }

        list.add(cur);
        return list.toArray(new int[list.size()][]);
    }
}