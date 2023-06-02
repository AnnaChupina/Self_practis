package day29_inheritance.phoneTask;

public class IPhone extends Phone {
    public IPhone(String brand, String model, String size, int price) {
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

    public void faceTime (long phoneNumber){
        System.out.println(getBrand()+ ", " + getModel() + phoneNumber + " can call faceTime");
    }
    public void faceTime (String email){
        System.out.println(getBrand()+ ", " + getModel() + email + " can call faceTime");
    }


}
