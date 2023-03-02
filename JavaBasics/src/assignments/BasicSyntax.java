package assignments;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Write a program that takes in two numbers from the user and prints out the sum, difference, product, and quotient of the numbers.
public class BasicSyntax {

    public static void main(String... args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a number:");
        int no1 = Integer.parseInt(br.readLine());
        System.out.println("Enter another number:");
        int no2 = Integer.parseInt(br.readLine());

        System.out.println(no1+no2);
        System.out.println(no1-no2);
        System.out.println(no1*no2);
        System.out.println(no1/no2);
    }
}
