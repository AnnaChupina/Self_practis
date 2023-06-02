package sunday.march19;

public class CountHi {
    public static int countHi(String str) {
        int count = 0;

        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i)=='h' && str.charAt(i+1) == 'i' ){
            count++;

        }
    }
    return count;
}

    public static void main(String[] args) {
        System.out.println(countHi("hidedHisdcHIHIhihihiorld"));
    }

    // the while loop will continue running as long as the sequence of "hi" is in the String. Each iteration it wiill incremenbt counter and replace only the first occurrence of the



}
