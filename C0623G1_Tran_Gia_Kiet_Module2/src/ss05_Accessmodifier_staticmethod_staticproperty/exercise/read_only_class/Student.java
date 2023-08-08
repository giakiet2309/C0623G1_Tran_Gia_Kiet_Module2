package ss05_Accessmodifier_staticmethod_staticproperty.exercise.read_only_class;

public class Student {
    String name = "John";
    String classes = "C02";

    public Student() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    public String getName() {
        return this.name;
    }

    public String getClasses() {
        return this.classes;
    }
}
