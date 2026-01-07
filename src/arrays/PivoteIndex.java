package arrays;

public class PivoteIndex {

    public int solution(int[] nums) {
        int totalsum = 0;
        for (int i : nums) {
            totalsum += i;
        } // totalsum = 1+7+3+6+5+6 = 28
          // we consider the first element from array as starting so it leftsum will
          // always be 0
        int leftsum = 0;
        for (int i = 0; i < nums.length; i++) {
            int rightsum = totalsum - nums[i] - leftsum; // eg right sum of index 3 will be 5+6 so 28-6-11 = 11
            if (leftsum == rightsum) {
                return i;
            }
            leftsum += nums[i]; // for index 0 leftsum 0 += 1 ==1
        }
        return -1; // if no matching elements
    }

    public static void main(String[] args) {
        PivoteIndex obj = new PivoteIndex();
        int nums[] = { 2,1,-1};
        // pivote index means from a index leftside of index sum will be equal to the
        // rightsum. [1+7+3]=11,[6]{5+6}=11
        int res = obj.solution(nums);
System.out.println(res);
    }
}
