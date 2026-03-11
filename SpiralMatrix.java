public class SpiralMatrix {
    public static void spiral(int[][] a,int r,int c){
        int top=0,bottom=r-1,left=0,right=c-1;

        while(top<=bottom && left<=right){

            for(int i=left;i<=right;i++) System.out.print(a[top][i]+" ");
            top++;

            for(int i=top;i<=bottom;i++) System.out.print(a[i][right]+" ");
            right--;

            for(int i=right;i>=left;i--) System.out.print(a[bottom][i]+" ");
            bottom--;

            for(int i=bottom;i>=top;i--) System.out.print(a[i][left]+" ");
            left++;
        }
    }
}