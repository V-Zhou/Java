


public class Main {

    public static void main(String[] args) {

        VendingMachine vm = new VendingMachine();
        vm.showPrompt();
        vm.showBalance();
        vm.insertMoney(100);
        vm.getFood();
        vm.showBalance();

        VendingMachine vm1 = new VendingMachine();
        vm1.insertMoney(200);
        vm.showBalance();
        vm1.showBalance();

    }
}
