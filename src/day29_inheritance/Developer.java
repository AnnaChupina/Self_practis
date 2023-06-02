package day29_inheritance;

import java.util.ArrayList;
import java.util.Arrays;

public class Developer {
    private String name;
    private char gender;
    private int age;
    private String id;
    private String jobTitle;
    private double salary;
    private String programmingLanguage;

    public Developer(String name, char gender, int age, String id, String jobTitle, double salary, String programmingLanguage) {
        setName(name);
        setGender(gender);
        setAge(age);
        setId(id);
        setJobTitle(jobTitle);
        setSalary(salary);
        setProgrammingLanguage(programmingLanguage);
    }

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
        if(gender == 'F' || gender =='M') {
            this.gender = gender;
        }else {
            System.err.println("Wrong gender: " + gender);
            System.exit(1);
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if((age <= 0)||(age<18 || age>65)){
            System.err.println("Unexpective");
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
        if (salary<=0){
            System.err.println("salary can not be negative");
            System.exit(1);
        }
        this.salary = salary;
    }

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }
    ArrayList<String> lang = new ArrayList<>(Arrays.asList("Java", "JavaScript", "Python", "Ruby", "C#", "C++", "Swift"));

    public void setProgrammingLanguage(String programmingLanguage) {
        if(lang.contains(programmingLanguage)) {
            this.programmingLanguage = programmingLanguage;
        }else {
            System.err.println("Wrong lenguage: " + programmingLanguage);
            System.exit(1);
        }
    }
    public void coding(){
        System.out.println(name + ", " + jobTitle + " is coding");
    }

    public String toString() {
        return "Developer{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", id='" + id + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                ", programmingLanguage='" + programmingLanguage + '\'' +
                '}';
    }
}
