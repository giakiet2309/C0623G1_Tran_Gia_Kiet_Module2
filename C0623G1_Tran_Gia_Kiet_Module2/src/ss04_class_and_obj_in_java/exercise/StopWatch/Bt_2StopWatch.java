package ss04_class_and_obj_in_java.exercise.StopWatch;


public class Bt_2StopWatch {
    public static void main(String[] args) {

        StopWatch watch = new StopWatch();
        watch.start();

        for (int i = 0; i <= 100000; i++) {
            System.out.println(i);
        }
        watch.stop();
        System.out.println("Thời gian thực thi của chương trình là " + watch.getElapsedtime() + "ms");
    }
}