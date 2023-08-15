package ss11_DSA_Stack_Queue.exercise.optional_palindrome;

public class PalindromeTest {
    public static void main(String[] args) {
        Palindrome test1 = new Palindrome("auhc moc na me");
        test1.check();
        System.out.println("");
        Palindrome test2 = new Palindrome("Able was I ere I saw Elba");
        test2.check();
    }
}
