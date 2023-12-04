package DesignPattern.ObserverDP.NotifyOnCart;

import java.util.ArrayList;
import java.util.List;

public class PushNotificationObserver implements NotificationObserver{
    List<User> userList;
    Observable observable;
    public PushNotificationObserver(Observable observable){
        this.observable=observable;
        userList=new ArrayList<>();
    }
    @Override
    public void sendNotification() {
        for (User user:userList) {
            System.out.println("sending push notification for userName="+user.getName());
        }
    }
}
