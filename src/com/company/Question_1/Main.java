package com.company.Question_1;

import java.util.ArrayList;
import java.util.List;

public class Main {


   /*
    YOUR NAME HERE! - No really put your name here so we know who this belongs to when we grade it <3
     */
    private List<String> arrayList = new ArrayList<>();


    public static void main(String[] args) {
        System.out.println("Lance Moreland");

        /*
        1. In this class initialize a List as an ArrayList.
        2. Create a method called addToArrayList to add 6 values of your choosing to this ArrayList.
        3. Create a new method in this class called displayArray.
        4. Have this new method use a ForEach loop to iterate through the ArrayList and display each item to the user.
         */



        Main main = new Main();
        main.addToArrayList();
    }



    private void addToArrayList() {
        arrayList.add("My");
        arrayList.add("house");
        arrayList.add("is");
        arrayList.add("in");
        arrayList.add("the");
        arrayList.add("middle");
        arrayList.add("of");
        arrayList.add("the");
        arrayList.add("street");
        displayArrayList();
    }
    private void displayArrayList() {
        for (String list : arrayList) {
            System.out.println(list);

        }
    }
}
