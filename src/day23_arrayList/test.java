package day23_arrayList;

public class test {
    public static void main(String[] args) {

        int sum = 0;
        String[] d = {"Sun", "Mon","Wen", "Sat"};
        for (int i =0;i< d.length;i++){
            switch (d[i]){
                case"Sat":
                case "Sun": sum-=1;
                break;
                case"Mon" :
                    sum +=1;
                case "Wen":
                    sum +=2;
            }
        }
        System.out.println(sum);
    }
}
