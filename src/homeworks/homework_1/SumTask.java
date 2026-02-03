package homeworks.homework_1;

public class SumTask implements Runnable{

    private int from;
    private int to;

    public long sum = 0;

    public SumTask(int from, int to) {
        this.from = from;
        this.to = to;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " started");
        for (int i = from ; i <= to; i++){
            sum += i;
        }
        System.out.println(Thread.currentThread().getName() + " finished");
    }
    public long getTotalSum(){
        return sum;
    }
}
