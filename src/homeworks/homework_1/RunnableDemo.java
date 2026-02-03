package homeworks.homework_1;

public class RunnableDemo {
    public static void main(String[] args) {
        // Последовательно
        long start = System.currentTimeMillis();
        long sequentialSum = 0;
        for (int i = 1; i <= 1_000_000; i++ ) {
            sequentialSum += i;
        }
        long end = System.currentTimeMillis();
        System.out.println("Sequential sum: " + sequentialSum);
        System.out.println("Sequential time: " + (end - start) + " ms");
        // Параллельно

        SumTask task1 = new SumTask(1,500_000);
        SumTask task2 = new SumTask(500_001,1_000_000);
        Thread thread1 = new Thread( task1,"Thread-1");
        Thread thread2 = new Thread(task2, "Thread-2");
        start = System.currentTimeMillis();
        thread1.start();
        thread2.start();
        try {
            thread1.join();
            thread2.join();}
        catch (InterruptedException e){
            System.out.println("Main thread was interrupted");
        }
        end = System.currentTimeMillis();
        long perallelSum = task1.getTotalSum()+ task2.getTotalSum();
        System.out.println("Parallel sum: " + perallelSum);
        System.out.println("Parallel time: " + (end - start) + " ms");
    }
}
