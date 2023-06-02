package day29_inheritance.car;

public class car {
    private static String make;
    private String model;
    private int year;
    private String color;
    private int price;

    public String getMake(){
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }



    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if(year <= 0){
            System.err.println("year can not be zero or negative");
            System.exit(1);
        }
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        if(price <=0){
            System.err.println("price can not be zero or negative");
            System.exit(0);
        }
        this.price = price;
    }


    public void setInfo(String make, String model, int year, String color, int price) {
        setMake(make);
        setModel(model);
        setYear(year);
        setColor(color);
        setPrice(price);
    }

    public String toString() {
        return "car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }
}
