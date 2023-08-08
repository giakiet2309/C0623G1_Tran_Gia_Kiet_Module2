package ss05_Accessmodifier_staticmethod_staticproperty.exercise.read_only_class;


public class Bt2ReadOnlyClass {
    public static void main(String[] args) {
        Student testStudent = new Student();

        System.out.println(testStudent.getName());
        System.out.println(testStudent.getClasses());

        testStudent.setName("Kiệt");
        testStudent.setClasses("C06");

        System.out.println(testStudent.getName());
        System.out.println(testStudent.getClasses());
    }
}

