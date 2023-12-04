package DesignPattern.StateDesignPattern;

public class VendingMachine {
    State currentState;
    Double amount;
    Inventory inventory;
    int MAX_AISLE_COUNT= 3;

    VendingMachine(){
        this.currentState=new NoCoinInsertedState(this);
        amount=0.0;
        inventory=new Inventory(MAX_AISLE_COUNT);
    }

    public void insertCoin(Double val){
        currentState.insertCoin(val);
//        this.currentState=new CoinInsertedState(this);
//        return;
    }

    public void chooseProduct(Integer aisleNumber){
        currentState.chooseProduct(aisleNumber);

       // currentState.dispenseProduct(aisleNumber);
    }

    public void dispenseProduct(Integer aisleNumber){
        currentState.dispenseProduct(aisleNumber);
    }
    public void setCurrentState(State state){
        this.currentState=state;
    }

    public void addProduct(Integer aisleNumber, ProductType productType){
        inventory.addProduct(aisleNumber,productType);
    }
}
