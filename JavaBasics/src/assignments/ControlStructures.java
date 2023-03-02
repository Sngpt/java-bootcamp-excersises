package assignments;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//Write a program that takes in a number from the user, and prints out whether the number is positive, negative, or zero.
public class ControlStructures {

    public static void main(String[] args) throws IOException {

        System.out.println("Enter a number:");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)) ;

        int no = Integer.parseInt(br.readLine());

        if(no<0) {
            System.out.println("Number is negative");
        } else if (no>0) {
            System.out.println("Number is positive");
        } else {
            System.out.println("Its Zero.");
        }
    }
}
