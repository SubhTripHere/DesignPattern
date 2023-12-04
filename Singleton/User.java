package DesignPattern.Singleton;

public class User {
    static User obj;
    private User(){
    System.out.println("Instance created");
    }
    public static User getInstance(){
        if(obj==null){
            synchronized (User.class) { // ensure just one object is having the lock on User class
                if(obj==null)           // this line of code ensure 2PC 2 point checking,
                                        // one before the sync block and other inside
                    obj = new User();
            }
        }

        return obj;
    }
}
