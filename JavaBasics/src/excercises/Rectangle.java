package excercises;

public class Rectangle {

    private double width;

    private double height;

    private static int numOfRectangles;

    Rectangle(double width, double height) {
        numOfRectangles++;
        this.width = width;
        this.height = height;
    }

    double getArea() {
        return width*height;
    }

    double getPerimeter() {
        return 2*(width+height);
    }

    static int getNumOfRectangles() {
        return numOfRectangles;
    }

}
