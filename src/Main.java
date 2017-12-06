


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        // 首字母大写的是包裹类型

        String s1 = "0123456汉字";

//        String s2 = "abb";
        System.out.println(s1.substring(2, 4));
        System.out.println(s1.indexOf("56汉字"));
    }
}
