package The_50;

public class reverse {
    public int rev(int x){
        int reverseint = 0;
        while(x!=0){
            int digit = x % 10; //123 % 10 = 3
            if(reverseint > Integer.MAX_VALUE/10 || reverseint < Integer.MIN_VALUE/10){
                return 0;
            }
            reverseint = reverseint * 10 + digit; //0*10+3

            x = x /10;
        }
        return reverseint;
    }
    public static void main(String[]args){
        int x = -123;
reverse obj = new reverse();
System.out.println(obj.rev(x));
    }
}
