package hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
public class StudentService {

    //private ArrayList<String> studentList = new ArrayList<>();

    @Autowired
    private StudentDao studentDao;

    public ArrayList<String> getSortedList(String[] str){
        return studentDao.sortClass(str);
    }

    public ArrayList<String> getRevList(String[] str){
        return studentDao.revSortClass(str);
    }
}

