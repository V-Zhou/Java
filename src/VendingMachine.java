public class VendingMachine {

    /*
        成员变量有初始值   普通变量默认为0   bool变量默认为false
        对象变量   默认为null 意味着没有连接任何对象
        可以给成员变量一个默认的值   甚至可以
         */
    private int price = 80;
    private int balance = f();
    private int total;
    String s = "";
    /* 构造函数
    * 如果一个成员函数的名字和类的名字完全相同, 则在创建这个类的每一个对象的时候会自动调用这个函数->构造函数
     * 这个函数不能有返回类型 写了返回值就不会被自动调用*/
    VendingMachine() {
        total = 0;
    }

    /*函数重载
    * 一个类可以有多个构造函数, 只要它们的参数表不同
    * 创建对象的时候给出不同的参数值, 就会自动调用不同的构造函数
    * 通过this()还可以调用其它构造函数
    * 一个类里的同名但参数表不同的函数构成了重载关系*/

//    VendingMachine(int price) { // 重载
//        this(); //通过this()还可以调用其它构造函数 1.只能在构造函数里面出现 2. 只能出现在前面 3. 只能一次
//        this.price = price;
//    }



    VendingMachine(double price) { // 重载
        this(); //通过this()还可以调用其它构造函数 1.只能在构造函数里面出现 2. 只能出现在前面 3. 只能一次
        this.price = (int) price;
    }


    int f() {
        return 10;
    }


    void setPrice(int price) {
        this.price = price;

    }

    void showPrompt() {
        System.out.println("Welcome");
    }

    void insertMoney(int amount) {
        balance += amount;
        showPrompt();
    }

    void showBalance() {
        System.out.println(balance);
    }

    void getFood() {
        if (balance >= price) {
            System.out.println("Here you are.");
            balance -= price;
            total += price;
        }
    }

}
