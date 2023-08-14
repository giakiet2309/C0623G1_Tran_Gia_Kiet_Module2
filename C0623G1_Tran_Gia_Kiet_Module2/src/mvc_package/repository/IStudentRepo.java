package mvc_package.repository;

import mvc_package.model.Person;
import mvc_package.model.Student;

import java.util.List;

public interface IStudentRepo {
    void addStudent(Person student);
    void removeStudent();

    List<Person> displayStudent();

}