package DesignPattern.Builder;


public class Dog {
    private String name;
    private String breed;
    private int age;
    private String color;

    public Dog(DogBuilder dogBuilder){
        this.age=dogBuilder.age;
        this.color=dogBuilder.color;
        this.breed= dogBuilder.breed;
        this.name= dogBuilder.name;
    }

    public static class DogBuilder{
        private String name;
        private String breed;
        private int age;
        private String color;

        public DogBuilder setName(String name){
            this.name=name;
            return this;
        }

        public DogBuilder setAge(Integer age){
            this.age=age;
            return this;
        }

        public DogBuilder setBreed(String breed){
            this.breed=breed;
            return this;
        }

        public DogBuilder setColor(String color){
            this.color=color;
            return this;
        }

        public Dog build(){
            return new Dog(this);
        }
    }

    @Override
    public String toString() {
        String dogString= this.name+","+this.age+","+this.breed+","+this.color;
        return dogString;
    }
}
