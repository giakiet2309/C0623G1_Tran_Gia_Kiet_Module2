package ss04_class_and_obj_in_java.exercise.StopWatch;

public class StopWatch {
    private long startTime;

    private long endTime;

    public StopWatch() {
    }

    public long getStartTime() {
        return this.startTime;
    }

    public long getEndTime() {
        return this.endTime;
    }

    public void start() {
        this.startTime = System.currentTimeMillis();
    }

    public void stop() {
        this.endTime = System.currentTimeMillis();
    }

    public String getElapsedtime() {
        return "Thời gian thực thi của chương trình là " + (this.endTime - this.startTime) + "ms";
    }
}