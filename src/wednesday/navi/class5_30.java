package wednesday.navi;

public class class5_30 {
    public static void main(String[] args) {

       // System.out.println("Divisible by 15:");

        String divisibleBy15 = "";
        String divisibleBy5="";
        String divisibleBy3 = "";


        for (int i = 0; i < 100; i++) {
            if(i%15==0 && i%5==0 && i%3==0){
                divisibleBy15 += " " + i;
            } else if(i % 3==0 && i % 15 !=0 && i % 5 != 0){
                divisibleBy3 += " " +i;
            } else if(i% 3!= 0 && i % 15 != 0 && i%5 ==0){
                divisibleBy5 += " " + i;
            } else{
                continue;
            }

        }
        System.out.println("divisibleBy15:" + divisibleBy15);
        System.out.println("divisibleBy5:" + divisibleBy5);
        System.out.println("divisibleBy3:" + divisibleBy3);
    }
}
