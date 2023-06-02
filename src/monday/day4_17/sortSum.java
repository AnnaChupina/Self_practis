package monday.day4_17;

public class sortSum {
    public int sortaSum( int a, int b){
        int sum = a +b;
        if( sum >= 10 && sum <= 19){
            return 20;
        }
        return sum;
    }
    public int sortaSum2( int a, int b){
        int sum = a +b;
        return sum >= 10 && sum <= 19 ? 20 : sum;
    }

}
/*
Given 2 ints, a and b, return their sum. However, sums in the range 10..19 inclusive, are forbidden, so in that case just return 20.


sortaSum(3, 4) → 7
sortaSum(9, 4) → 20
sortaSum(10, 11) → 21
 */