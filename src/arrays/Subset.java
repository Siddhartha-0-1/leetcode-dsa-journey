package arrays;

import java.util.ArrayList;
import java.util.List;

public class Subset {

    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(0, nums, new ArrayList<>(), result);
        return result;
    }

    private static void backtrack(int index, int[] nums, List<Integer> temp, List<List<Integer>> result) {
        // add current subset
        result.add(new ArrayList<>(temp));

        for (int i = index; i < nums.length; i++) {
            temp.add(nums[i]);              // choose
            backtrack(i + 1, nums, temp, result); // explore
            temp.remove(temp.size() - 1);   // unchoose
        }
    }

    // For testing
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        List<List<Integer>> ans = subsets(nums);

        System.out.println(ans);
    }
}
