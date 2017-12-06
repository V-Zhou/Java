


public class Main {

    public static void main(String[] args) {

        VendingMachine vm = new VendingMachine();
        vm.showPrompt();
        vm.showBalance();
        vm.insertMoney(100);
        vm.getFood();
        vm.showBalance();

        VendingMachine vm1 = new VendingMachine(100);
        vm1.insertMoney(200);
        vm.showBalance();
        vm1.showBalance();

        // 函数是通过对象来调用的  this是成员函数的一个特殊的股友的本地变量 表达了调用这个函数的那个对象
        /*
        调用函数
        * 通过.运算符调用每个对象的函数
        * 在成员函数内部直接调用自己 (this) 的其他函数
         */

        /*
        本地变量
        * 定义在函数内部的变量是本地变量
        * 本地变量的生存期和作用于都是函数内部
        * 成员变量的生存期是对象的生存期, 作用于是类内部的成员函数
         */



    }
}
