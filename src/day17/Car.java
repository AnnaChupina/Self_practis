package day17;

public class Car {

    public String make;
    public String model;
    public int year;
    public String color;
    public double price;


    public void setInfo (String make, String model, int year, String color, double price) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.color = color;
        this.price = price;
    }

    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }
    public void start(){
        System.out.println("Car is starting exploitation in a "+ year + " year.");
    }

    public static void main(String[] args) {
        Car car1 = new Car();
        car1.setInfo("audi", "A6", 1999, "white", 20000);
        System.out.println(car1);
    }
}
/*
1. Create a custom class named Car
		Attributes:
			make, model, year, color, price

		Actions:
			setInfo(): sets all the fields of the car object
			toString(): when a car object is passed in print statement, it should display all the information of the car object
			start()
 */