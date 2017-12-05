
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int c;
        int f;
        Scanner in = new Scanner(System.in);
        f = in.nextInt();
        c = (int)( (f - 32) * 5 / 9.0 );
        System.out.println(c);

    }
}
