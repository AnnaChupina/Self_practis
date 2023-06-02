package day26_statics;

public class CydeoStudent {

    public String name;
    public int age;
    public char gender;
    public String id;
    public int grade, batchNumber, groupNumber;

    static String schoolName = "Cydeo", magicWord = "Wooden Spoon";

    public void study(){
        System.out.println(name + " is studing");
    }
    public void attendClass(boolean attend){
        System.out.println(name + " attend today is " + attend);
    }
    public static void printSchoolName(){
        System.out.println("School name is " + schoolName);
    }
    public void printProgLanguage(String language){
        System.out.println(language);
    }

    public String toString() {
        return "CydeoStudent{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", id='" + id + '\'' +
                ", grade=" + grade +
                ", batchNumber=" + batchNumber +
                ", groupNumber=" + groupNumber +

                '}';
    }

    public CydeoStudent(String name, int age, char gender, String id, int grade, int batchNumber, int groupNumber) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.id = id;
        this.grade = grade;
        this.batchNumber = batchNumber;
        this.groupNumber = groupNumber;
    }
}
        /*1. CydeoStudent Task
		1. Create a class named CydeoStudent:

				Attributes:
					instances: name, age, gender, id, grade, batchNumber, groupNumber
					statics: schoolName, magicWord

				Add a constructor that can set All the fields (instances)

				Actions:
					study()
					attendClass()
					printSchoolName(): displays the school name
					printProgLanguage(): displays the name of programming language
					toString()
		*/