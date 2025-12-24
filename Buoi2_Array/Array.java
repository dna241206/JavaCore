package com.example.Java_Core.Buoi2_Array;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        String [] clubs = {"MU", "manCiTy", "LoseverPool"};
        clubs[0] = "Phan Dao"; //update lại phần tử đầu tiên

        String [] a = new String[5];
        a[0] = "1";
        System.out.println("");

        System.out.println("run here array: first element: " + clubs[0]);
        System.out.println("run here array: first element: " + clubs[1]);


//        System.out.println("run here array" + Arrays.toString(clubs));
//
//        System.out.println("run here array wit length" + clubs.length);

        //Duyệt tất cả phần tử của mảng
        String[] cars = {"Merc", "BMW", "Ford", "Mazda"};
        for (int i = 0; i < cars.length; i++){
            System.out.println(cars[i]);
        }
    }

}
