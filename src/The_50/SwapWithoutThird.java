package The_50;

public class SwapWithoutThird {
    public static void main(String[] args) {
        int a =5, b=2;
        a = a+b;
        b=a-b;
        a = a-b;

        System.out.println(a+" "+b);
    }
}
