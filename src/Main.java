
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // TODO Auto-generated method stub
        int foot;
        double inch;
        Scanner in = new Scanner(System.in);
        foot = in.nextInt();
        inch = in.nextDouble();
        int meter = (int)((foot+inch/12.0)*0.3048*100);
        System.out.println("foot="+foot+",inch="+inch);
        System.out.println(meter);


    }
}
