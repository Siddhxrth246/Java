
import java.util.Scanner;

public class k {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();
        long d = Math.max(a,Math.max(c, b));
        long e = Math.min(a, Math.min(b,c));
        System.out.println(e + " " + d);
        sc.close();
    }
    
}
