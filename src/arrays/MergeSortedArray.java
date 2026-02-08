package arrays;
import java.util.Arrays;

public class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m-1, j = n-1;
        int k = m+n-1;
        while(i >= 0 && j >=0){ // nums1 is alredy sorted and in correct postion so we only check n2
            if(nums1[i]>nums2[j]){
                nums1[k--] = nums1[i--];
            }
            else{
                nums1[k--] = nums2[j--];
            }
        }
        while (j >= 0) {
            nums1[k--] =nums2[j--];
        }
    }
    public static void main(String[] args) {
        MergeSortedArray obj = new MergeSortedArray();
    
        int[] arr = {1,2,3,0,0,0};
        int[] arr2 = {2,5,6};
    obj.merge(arr,3,arr2,3);
    System.out.println(Arrays.toString(arr));
    }
}
