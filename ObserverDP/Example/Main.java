package DesignPattern.ObserverDP.Example;


/*
When we have a condition where we want to do certain task or notify certiain svc people or flows on the occurance of certain events
we have observer DP in place.
We have an observable and number of observers observing any change in observable.
Observable has notify() method which notifies all subscribers/observers on change of event
ex: notifyMe in shopping systems
    update scorecard on each ball of match
    notification sending email/sms based on certain events
 */


public class Main {
    public static void main(String[] args) {
    WeatherStationObservable weatherStation=new WeatherStationObservable();

    DailyWeather dailyWeather=new DailyWeather(weatherStation);
    AverageTemperatureObserver averageDailyWeather= new AverageTemperatureObserver(weatherStation);

    weatherStation.registerObservers(dailyWeather);
    weatherStation.registerObservers(averageDailyWeather);

    weatherStation.updateItem(10,20);
    weatherStation.updateItem(20,30);
    weatherStation.updateItem(40,70);

    }
}