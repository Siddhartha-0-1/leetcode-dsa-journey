package arrays;
import java.util.Arrays;

public class ProductOfArr {
 //brute force approach without condition
        // int ans[] = new int[nums.length];
        // for (int i = 0; i < nums.length; i++) {
        //     int product = 1;
        //     for (int j = 0; j < nums.length; j++) {
        //         if (i != j) {
        //             product *= nums[j];
        //         }
        //     }
        //     ans[i] = product;
        // }
        // return ans;
        
    public int[] productofarray(int a[]) {

        int n = a.length;


        int suffix[] = new int[n];
        int ans[] = new int[n];

        // Prefix
        ans[0] = 1;
        for (int i = 1; i < n; i++) {
            ans[i] = ans[i-1] * a[i-1];
        }

        // Suffix
        suffix[n-1] = 1;
        for (int i = n-2; i >= 0; i--) {
            suffix[i] = suffix[i+1] * a[i+1];
        }

        // Answer
        for (int i = 0; i < n; i++) {
            ans[i] *= suffix[i];
        }

        return ans;
    }

    public static void main(String[] args) {

        ProductOfArr obj = new ProductOfArr();

        int[] arr = {1,2,3,4};

        int result[] = obj.productofarray(arr);
        System.out.println(Arrays.toString(result));
    }
}
