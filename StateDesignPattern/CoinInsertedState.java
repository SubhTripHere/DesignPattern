package DesignPattern.StateDesignPattern;

public class CoinInsertedState implements State{
    Double amount;
    VendingMachine machine;

    CoinInsertedState(VendingMachine machine){
        this.machine=machine;
        amount=0.0;
    }
    @Override
    public void insertCoin(Double val) {
        System.out.println("Illegal, cant insert coin as already inserted");
    }

    @Override
    public void chooseProduct(Integer aisleNumber) {
        Inventory inventory=machine.inventory;
        if(inventory.aisleToProduct.containsKey(aisleNumber)){
            machine.setCurrentState(new DispenseProductState(machine));
            machine.dispenseProduct(aisleNumber);
        }else{
            System.out.println("Illegal operation, cant choose unless you addproduct");
        }
    }

    @Override
    public void dispenseProduct(Integer aisleNumber) {
        System.out.println("Illegal, cant dispense in inserted-state");
    }
}
