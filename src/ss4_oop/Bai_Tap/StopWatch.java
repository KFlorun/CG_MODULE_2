package ss4_oop.Bai_Tap;

public class StopWatch {
    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        stopWatch.stop();
        System.out.println("Elapsed Time: " + stopWatch.getElapsedTime() + " milliseconds");
    }
    private long startTime;
    private long endTime;
    public long getStartTime() {
        return startTime;
    }
    public long getEndTime() {
        return endTime;
    }
    public StopWatch() {
        this.startTime = System.currentTimeMillis();
        this.endTime = 0;
    }
    public void start() {
        this.startTime = System.currentTimeMillis();
    }
    public void stop() {
        this.endTime = System.currentTimeMillis();
    }
    public long getElapsedTime() {
        if (this.endTime == 0 || this.startTime == 0) {
            System.out.println("Timer has not been started or stopped");
        }
        return this.endTime - this.startTime;
    }
}
