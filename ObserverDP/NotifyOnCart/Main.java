package DesignPattern.ObserverDP.NotifyOnCart;


import java.util.ArrayList;
import java.util.List;

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
    IphoneObservable iphoneObservable=new IphoneObservable();

    EmailNotificationObserver emailNotificationObserver=new EmailNotificationObserver(iphoneObservable);
    PostalNotificationObserver postalNotificationObserver=new PostalNotificationObserver(iphoneObservable);
    PushNotificationObserver pushNotificationObserver=new PushNotificationObserver(iphoneObservable);

    iphoneObservable.register(emailNotificationObserver);
    iphoneObservable.register(postalNotificationObserver);
    iphoneObservable.register(pushNotificationObserver);

    User user1=new User.UserBuilder().setName("Raj").setEmail("raj@gmail.com").builder();
    User user2=new User.UserBuilder().setName("abc").setEmail("abc@gmail.com").setPhoneNumber(1919999).builder();
    User user3= new User.UserBuilder().setName("def").builder();
    User user4=new User.UserBuilder().setName("mathew").setAge(22).builder();

    List<User> userList=new ArrayList<>();
        userList.add(user1);
        userList.add(user2);
        userList.add(user3);
        userList.add(user4);
    emailNotificationObserver.userList=userList;
    postalNotificationObserver.userList=userList;
    pushNotificationObserver.userList=userList;

    iphoneObservable.isAvailable(true);

    }
}