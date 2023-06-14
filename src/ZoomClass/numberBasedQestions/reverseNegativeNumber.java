package ZoomClass.numberBasedQestions;
/*
2) Number - Reverse negative number
Write a return method that can reverse negative number and return it as int

 */
public class reverseNegativeNumber {
    public static int reverseNumber(int num){
        if (num <0){
            num=-1*num;
        }
        return num;
    }
    public static int reverseNumber2(int num){
        if (num > 0){
            return num; // if number is positive return number

        }
        if(num<0){
            String numberString = Integer.toString(num);
            String reverseString = new StringBuilder(numberString.substring(1))
                    .reverse().toString();
        int reverseNumber= Integer.parseInt(reverseString);
            return -reverseNumber;
        }
        return num;
    }

    public static int reverseNumber3(int num){
        if(num>=0){
            return num;
        }
        int result=0;
        while(num <0){
            result = result * 10 + num % 10; //2345 = 234 reminder 5
            num = num /10; // 234  //23
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println(reverseNumber(-40));
        System.out.println(reverseNumber2(-102));
    }

}

