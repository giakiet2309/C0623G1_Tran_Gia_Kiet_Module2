package ss19_string_and_regex.exercise.validate_class_name;


public class ValidateClassNameTest {
    public static void main(String[] args) {
        String[] list = {"C0223G", "A0323K", "M0318G", "P0323A", "sgnwr", "C0023H"};
        for (String string : list) {
            ValidateClassName.vailidate(string);
        }
    }
}
