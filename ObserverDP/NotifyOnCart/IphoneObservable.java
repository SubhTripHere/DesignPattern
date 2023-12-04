package DesignPattern.ObserverDP.NotifyOnCart;


import java.util.HashSet;
import java.util.Set;

public class IphoneObservable implements Observable{
    Set<NotificationObserver> set;
    Boolean flag;

    public IphoneObservable(){
        flag=false;
        set=new HashSet<>();
    }

    @Override
    public void register(NotificationObserver observer) {
        if(!set.contains(observer))
            set.add(observer);
        return;
    }

    @Override
    public void deregister(NotificationObserver observer) {
        if(set.contains(observer))
            set.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (NotificationObserver obs: set){
            obs.sendNotification();
        }
    }

    public void isAvailable(Boolean flag){
        this.flag=flag;
        notifyObservers();
    }
}
