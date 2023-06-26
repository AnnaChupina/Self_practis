package wednesday.navi.week05;

public class SummOfDigit {
    public static int SummOfDigits (String str){
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
           if(str.charAt(i)>'0'&&str.charAt(i)<='9'){
               int e = str.charAt(i) - '0';
               sum = sum + e;
           }
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(SummOfDigits("ss-12+3"));
    }
}
