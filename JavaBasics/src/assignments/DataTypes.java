package assignments;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Create a program that takes in a person's name, age, and salary, and prints out the person's name, age,
// and salary in the format "Name: [name], Age: [age], Salary: [salary]".
public class DataTypes {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter Person's Name:");
        String name = br.readLine();

        System.out.println("Enter Age:");
        int age = Integer.parseInt(br.readLine());

        System.out.println("Enter Salary:");
        long salary = Long.parseLong(br.readLine());

        System.out.println("Name: "+name+" Age:"+age+" Salary:"+salary);


    }
}
