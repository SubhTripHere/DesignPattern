package DesignPattern.Builder;


/*
    When we have a problem dealing with multiple attributes for object and conditionally we might want/dont
    want to set values for the object,
    we cant use constructor to set values as we will have tor remember ordering and send null values,
    moreover if new attribute is added we have to change our old code

    so we create a builder , which will be responsible for building the object and then later converting
    it to the required object by setting the desired values.
    This builder should be a static inner class, (why static?)


 */
public class Main {
    public static void main(String[] args) {
    Dog dog1 = new Dog.DogBuilder().setAge(11).setName("Bruno").setBreed("GoldenRetr").build();
    Dog.DogBuilder dogBuilderObj=new Dog.DogBuilder().setAge(1).setName("tommy").setColor("white").setBreed("pug");
    Dog dog2=new Dog(dogBuilderObj);
    System.out.println(dog1.toString());
    System.out.println(dog2.toString());
    }
}