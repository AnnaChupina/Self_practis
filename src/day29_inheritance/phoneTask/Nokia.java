package day29_inheritance.phoneTask;

public class Nokia extends Phone {
    public void selfDefense(){
        System.out.println(getBrand() + getModel()+ "Can self Defends");
    }

    public Nokia(String brand, String model, String size, int price) {
        super(brand, model, size, price);
    }

    @Override
    public void call(long phoneNumber) {
        super.call(phoneNumber);
    }

    @Override
    public void text(long phoneNumber) {
        super.text(phoneNumber);
    }
}
