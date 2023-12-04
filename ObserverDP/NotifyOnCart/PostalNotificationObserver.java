package DesignPattern.ObserverDP.NotifyOnCart;

import java.util.ArrayList;
import java.util.List;

public class PostalNotificationObserver implements NotificationObserver{

    List<User> userList ;
    Observable observable;

    public PostalNotificationObserver(Observable observable){
        this.observable=observable;
        userList=new ArrayList<>();
    }

    @Override
    public void sendNotification() {
        for (User user:userList) {
            System.out.println("sending postal notification for userName="+user.getName());
        }
    }
}
