
import java.util.Scanner;

public class p {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     String exp = sc.next();
     int a = exp.charAt(0) - '0';
     if (a%2 == 0){
        System.out.println("EVEN");
     }else{
        System.out.println("ODD");
     }
     sc.close();   
    }
    
}
