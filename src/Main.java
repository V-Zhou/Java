

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int[] a = new int[10];
        a[0] = 5;
        int[] b = a;
        System.out.println(a[0]);
        b[0] = 16;
        System.out.println(a[0]);
        System.out.println(b[0]);

        /// 5  16  16  普通变量是"所有者"(真拷贝 赋值)   数组变量是"管理者"(指针拷贝赋值)
    }
}
