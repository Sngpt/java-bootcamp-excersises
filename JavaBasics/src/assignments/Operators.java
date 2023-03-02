package assignments;
//Write a program that takes in two numbers from the user and prints out the result of the following operations: addition, subtraction, multiplication, division, modulus, and increment/decrement
public class Operators {

     public static void main(String... args) {
     int no1 = Integer.parseInt(args[0]);
     int no2 = Integer.parseInt(args[1]);

     System.out.println("Addition:"+ (no1+no2));
     System.out.println("Substraction:"+ (no1-no2));
     System.out.println("Multiplication:"+ no1*no2);
     System.out.println("Division:"+ no1/no2);
     System.out.println("Modulus:"+ no1%no2);
     System.out.println("Increment:"+ ++no1);
     System.out.println("Decrement:"+ --no2);


 }
}
