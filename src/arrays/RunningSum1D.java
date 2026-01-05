package arrays;

public class RunningSum1D {

    public int[] solution(int arr[]){
        int prefix[] = new int[arr.length];
       prefix[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            /* in this logic we required sum to cal again and again which increase space com o(n)*/
            //     sum += arr[i]; 
            //    result[i] = sum;

            //optimal soln prefix sum
            prefix[i] = prefix[i-1] + arr[i];

            }
            
        return prefix;
    }
    public static void main(String[] args) {
        RunningSum1D obj = new RunningSum1D();
        int nums[] = {1,2,3,4};
       int res[]= obj.solution(nums);
        for (int i : res) {
            System.out.println(i);
        }
    }
}
