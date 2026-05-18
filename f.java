
import java.util.Scanner;


public class f {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        long M = sc.nextLong();
        long A = (N % 10), B=(M % 10);
        System.out.println(A + B);
        sc.close();
        

    }
    
}
