package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); //enter the scanner to read human typing
        Random rand = new Random();

        System.out.println("Enter width"); //enter the number of *
        int num = scan.nextInt(); //scan the number of width
        System.out.println("Enter height"); //enter the number of *
        int height = scan.nextInt(); //scan the number of height
        System.out.println("Enter rows"); //enter the number of rows
        int rows = scan.nextInt(); //scan the number of rows


//        for (int i = 0; i < num; i++) { //cycle the width number
//            System.out.print("*");
//        }
        for (int r = 0; r < rows; r++) { //cycle of rows
            for (int i = 0; i < height; i++) { //cycle the height number

                for (int i1 = 0; i1 < num; i1++) { //cycle the width number

                    if (i1 == 0 || i1 == num - 1 || i == 0 || i == height - 1) {
                        System.out.print("*"); //то что надо печатать
                    } else {
                        System.out.print(" "); //то что не надо печатать
                    }

                }
                System.out.println(); //перевод строки в цикле
            }
        } System.out.println();
    }
}

