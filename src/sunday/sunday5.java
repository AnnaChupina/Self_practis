package sunday;

public class sunday5 {
    public static void main(String[] args) {
        convertFromDollar("yen", 100);
    }

    public static double convertFromDollar(String currency, double dollars){
        double result = dollars;
        switch (currency.toLowerCase().trim()){
            case "euro":
                result = dollars * 0.91;
                break;
            case "yen":
                result = dollars * 121.03;
                break;
            case "lira":
                result = dollars * 14.85;
                break;

            case "won":
                result = dollars * 1217.52;
                break;

            case "rupee":
                result = dollars * 181.45;
                break;


        }
        return result;
    }

    public static int multiplicationTable(int number){
        multiplicationTable(number, 10);
        return number;}



    public static int add(int a, int b){
        return a + b;
    }
    // this is valid
    public static double add(double a, double b){
        return a + b;
    }
    // this ia valid
    public static float add (float c, int d){
        return c+d;
            }
    public static void multiplicationTable(int number, int limit) {
        for (int i = 1; i <= limit; i++) {
            System.out.println(number + " x " + i + " = " + (number*i));
    }



}
}



