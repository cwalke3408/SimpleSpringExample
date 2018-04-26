package hello;


import hello.StudentModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Collections;

@Component
public class StudentDao {

    private ArrayList<String> studentList = new ArrayList<>();

    public StudentDao() {
    }

    @Autowired
    private StudentModel studentModel;


    public ArrayList<String> sortClass(String[] newStudentList){
        // convert string array into String class
        //String[] newStudentList = {"Christian", "Dina", "Amber", "Rosslyn", "Shane", "Victor", "Tyler", "Jossyn", "Hill"};
        ArrayList<String> studentList = new ArrayList<>();

        for(String str : newStudentList){
            studentList.add(str);
        }

        studentModel.setStudentList(studentList);
        Collections.sort(studentModel.getStudentList());

        return studentModel.getStudentList();

    }

    public ArrayList<String> revSortClass(String[] newStudentList){
        //String[] newStudentList = {"Christian", "Dina", "Amber", "Rosslyn", "Shane", "Victor", "Tyler", "Jossyn", "Hill"};
        ArrayList<String> studentList = new ArrayList<>();
        ArrayList<String> studentRev = new ArrayList<>();

        for(String str : newStudentList){
            studentList.add(str);
        }

        Collections.sort(studentList);


        for(String student : studentList){
            studentRev.add(0, student);
        }

        return studentRev;
    }

    public void setStudentList(ArrayList<String> studentList) {
        this.studentList = studentList;
    }

    public ArrayList<String> getStudentList() {
        return studentList;
    }
}
