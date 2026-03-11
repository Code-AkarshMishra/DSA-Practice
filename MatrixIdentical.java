public class MatrixIdentical {
    public static boolean check(int[][] A,int[][] B){
        for(int i=0;i<A.length;i++)
            for(int j=0;j<A[0].length;j++)
                if(A[i][j]!=B[i][j])
                    return false;
        return true;
    }
}