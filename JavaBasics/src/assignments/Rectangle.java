package assignments;

public class Rectangle {

    private double width;

    private double height;


    Rectangle(double width, double height) {

        this.width = width;
        this.height = height;
    }

    double getArea() {
        return width*height;
    }

    public static void main(String... args) {

        System.out.println(new Rectangle(33,45).getArea());
    }


}
