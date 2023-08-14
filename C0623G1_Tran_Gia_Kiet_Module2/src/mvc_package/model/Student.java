package mvc_package.model;

public class Student extends Person {
    private String classStudent;
    private int point;

    public Student() {

    }

    public Student(String id, String name, String dob, String gender, String classStudent, int point) {
        super(id, name, dob, gender);
        this.classStudent = classStudent;
        this.point = point;
    }

    public String getClassStudent() {
        return classStudent;
    }

    public void setClassStudent(String classStudent) {
        this.classStudent = classStudent;
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    @Override
    public String toString() {
        return "Student{" + super.toString() +
                ", classStudent='" + classStudent + '\'' +
                ", point=" + point +
                '}';
    }
}
