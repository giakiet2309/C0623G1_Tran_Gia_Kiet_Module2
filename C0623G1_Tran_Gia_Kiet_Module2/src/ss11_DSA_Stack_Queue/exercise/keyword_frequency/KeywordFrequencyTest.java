package ss11_DSA_Stack_Queue.exercise.keyword_frequency;


public class KeywordFrequencyTest {
    public static void main(String[] args) {
        Keyword string = new Keyword("Tran Gia Kiet Kiet Kiet");
        System.out.println(string.getStr());
        string.countWord();
        System.out.println("");
        string.setStr("1 2 3 4 1 2 3 4 ");
        string.countWord();

    }
}
