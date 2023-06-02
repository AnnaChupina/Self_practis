package day29_inheritance.phoneTask;

public class Samsung extends Phone {
    public Samsung(String brand, String model, String size, int price) {
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

    public void freeze(){
        System.out.println(getBrand() + getModel() + " can freeze");
    }
}
