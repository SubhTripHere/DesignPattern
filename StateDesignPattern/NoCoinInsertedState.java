package DesignPattern.StateDesignPattern;

public class NoCoinInsertedState implements State{
    VendingMachine machine;
    Double amount;

    public NoCoinInsertedState(VendingMachine machine){
        this.machine=machine;
        amount=0.0;
    }
    @Override
    public void insertCoin(Double val) {
        amount+=val;
        machine.setCurrentState(new CoinInsertedState(machine));
    }

    @Override
    public void chooseProduct(Integer aisleNumber) {
        System.out.println("Illegal,insert coin first");
    }

    @Override
    public void dispenseProduct(Integer aisleNumber) {
        System.out.println("Illegal,insert coin first");
    }
}
