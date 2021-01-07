package learning.oop;

import java.util.LinkedList;
import java.util.List;

public class Group {
    private int maxOccupancy;
    private List<Student> studentList = new LinkedList();;
    private double average = 0;

    public Group(int maxOccupancy) {
        this.maxOccupancy = maxOccupancy;
    }

    public int getMaxOccupancy() {
        return maxOccupancy;
    }

    public void add(Student student) throws GroupOccupancyExceededException{
        if (studentList.size() < maxOccupancy) {
            studentList.add(student);
        } else {
            throw new GroupOccupancyExceededException();
        }
    }

    public List<Student> getStudents() {
        return studentList;
    }

    public int availability() {
        return maxOccupancy - studentList.size();
    }

    public double getAverage() {

        for (int i = 0 ; i < studentList.size() ; i++){
            average = average + studentList.get(i).getGrade();
        }

        average = average/studentList.size();

        return average;
    }
}
