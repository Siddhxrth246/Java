import java.util.Scanner;
public class o {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String exp = sc.next();
        int index = 0;
        char op =' ';
        for(int i =0; i< exp.length(); i++){
            char ch = exp.charAt(i);
            if (ch == '+' || ch == '-' || ch == '*' || ch == '/'){
                op =ch;
                index = i;
                break;
            }
        }
        int a = Integer.parseInt(exp.substring(0, index));

        int b = Integer.parseInt(exp.substring(index+1));

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
    