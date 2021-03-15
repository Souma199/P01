package com.company;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class TestAll {
    public static void main(String[] args) throws IOException {
        User user = new User("Ruslan", 18);
        System.out.println(user.toString());

        User user1 = new User("Ruslan2", 19 );
        System.out.println(user1.toString());

        System.out.println(user.equals(user1));
    }
}
