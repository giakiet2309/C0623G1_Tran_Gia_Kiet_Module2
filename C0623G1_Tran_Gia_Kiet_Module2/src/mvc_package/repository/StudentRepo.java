package mvc_package.repository;

import mvc_package.model.Person;
import mvc_package.model.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentRepo implements IStudentRepo {
    private static List<Person> studentList = new ArrayList<>();
static {
    studentList.add(new Student("1","tran","23/09/1921","Nam","C02",69));
    studentList.add(new Student("2","tran3","23/09/1923","Nam","C02",199));
    studentList.add(new Student("3","tran2","23/09/1922","Nam","C02",89));
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
