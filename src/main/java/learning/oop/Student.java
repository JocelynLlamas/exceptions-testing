package learning.oop;

public class Student {
    private String name;
    private String id;
    private int grade;

    public Student(String name, String id){
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public int getGrade() {
        return grade;
    }
}
