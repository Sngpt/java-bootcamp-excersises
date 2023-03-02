package excercises;

public class Car {

    private String make;
    private String model;
    private int year;

    Car(String make,String model,int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    String getMake() {
        return make;
    }

    String getModel() {
        return model;
    }

    int getYear() {
        return year;
    }

    @Override
    public String toString() {

       return getMake() + " " + getModel() + " " +getYear();

    }
}
