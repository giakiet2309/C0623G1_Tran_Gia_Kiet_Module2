package mvc_package.repository;

import mvc_package.model.Person;
import mvc_package.model.Teacher;

import java.util.ArrayList;
import java.util.List;

public class TeacherRepo implements ITeacherRepo {
    private static List<Person> teacherList = new ArrayList<>();

    static {
        teacherList.add(new Teacher("01", "Đạt", "23/09/2003", "Nam", "Tutor"));
        teacherList.add(new Teacher("02", "Khang", "23/09/2003", "Nam", "Tutor"));
        teacherList.add(new Teacher("03", "Lac", "23/09/2003", "Nam", "Coach"));
    }

    @Override
    public void addTeacher(Person teacher) {
        teacherList.add(teacher);
    }

    @Override
    public void removeTeacher() {

    }

    @Override
    public List<Person> displayTeacher() {
        return teacherList;
    }

}
