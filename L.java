
import java.util.Scanner;

public class L {
    public static void main(String[] args) {
      try(Scanner sc = new Scanner(System.in)){
       String f1 = sc.next();
       
       String s1 = sc.next();
       String f2 = sc.next();
       String s2 = sc.next();
       


        System.out.println((s1.equals(s2))? "ARE Brothers":"NOT");

       
       sc.close();
       }
     }
    
}
