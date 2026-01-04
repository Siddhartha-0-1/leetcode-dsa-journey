package arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public int[] two_Sum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        // key   -> number
        // value -> index

        for (int i = 0; i < nums.length; i++) {
            int need = target - nums[i];

            if (map.containsKey(need)) {
                return new int[]{map.get(need), i};
            }

            map.put(nums[i], i);
        }

        return new int[]{};
    }
    public static void main(String[] args) {
        int[] nums = {2, 7, 4, 1, 6};
        int target = 9;

        TwoSum obj = new TwoSum();
        int[] result = obj.two_Sum(nums, target);

        if (result.length == 2) {
            System.out.println(result[0] + ", " + result[1]);
        } else {
            System.out.println("No two numbers add up to the target.");
        }
    }
    }

