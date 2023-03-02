package excercises;

/*
Create a class `Rectangle` with the following attributes: `width`, `height`, and a static variable `numOfRectangles` which will keep track of the number of rectangles created.

1.  Create a constructor that takes the width and height as arguments and sets the values of the `width` and `height` instance variables.
2.  Create a method `getArea` that calculates and returns the area of the rectangle.
3.  Create a method `getPerimeter` that calculates and returns the perimeter of the rectangle.
4.  Create a method `getNumOfRectangles` that returns the value of the `numOfRectangles` static variable.
5.  In this main method, create several `Rectangle` objects, calculate and print their area and perimeter, and finally print the number of rectangles created without keeping count in this class.
 */

public class StaticChallenge {

    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(5,10);
        Rectangle r2 = new Rectangle(7,7);
        Rectangle r3 = new Rectangle(6,7);
        System.out.println("Area of rectangle1:"+r1.getArea()+" Perimeter of rectangle1:"+r1.getPerimeter());
        System.out.println("Area of rectangle2:"+r2.getArea()+" Perimeter of rectangle2:"+r2.getPerimeter());
        System.out.println("Area of rectangle3:"+r3.getArea()+" Perimeter of rectangle3:"+r3.getPerimeter());

        System.out.println("No of rectangles created:"+Rectangle.getNumOfRectangles());
    }
}
