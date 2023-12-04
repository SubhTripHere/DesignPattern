package DesignPattern.ObserverDP.NotifyOnCart;

public class User{
    private String name;
    private int age;
    private String email;
    private Integer phoneNumber;
    private Boolean pushNotification;

    public User(UserBuilder userBuilder){
        this.name=userBuilder.name;
        this.age=userBuilder.age;
        this.email=userBuilder.email;
        this.phoneNumber=userBuilder.phoneNumber;
        this.pushNotification=userBuilder.pushNotification;
    }

    public static class UserBuilder{
        private String name;
        private int age;
        private String email;
        private Integer phoneNumber;
        private Boolean pushNotification;

        public UserBuilder setName(String name){
            this.name=name;
            return this;
        }
        public UserBuilder setAge(Integer age){
            this.age=age;
            return this;
        }
        public UserBuilder setEmail(String email){
            this.email=email;
            return this;
        }
        public UserBuilder setPhoneNumber(Integer phoneNumber){
            this.phoneNumber=phoneNumber;
            return this;
        }
        public UserBuilder setPushNotification(Boolean flag){
            this.pushNotification=flag;
            return this;
        }
        public User builder(){
            return new User(this);
        }
    }

    public String getName(){
        return this.name;
    }

}
