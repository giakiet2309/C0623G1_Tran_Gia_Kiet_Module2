package mvc_package.repository;

import mvc_package.model.Person;
import mvc_package.model.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentRepo implements IStudentRepo {
    private static List<Person> studentList = new ArrayList<>();
static {
    studentList.add(new Student("1","Khiêm","11/03/2006","Nam","C03",69));
    studentList.add(new Student("2","Bảo","31/12/2000","Nam","C04",199));
    studentList.add(new Student("3","Kiệt","23/09/2003","Nam","C05",89));
}
    @Override
    public void addStudent(Person student) {
    studentList.add(student);
    }

    @Override
    public void removeStudent() {

    }

    @Override
    public List<Person> displayStudent() {
        return studentList;
    }
}
