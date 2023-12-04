package DesignPattern.ObserverDP.Example;

import java.util.ArrayList;
import java.util.List;

public class WeatherStationObservable implements ObservableInterface{

    List<Observer> observersList=new ArrayList<>();
    private Integer temp;
    private Integer humidity;

    @Override
    public void registerObservers(Observer observer) {
        if(observersList.indexOf(observer)<0)
            observersList.add(observer);
        return;
    }

    @Override
    public void deregisterObservers(Observer observer) {
        observersList.remove(observer);
        return;
    }

    @Override
    public void notifyObservers() {
        for (Observer obs:
             observersList) {
            obs.update();
        }
    }

    public void updateItem(int temp,int humidity){
        this.temp=temp;
        this.humidity=humidity;
        notifyObservers();
    }
    public Integer getTemp(){
        return this.temp;
    }
    public Integer getHumidity(){
        return this.humidity;
    }
}
