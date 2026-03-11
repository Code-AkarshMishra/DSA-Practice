import java.util.*;

public class MaxMarks {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int sem = sc.nextInt();
        int[] subjects = new int[sem];

        for(int i=0;i<sem;i++)
            subjects[i] = sc.nextInt();

        for(int i=0;i<sem;i++){
            int max = Integer.MIN_VALUE;

            for(int j=0;j<subjects[i];j++){
                int mark = sc.nextInt();

                if(mark <0 || mark>100){
                    System.out.println("You have entered invalid mark.");
                    return;
                }

                max = Math.max(max,mark);
            }

            System.out.println("Maximum mark in "+(i+1)+" semester: "+max);
        }
    }
}