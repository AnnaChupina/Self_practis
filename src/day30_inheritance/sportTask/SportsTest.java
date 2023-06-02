package day30_inheritance.sportTask;

public class SportsTest {
    public static void main(String[] args) {
        Baseball baseball = new Baseball("Busketball player1", 12,2, "play" );
        Basketball basketball = new Basketball("Ivan", 12,4, "some");
        football football1 = new football("Petia", 45, 10,"IDK");
        AmericanFootball americanFootball = new AmericanFootball("John", 11, 1, "Can't imajine");

        baseball.play();
        football1.play();
        System.out.println(americanFootball);
        System.out.println(basketball);
        System.out.println(baseball);
        System.out.println(football1);
        basketball.jumpsToBusket();


    }
}
