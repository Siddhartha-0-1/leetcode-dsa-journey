package arrays;

public class Maxsubarray {

    public int maximumsubarray(int arr[]) {
        int maxsum = arr[0];
        int cursum = arr[0];

        for (int i = 1; i < arr.length; i++) {
            cursum = Math.max(arr[i], cursum + arr[i]); // kadanes algo reset -ne val to 0
            maxsum = Math.max(maxsum, cursum);
        }
        return maxsum;
    }

    public static void main(String[] args) {
        Maxsubarray obj = new Maxsubarray();
        int arr[] = {-2,-3};
        System.out.println(obj.maximumsubarray(arr));
    }
}
