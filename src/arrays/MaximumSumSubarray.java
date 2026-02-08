package arrays;

public class MaximumSumSubarray {
    int max(int a,int b){
        return a>b?a:b;
    }

    int maxsum(int a[]){
        int cursum =a[0];
        int msum =a[0];
        for (int i = 1; i < a.length; i++) {
           cursum = max(a[i], cursum+a[i]);
           msum = max(msum, cursum);
        }
        return msum;
    }
    public static void main(String[] args) {
        MaximumSumSubarray obj = new MaximumSumSubarray();
    
        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
    
        System.out.println(obj.maxsum(arr));
    
        // int result[] = obj.functionName();
    }
}
