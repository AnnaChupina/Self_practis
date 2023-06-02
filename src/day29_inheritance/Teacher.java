package day29_inheritance;

public class Teacher {
    private String name;
    private char gender;
    private int age;
    private String id;
    private String jobTitle;
    private double salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        if(gender == 'F' || gender == 'M') {
            this.gender = gender;
        } else{
            System.err.println("gender can only be 'M' or 'F', not:" +  gender);
            System.exit(1);
        }
    }

    public int getAge() {

        return age;
    }

    public void setAge(int age) {
        if((age<18 || age >65)|| (age <=0)){
            System.err.println("wrong age: " + age);
            System.exit(1);
        }
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if(salary<0){
            System.err.println("salary can not be negative");
            System.exit(1);
        }
        this.salary = salary;
    }

    public void setInfo(String name, char gender, int age, String id, String jobTitle, double salary) {
        setName(name);
        setGender(gender);
        setAge(age);
        setId(id);
        setJobTitle(jobTitle);
        setSalary(salary);
    }
    public void teaching(){
        System.out.println(name + ", " + jobTitle + " is teaching now");
    }

    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", id='" + id + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                '}';
    }

}
