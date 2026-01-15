package arrays;

public class concatinatearrays {
    

    public static void main(String[] args) {
        concatinatearrays cat = new concatinatearrays();
        int nums[]={1,2,3,4};
           int ans[] = new int[nums.length * 2];
        System.arraycopy(nums, 0, ans, 0, nums.length);
        System.arraycopy(nums, 0, ans, nums.length,nums.length);
for (int i : ans) {
    System.out.println(i);
}
    }
}
