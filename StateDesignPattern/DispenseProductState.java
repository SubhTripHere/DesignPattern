package DesignPattern.StateDesignPattern;

public class DispenseProductState implements State{
    VendingMachine machine;
    DispenseProductState(VendingMachine machine){
    this.machine=machine;
    }
    @Override
    public void insertCoin(Double val) {
        System.out.println("Illegal, no aisle to dispense");
    }

    @Override
    public void chooseProduct(Integer aisleNumber) {
        System.out.println("Illegal, no aisle to dispense");
    }

    @Override
    public void dispenseProduct(Integer aisleNumber) {
        Inventory inventory = machine.inventory;
        if (inventory.aisleToProduct.containsKey(aisleNumber)) {
            if (inventory.aisleToProduct.get(aisleNumber).size() > 0) {
                System.out.println("successfully dispensed prodcutType: " + aisleNumber);
                inventory.aisleToProduct.get(aisleNumber).remove(inventory.aisleToProduct.get(aisleNumber).size() - 1);
                machine.setCurrentState(new NoCoinInsertedState(machine));
            } else {
                System.out.println("Illegal, no aisle to dispense");
            }
        }
    }
}
