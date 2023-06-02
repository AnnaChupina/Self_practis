package day27_accessModifiers;

public class IphoneTest {
    public static void main(String[] args) {
        Iphone iphone1 = new Iphone("12", "White", 1000 );
        iphone1.faceTime("asd@as.ru");
        iphone1.call(123465498);
        iphone1.printOperatingSystem();
        iphone1.text(01322);
        iphone1.faceTime(132412);
        iphone1.faceTime("sdewsd");
        System.out.println(iphone1);


    }

}
