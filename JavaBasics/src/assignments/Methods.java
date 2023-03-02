package assignments;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Create a program that takes in a string from the user and prints out the number of vowels in the string.
public class Methods {

       public static void main(String... args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter a string:");
        String str = br.readLine();
        str = str.toLowerCase();
        char[] arr = str.toCharArray();
        int counter = 0;
        for(char i:arr) {
            switch(i) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    counter++;
                    break;
            }
        }
        System.out.println("No of vowels:"+counter);
    }
}
