package DesignPattern.ObserverDP.NotifyOnCart;

public interface Observable {
    public void register(NotificationObserver observer);
    public void deregister(NotificationObserver observer);
    public void notifyObservers();

    //
    public void isAvailable(Boolean flag);

}
