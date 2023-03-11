package assignments;
/*
Create a Java program that allows a user to perform various operations on an ArrayList of integers.
The program should display a menu of options, and the user should be able to select one of the following operations:
1. Add an element to the list
2. Remove an element from the list
3. Find the minimum element in the list
4. Find the maximum element in the list
5. Print the contents of the list
6. Quit the program
The program should continue to display the menu and allow the user to perform operations until they choose to quit.
*/

import java.util.ArrayList;
import java.util.Scanner;

public class ListHomework1 {

    public static void main(String... args) {

        ArrayList<Integer> list = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        boolean quit = true;
        do {
            System.out.println("1. Add an element to the list\n" +
                    "2. Remove an element from the list\n" +
                    "3. Find the minimum element in the list\n" +
                    "4. Find the maximum element in the list\n" +
                    "5. Print the contents of the list\n" +
                    "6. Quit the program");
            int menuOption = sc.nextInt();
            int temp ;

            switch(menuOption) {
                case 1:
                    System.out.println("Enter the integer element to be added:");
                    list.add(sc.nextInt());
                    break;

                case 2:
                    System.out.println("Enter the integer element to be removed:");
                    list.remove((Integer)sc.nextInt());
                    break;
                case 3:
                     temp = list.get(0);
                    for(Integer i : list) {
                       temp = i<temp? i: temp;
                    }
                    System.out.println("Minimum element in the list:"+ temp);
                    break;
                case 4:  temp = list.get(0);
                    for(Integer i : list) {
                        temp = i>temp? i: temp;
                    }
                    System.out.println("maximum element in the list:"+ temp);
                    break;
                case 5:
                    System.out.println(list);
                    break;
                case 6:
                    quit = false;
                    break;
            }

        } while(quit);
    }

}