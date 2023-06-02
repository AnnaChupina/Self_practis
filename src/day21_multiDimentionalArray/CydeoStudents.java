package day21_multiDimentionalArray;

public class CydeoStudents {
    public static void main(String[] args) {

        String[] batch1Group1 = {"Ahmet", "Baturay", "Beyza", "Dilara", "Muhtar"};
        String[] batch1Group2 = {"Entisar", "Ermek", "Esmira", "Gadir", "Hrvoje", "Igor", "Muhtar"};
        String[] batch1Group3 = {"Kramer", "Lorraine", "Lucy", "Madina", "Yasin", "Muhtar"};

        String[][] batch1Groups = {batch1Group1,batch1Group2,batch1Group3};

        String[] batch2Group1 = {"Fuat", "Kenann", "Aliya", "Anna", "Murodil"};
        String[] batch2Group2 = {"Layla", "Oksana", "Tyler", "Murodil"};
        String[] batch2Group3 = {"Chris", "Yurii", "Mubarek", "Erika", "Subi", "Nadiia", "Murodil"};

        String [][] batch24Groups = { batch2Group1,batch2Group2, batch2Group3};

        String [][][] cydeoStudents = {batch1Groups, batch24Groups};

        for (String[][] eachline : cydeoStudents) {
            for (String[] eachGroup : eachline) {
                for (String eachStudent : eachGroup) {
                    System.out.println(eachStudent);
                }
            }
        }

    }
}
