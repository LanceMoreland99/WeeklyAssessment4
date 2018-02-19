package com.company.Question_5;

import java.util.Scanner;

public class Main {

    private Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
         /*
         1. Create a new method in this class.  Make sure to instantiate the main to break out of the static context.
         2. Create a switch statement in this new method that has 4 cases and a default.  This switch should take user input of a string .
         3. Make sure you prompt your user as to what they should enter
         4. Have the default case tell the user to input the correct input you are looking for and use recursion to run the switch again.
         */
         System.out.println("Think of an animal");
         Main main = new Main();
         main.switchStuffs();
    }

    private void switchStuffs() {

        switch (input.nextLine().toUpperCase()) {

            case "DOG":
                System.out.println("Probably got a dog dont you?");
                break;
            case "CAT":
                System.out.println("Why do you like cats? they are aliens.");
                break;
            case "MOUSE":
                System.out.println("Nice.");
                break;
            case "MOOSE":
                System.out.println("i think you spelled mouse wrong.");
                break;
            case "RAT": System.out.println("thats just a fat mouse");
                break;
            default:
                System.out.println("Think of a different animal.");
                switchStuffs();
        }
    }
}
