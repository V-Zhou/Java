

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int[] a1 = {1, 2, 3, 4, 5};
        int[] a2 = a1;
        for (int i = 0; i < a2.length; ++i) {
            a2[i] ++;
        }
        for (int i = 0; i < a1.length; ++i) {
            System.out.println(a1[i]);
        }

        /// 5  16  16  普通变量是"所有者"(真拷贝 赋值)   数组变量是"管理者"(指针拷贝赋值)
        /*
        * 数组变量是数组的管理者而非数组本身
        * 数组必须创建出来然后交给数组变量来管理
        * 数组变量之间的赋值是管理权限的赋予
        * 数组变量之间的比较是判断是否管理同一个数组
         */
    }
}
