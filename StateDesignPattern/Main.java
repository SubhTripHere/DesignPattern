package DesignPattern.StateDesignPattern;

public class Main {
    public static void main(String[] args) {
        VendingMachine vendingMachine=new VendingMachine();
        vendingMachine.addProduct(0,ProductType.COKE);
       // vendingMachine.addProduct(1,ProductType.JUICE);
        vendingMachine.addProduct(2,ProductType.MILK);
        vendingMachine.addProduct(0,ProductType.PEPSI);
       // vendingMachine.chooseProduct(0);
        vendingMachine.insertCoin(20.0);
        vendingMachine.chooseProduct(0);
        vendingMachine.insertCoin(20.0);
        vendingMachine.chooseProduct(1);

    }
}
