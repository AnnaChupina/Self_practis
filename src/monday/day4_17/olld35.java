package monday.day4_17;

public class olld35 {
    public boolean old35(int n) {
        if( n % 15 == 0 ){ // ther number is divisible by 3 and 5
            return false;
        }

        return n % 3 ==0 || n % 5 == 0;
    }

}
