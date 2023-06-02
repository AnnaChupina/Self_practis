package day23_arrayList;

public class test2 {
    public static void main(String[] args) {
        int[] n1 = new int[3];
        int[] n2 = {1,2,3,4,5};
        n1=n2;
        for(int i = 0;i<n2.length;i++){
            System.out.println(n1[i]);
        }
    }
}
