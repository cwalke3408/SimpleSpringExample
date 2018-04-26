package hello;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @Autowired
    private StudentService studentService;

    @RequestMapping("/sortClass")
    public ArrayList<String> sortingClass() {
        String[] list =  {"Christian", "Dina", "Amber", "Rosslyn", "Shane", "Victor", "Tyler", "Jossyn", "Hill"};
        return studentService.getSortedList(list);
    }

    @RequestMapping("/revClass")
    public ArrayList<String> revClass(){
        String[] list =  {"Christian", "Dina", "Amber", "Rosslyn", "Shane", "Victor", "Tyler", "Jossyn", "Hill"};
        return studentService.getRevList(list);
    }
}
