package The_50;

public class gcdOfOddEvenSums {
    public int GCDOfOddEvenSums(int n) {
        // WAY ONE USING LOOP 
    //     // sum of nth odd term is always n^2
    //     int sumOdd = n * n;
    //     int sumEven = n * (n+1);
    //  while(sumEven != 0){
    //     int temp = sumEven;
    //     sumEven = sumOdd % sumEven;
    //     sumOdd = temp;
    //  }
    //  return sumOdd;

    //DIRECT METHOD :

    return n;
    }
    public static void main(String[] args) {
        
    gcdOfOddEvenSums obj = new gcdOfOddEvenSums();
    
int x = 4;
    
    System.out.println(obj.GCDOfOddEvenSums(4));
    
    // int result[] = obj.functionName();
    }
    
}
