package arrays;

import java.util.Arrays;

public class MoveZero {

    void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public void moveZeroes(int[] nums) {
        int insertpos = 0;

        for (int i = 0; i < nums.length; i++) {
            if(nums[i] != 0){
                swap(nums, i, insertpos);
                insertpos++;
            }
        }
    }
   
    public static void main(String[] args) {
        int a[] = {0, 1, 0, 3, 1, 2};

        MoveZero obj = new MoveZero();
        obj.moveZeroes(a);

        System.out.println(Arrays.toString(a));
    }
}
