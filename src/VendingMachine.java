public class VendingMachine {
    int price = 80;
    int balance;
    int total;

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
