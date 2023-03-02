package assignments;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Create a program that takes in a list of integers from the user and prints out the largest number in the list.
public class Arrays {

    public static void main(String[] args) throws IOException {

        int[] intArray = new int[10];
        int i = 0;
        System.out.println("Enter list of numbers:");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        while(!line.equals("")) {
               intArray[i++] = Integer.parseInt(line);
               line = br.readLine();
        }

       // java.util.Arrays.stream(intArray).forEach(System.out::println);
        System.out.println("Biggest Number:" +java.util.Arrays.stream(intArray).max().getAsInt());
    }
}
