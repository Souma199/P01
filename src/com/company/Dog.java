package com.company;

public class Dog extends Animal{
    private String name;
    @Override
    void sleep() {

    }

    @Override
    void eat() {

    }

    public Dog(String name, int weight, int age) {
        this.name = name;
        this.weight = weight;
        this.age = age;
    }

    @Override
    public String toString() {
        return String.format("Dog Name - %s, him  %d old, he weight - %dkg", name, age ,weight);
    }
}
