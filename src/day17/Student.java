package day17;

public class Student {

    public String name;
    public char gender;
    public int age;
    public String studentID;
    public char grade;
    public boolean isFullTime;

    public void setInfo(String name, char gender, int age, String studentID, char grade, boolean isFullTime) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.studentID = studentID;
        this.grade = grade;
        this.isFullTime = isFullTime;
    }

    public void study(){
        System.out.println("Student " + name + " now has a " + grade + " grade");
    }

    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", studentID='" + studentID + '\'' +
                ", grade=" + grade +
                ", isFullTime=" + isFullTime +
                '}';
    }

    public static void main(String[] args) {
        Student s1 =new Student();
        s1.setInfo("Anna",'F', 35, "123", 'A', true);
        System.out.println(s1);
        s1.study();
    }
}
/*

2. Create a custom class named Student
		Attributes:
			name, gender, age, studentId, grade, isFullTime

		Actions:
			setInfo(): sets all the fields of the student object
			toString(): when a car object is passed in print statement,
					it should display all the information of the student object
			study()

 */