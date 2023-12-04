package DesignPattern.ObserverDP.Example;

//import java.util.Observer;

public interface ObservableInterface {
     public void registerObservers(Observer observer);
     public void deregisterObservers(Observer observer);
     public void notifyObservers();


     // use-case specific
     public Integer getTemp();
     public Integer getHumidity();
}
