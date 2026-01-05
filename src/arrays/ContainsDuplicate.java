package arrays;

import java.util.HashSet;

public class ContainsDuplicate {
    //approcah 1 sort the array and check adjacent element
    //approch 2 nested loop o(n^2)
    //optimal hashset o(n)

    public boolean solution(int arr[]){
        HashSet<Integer> Set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            if(!Set.add(arr[i])){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        ContainsDuplicate obj = new ContainsDuplicate();
        int arr[]={1,2,3};
        System.out.println(obj.solution(arr));

    }
}
