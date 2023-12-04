package DesignPattern.ObserverDP.Example;

public class AverageTemperatureObserver implements Observer{
    Integer temperature;
    private ObservableInterface observableInterface;

    public AverageTemperatureObserver(ObservableInterface observableInterface){
        this.observableInterface=observableInterface;
        //register();
    }
//    public void register(){
//        observableInterface.registerObservers(this);
//    }
    @Override
    public void update() {
        this.temperature=observableInterface.getTemp();
        display();
    }

    public void display(){
        System.out.println("Inside AverageTemperatureObserver , Average Temp = "+ this.temperature.toString()+"");
    }
}
