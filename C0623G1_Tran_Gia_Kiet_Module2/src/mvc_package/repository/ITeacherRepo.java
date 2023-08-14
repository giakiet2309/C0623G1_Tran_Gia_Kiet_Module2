package mvc_package.repository;

import mvc_package.model.Person;

import java.util.List;

public interface ITeacherRepo {
    void addTeacher(Person teacher);

    void removeTeacher();

    List<Person> displayTeacher();
}
