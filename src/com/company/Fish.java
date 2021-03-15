package com.company;

public class Fish extends Animal implements Swimmable{
    @Override
    void sleep() {

    }

    @Override
    void eat() {

    }

    public Fish(int age , int weight) {
        this.age = age;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Fish{" +
                "age=" + age +
                ", weight=" + weight +
                '}';
    }

    @Override
    public void swim() {

    }
}
