
import java.util.Scanner;

public class G{
    public static void main(String[] args) {
       try(Scanner sc = new Scanner(System.in)){
        long n = sc.nextLong();
        long a = ( n * ( n+1 )) /2;
        System.out.println(a);
        sc.close();     
        
       } 
    }
}