package The_50;

import java.util.Arrays;

public class RunningSumOf1D {

    int []runningsum(int a[]){
        int []prefixsum = new int[a.length];
        prefixsum[0]=a[0];
        for (int i = 1; i < a.length; i++) {
            prefixsum[i] = prefixsum[i-1] + a[i];
        }
        return prefixsum;
    }
    public static void main(String[] args) {
        RunningSumOf1D obj = new RunningSumOf1D();
        
        int[] arr = {1,2,3,4,5};
        
        
        int result[] = obj.runningsum(arr);
        System.out.println(Arrays.toString(result));

    }
}
