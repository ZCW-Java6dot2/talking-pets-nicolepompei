package io.zipcoder.polymorphism;

public class Quokka extends Pet {
    private String name;

    public Quokka(String name) {
        super(name);
    }

    @Override
    public String speak() {
        return "squeak!";
    }

}
