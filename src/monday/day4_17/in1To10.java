package monday.day4_17;

public class in1To10 {

    // public boolean in1To10(int n, boolean outsideMode) {
//   if (n ==1 || n == 10){
//     return true;
//   }
//   boolean valid = n >= 1 && n <= 10;

    //   return outsideMode ? !valid : valid;
// }
    public boolean in1To10(int n, boolean outsideMode) {
        if(outsideMode){
            return n <= 1 || n >= 10;
        }else{
            return n>=1 && n<= 10; // in range of 1-10
        }
    }


}
