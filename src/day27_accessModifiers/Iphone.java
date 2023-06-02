package day27_accessModifiers;

public class Iphone {
    public static String brand;
    public String model, color;
    public double price;

    public static String OS;
    public static String madeIn;
    public static String designIn;
    public static boolean isSmartPhone;


    static{
        brand = "IPhone";
        OS = "IOs";
        isSmartPhone = true;
        String madeIn = "China";
        String designIn = "USA";
    }
    public static void printOperatingSystem(){
        System.out.println("the operating system of the iphone " + OS );
    }
    public void call (long phoneNumber){
        System.out.println(brand + ", " + model + "can call");
    }
    public void text (long phoneNumber){
        System.out.println(brand + ", " + model + "can text");
    }
    public void faceTime (long phoneNumber){
        System.out.println(brand + ", " + model + phoneNumber+ " can call faceTime");
    }
    public void faceTime (String email){
        System.out.println(brand + ", " + model + email + " can call faceTime");
    }

    public Iphone(String model, String color, double price) {
        this.model = model;
        this.color = color;
        this.price = price;
       // this.phoneNumber = phoneNumber;
      //  this.email = email;
    }


    public String toString() {
        return "Iphone{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +

                '}';
    }
}
