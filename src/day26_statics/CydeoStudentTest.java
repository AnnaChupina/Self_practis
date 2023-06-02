package day26_statics;

public class CydeoStudentTest {
    public static void main(String[] args) {
        CydeoStudent cydeoStudent1 = new CydeoStudent("Anna", 35, 'F', "123",99, 12,12);

        System.out.println(cydeoStudent1);
        cydeoStudent1.study();
        cydeoStudent1.attendClass(true);
        cydeoStudent1.printSchoolName();
        cydeoStudent1.printProgLanguage("Java");


    }
}
