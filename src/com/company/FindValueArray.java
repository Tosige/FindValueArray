package com.company;

import java.util.Collections;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

public class FindValueArray {

    public static void main(String[] args) {

        // Finding values in array lists

        ArrayList<Integer> num = new ArrayList<Integer>();
        Scanner keyboard = new Scanner(System.in);
        Random rnd = new Random();

        //Initializing elements of array list with random numbers
        for (int i=0; i<10; i++){
            int randomnnum = rnd.nextInt(50);

            num.add(randomnnum);
        }

        //Print elements of the array
        System.out.println(num);

        //Takes user entry for comparison operation.
        System.out.print("Enter a number from 1-50: ");
        int user = keyboard.nextInt();

        //Prints unique result for each time user entry is found
        //Displays nothing if user entry not found
        for(int i = 0; i<10; i++) {
            if (user == num.get(i)) {
                System.out.println(user + " found in Array");
            }
        }

        //Prints result just stating numbe of times user entry is found
        //or if user entry is not found
        int timesFound = Collections.frequency(num, user);

        if (timesFound >0) {
            System.out.println(user + " was found " + timesFound + " times.");
        }
        else System.out.println(user + " was not found");
    }
}

// Search for any instance of user entry in the Array List
//    int searchRandom = Collections.binarySearch(num, user);
//        if (searchRandom >= 0) {
//            System.out.println(user + " found in Array 1");
//        }
//    }





