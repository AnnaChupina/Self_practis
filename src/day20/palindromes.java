package day20;

public class palindromes {
    public static void main(String[] args) {
        
        String [] arr1 = {"anna", "level", "Java"};
        int count = 0;

        for (String s : arr1) {
            String reverse = "";
            for (int i = s.length()-1; i >=0; i--) {
               reverse += s.charAt(i);
            }
            if (s.equals(reverse)){
                count +=1;
            }
        }
        System.out.println(count);

    }
}


/*

3. write a program that can count how many palindromes in an array of string
        Ex:
            {"anna", "level", "Java"};

            output:
                2

 */