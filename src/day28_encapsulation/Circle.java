package day28_encapsulation;

public class Circle {
    private double radius;
    public static double pi = 3.14;

    public double getRadius() {
        if(radius == 0){
            System.err.println("Invalid");
            System.exit(1);
        }
        return radius;
    }

    public void setRadius(double radius) {
        if(radius<=0){
            System.err.println("Can not be negative or zero: " + radius);
            System.exit(1);
        }
        this.radius = radius;
    }

    public Circle(double radius) {
        setRadius(radius);
    }

    public double calcArea(){
        return pi*radius*radius;
    }
    public double calcPerimeter(){
        return 2*pi*radius;
    }

    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", arae=" + calcArea()+
                ", perimeter=" + calcPerimeter() +
                '}';
    }

    public static void main(String[] args) {
        Circle circle1 = new Circle(0.0);
        System.out.println(circle1);
    }
}
