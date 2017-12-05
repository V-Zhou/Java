
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int x;

        double sum = 0;
        int cnt = 0;
        x = in.nextInt();
        while (x != -1) {
            sum += x;
            cnt ++;
            x = in.nextInt();
        }
        if (cnt > 0) {
            System.out.println(sum/cnt);
        }

    }
}
