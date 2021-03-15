package com.company;

public class TestArrays {
    public static void main(String[] args) {
        int[] index = new int[4];
        int y = 0;
        String[] islands = new String[4];


        index[0] = 1;
        index[1] = 3;
        index[2] = 0;
        index[3] = 2;



        islands[0] = "Bermudi";
        islands[1] = "Fidji";
        islands[2] = "Azorskie Ostrova";
        islands[3] = "Kosumel";

        int ref;
        while (y < 4) {
            ref = index[y];
            System.out.print(" Острова = ");
            System.out.println(islands[ref]);
            y = y + 1;
        }
    }
}
