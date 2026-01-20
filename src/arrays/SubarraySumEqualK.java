package arrays;

import java.util.HashMap;

public class SubarraySumEqualK {

    public int solution(int nums[],int k){
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0, 1); 
        int sum = 0, count = 0;

        for(int num : nums){
            sum += num;

               if (map.containsKey(sum - k)) {
                count += map.get(sum - k);
            }

            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }

        return count;
    }


    public static void main(String[] args) {
        SubarraySumEqualK obj = new SubarraySumEqualK();
        int nums[] = {1,2,3};
        System.out.println(obj.solution(nums, 3));

    }
}
