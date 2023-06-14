package ZoomClass.numberBasedQestions;

public class FrequencyOfCharacter {
    public static String FindFrequencyOfChar(String input){
        int[] freqency = new int[128];  // Array to store frequency of character

        // Create a StringBuilder to conduct the result string
    //StringBulder result = new StringBuilder9()
        for(char c: input.toCharArray()){
            freqency[c]++;
        }
        String result = "";

        //iterite throw the  frequency array and append charachter and frequeny to the result
        for(int i=0; i < freqency.length; i++){
            if(freqency[i] > 0){
                result +=(char)i + "" + freqency[i];
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String input = "11144ff";
        String result = FindFrequencyOfChar(input);
        System.out.println(result);
    }
}
