package com.company.Question_1;

import java.util.ArrayList;

public class Main {

   /*
    YOUR NAME HERE! - No really put your name here so we know who this belongs to when we grade it <3



     */
    private ArrayList<Main> arrayList = new ArrayList<>();


    public static void main(String[] args) {
         /*
        1. In this class initialize a List as an ArrayList.
        2. Create a method called addToArrayList to add 6 values of your choosing to this ArrayList.
        3. Create a new method in this class called displayArray.
        4. Have this new method use a ForEach loop to iterate through the ArrayList and display each item to the user.
         */

        System.out.println("Lance Moreland");

        Main main = new Main();
        main.displayArrayList();
    }



    private void addToArrayList() {
        arrayList.add();
    }
    private void displayArrayList() {
        for (Main main : arrayList) {
            System.out.println(arrayList);

        }
    }
}
