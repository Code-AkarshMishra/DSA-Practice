public class ReverseArray {
    public static void reverse(int[] arr){
        int l=0,r=arr.length-1;

        while(l<r){
            int t=arr[l];
            arr[l]=arr[r];
            arr[r]=t;
            l++; r--;
        }
    }
}