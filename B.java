
import java.util.Scanner;


public class B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        long b;
        char c;
        float d;
        double e;

        a = sc.nextInt();
        b = sc.nextLong();
        c= sc.next().charAt(0);
        d = sc.nextFloat();
        e  = sc.nextDouble();

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        sc.close();

    }
}