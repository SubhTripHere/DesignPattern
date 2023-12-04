package DesignPattern.ObserverDP.Example;

public class DailyWeather implements Observer{
    Integer temperature;
    Integer humidity;
    ObservableInterface observableInterface;
    public DailyWeather(ObservableInterface observableInterface){
        this.observableInterface=observableInterface;
       // observableInterface.registerObservers(this);
    }
    @Override
    public void update() {
        this.temperature=observableInterface.getTemp();
        this.humidity=observableInterface.getHumidity();
        display();
    }
    private void display(){
        System.out.println("Daily Weather Report: tempearature = "+temperature+" , Humidity = "+ humidity);
    }
}
