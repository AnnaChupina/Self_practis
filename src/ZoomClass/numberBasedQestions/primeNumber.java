package ZoomClass.numberBasedQestions;
/*
1) Numbers - Prime Number
Write a method that can check if a number is prime or not

 */
public class primeNumber {
    public static boolean isPrime(int number){

        if(number < 2){
            return false;
            // precondition
        }
        for (int i = 2; i <= number/2; i++) {
            if(number%i ==0){
                return false;

            }
        }return true;
    }

    public static void main(String[] args) {
        int n=-99;
        if(isPrime(n)){
            System.out.println(n + " is prime digit");
        }else {
            System.out.println(n + " is not prime digit");
        }
    }
}

