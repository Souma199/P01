package com.company;

import java.io.IOException;
import java.math.BigInteger;
import java.util.*;

public class Cat extends Animal {
    @Override
    void sleep() {

    }

    @Override
    void eat() {

    }

    public  static int catCount;

    private String name = "Vaska";
        private int  hp = 100;
        private int levelOfHappy = 0;

    public static int getCatCount() {
        return catCount;
    }


    public Cat(String name, int age, int weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public Cat(String name) {
        this.name = name;
    }

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return String.format("Cat Name - %s, him  %d old, he weight - %dkg", name, age ,weight);
    }
}
