package io.zipcoder.polymorphism;

public class Dog extends Pet{
    private String name;

    public Dog(String name) {
        super(name);
    }

    public Dog() {
      super(null);
    }

    @Override
    public String speak() {
        return "bark!";
    }

}
