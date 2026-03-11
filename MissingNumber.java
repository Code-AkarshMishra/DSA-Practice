public public class MissingNumber {
    public static int missing(int[] nums){
        int n=nums.length;
        int sum=n*(n+1)/2;

        for(int x:nums)
            sum-=x;

        return sum;
    }
} {
    
}
