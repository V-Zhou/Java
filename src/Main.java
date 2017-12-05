import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // TODO Auto-generated method stub
        System.out.println("你好");

//		System.out.println("echo: " + in.nextLine());

        Scanner inBill = new Scanner(System.in);
        int bill = inBill.nextInt();
        Scanner in = new Scanner(System.in);
        int prince = in.nextInt();

        System.out.println(bill + "-"+ prince + "=" + (bill-prince));
//     git
    }
}
