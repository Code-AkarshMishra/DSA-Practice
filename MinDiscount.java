import java.util.*;

public class MinDiscount {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        String item="";
        int min = Integer.MAX_VALUE;

        for(int i=0;i<n;i++){
            String[] arr = sc.nextLine().split(",");
            String name = arr[0];
            int price = Integer.parseInt(arr[1]);
            int dis = Integer.parseInt(arr[2]);

            int discount = price * dis / 100;

            if(discount < min){
                min = discount;
                item = name;
            }
        }

        System.out.println(item);
    }
}