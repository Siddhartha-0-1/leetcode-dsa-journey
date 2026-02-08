package The_50;

import java.lang.reflect.Array;

public class Bubblesort {

    public static void sorting(int a[]){
for (int i = 0; i < a.length; i++) {
    if(a[i]>a[i+1]){
        int temp = a[i];
        a[i] = a[i+1];
        a[i+1] = temp;
    }
}
    }

    public static void main(String[] args) {
        Bubblesort obj = new Bubblesort();
    
        int[] arr = {3,2,4,6,5,1};
    
        int result[] = obj.sorting(arr);
        System.out.println(Array.toString(arr));
    
    }
    
}
