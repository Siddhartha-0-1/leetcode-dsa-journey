package arrays;

public class FindPivotIndex{
    int pivotindex(int a[]){
        int totalsum = 0;
        for(int i : a){
             totalsum += i;
        }
        int leftsum = 0;
        for (int i = 0; i < a.length; i++) {
            int rightsum = totalsum - leftsum - a[i];
            if(leftsum == rightsum){
                return i;
            }
            leftsum += a[i];
        }
        return -1;
    }
    public static void main(String[] args) {
        FindPivotIndex obj = new FindPivotIndex();
        int a[] ={2,1,-1};
System.out.println(obj.pivotindex(a));
    }
}
