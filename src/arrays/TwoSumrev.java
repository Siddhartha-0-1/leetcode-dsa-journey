package arrays;

import java.util.*;

public class TwoSumrev {
public double findMaxAverage(int[] nums, int k) {
       int sum =0;
       for(int i = 0; i<k;i++){
    sum +=nums[i];
       }
       int max = sum;
       for(int i=k;i<nums.length;i++){
        sum = sum + nums[i] - nums[i-k];
        if (sum>max){
            max = sum;
        }
       }
       return (double) max/k;
       
    }



    public static void main(String[] args) {
        TwoSumrev obj = new TwoSumrev();
        int n;
        Scanner sc = new Scanner(System.in);

        System.out.print("enter the length : ");
        n = sc.nextInt();
int k =4;
        int arr[] = {1,12,-5,-6,50,3};
        // for (int i = 0; i < arr.length; i++) {
        //     System.out.printf("Enter the element %d : ", i);
        //     arr[i] = sc.nextInt();
        // }
        // for(int a : arr){
        //     System.out.printf("%d ",a);
        // }
System.out.println(obj.findMaxAverage(arr, k));
    }
}