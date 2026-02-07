package The_50;

public class fabinonic {

    // ###########Iterative way##########
    // public static int febo(int x) {

    //     if (x == 0 || x == 1) {
    //         return x;
    //     }

    //     int n1 = 0, n2 = 1, feb = 0;

    //     for (int i = 2; i <= x; i++) {
    //         feb = n1 + n2;
    //         n1 = n2;
    //         n2 = feb;
    //     }

    //     return feb;
    // }
    // ############Recursive way ######//
    
    public static int febo(int n){
        if(n ==0 || n==1){
            return n;
        }
        return febo(n-1) + febo(n - 2);
    }

    public static void main(String[] args) {
        int x = 10;
        System.out.println(febo(x));
    }
}
