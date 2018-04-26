package hello;

import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
public class StudentModel {

    private ArrayList<String> studentList;

    public StudentModel() {
        this.studentList = studentList;
    }

    public ArrayList<String> getStudentList() {
        return studentList;
    }

    public void setStudentList(ArrayList<String> studentList) {
        this.studentList = studentList;
    }
}
