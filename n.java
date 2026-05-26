
import java.util.Scanner;

public class n {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char X = sc.next().charAt(0);
        int ascii = (int) X;

        if (ascii >= 97 && ascii <= 122){
            ascii-=32;

        }else{
            ascii+=32;
        }

        System.out.println((char) ascii);

    }
}
