package DesignPattern.StateDesignPattern;

public interface State {
    public void insertCoin(Double val);
    public void chooseProduct(Integer aisleNumber);
    public void dispenseProduct(Integer aisleNumber);
}
