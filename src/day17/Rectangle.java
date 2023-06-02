package day17;

public class Rectangle {

    public int length;
    public int width;

    public void setInfo(int length, int width) {
        this.length = length;
        this.width = width;


    }

    public double calculateArea(){
       double area = length*width;
        return area;
    }

    public double calculatePerimeter(){
    double perimeter = 2*(length+width);
    return perimeter;
    }

    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                ", area=" + calculateArea() +
                ", perimeter=" + calculatePerimeter() +
                '}';
    }

    public static void main(String[] args) {


        Rectangle r1 = new Rectangle();
        r1.setInfo(3,4);
        System.out.println(r1);
    }
}
/*
3. create a custom class named Rectangle
		Attributes:
		    length, width

		Actions:
		    setInfo(): sets the length and width of the rectangle object
		    calculateArea(): calculates the area of the rectangle, returns it as double
		    calculatePerimeter() calculates the perimeter of the rectangle, returns it as double
		    toString(): when a rectangle object is passed in print statement
		    		it should display the length, width, area and perimeter of the Rectangle object


 */