import java.util.Scanner;
public class o {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String exp = sc.next();
        int a = Integer.parseInt(exp.substring(0));
        char op = exp.charAt(1);
        int b = Integer.parseInt(exp.substring(2));

        if (op == '+'){
            System.out.println(a + b);
        } else if (op == '-') {
            System.out.println(a - b);
        } else if (op == '*') {
            System.out.println(a * b);
        } else {
            System.out.println(a / b);
        }

            sc.close(); 
         }
    
    }