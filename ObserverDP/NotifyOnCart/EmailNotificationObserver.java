package DesignPattern.ObserverDP.NotifyOnCart;

import java.util.ArrayList;
import java.util.List;

public class EmailNotificationObserver implements NotificationObserver{

    List<User> userList ;
    Observable observable;

    public EmailNotificationObserver(Observable observable){
            this.observable=observable;
            userList=new ArrayList<>();
    }

    @Override
    public void sendNotification() {
        for (User user:userList) {
            System.out.println("sending Email notification for userName="+user.getName());
        }
    }
}
