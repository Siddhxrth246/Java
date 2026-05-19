
import java.util.Scanner;

public class J {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        if(a%b == 0){
            System.out.println("Multiples");
        }else if (b%a ==0){
            System.out.println("Multiples");
        }else{
            System.out.println("NO Multiples");
        }
        sc.close();

    }
}
