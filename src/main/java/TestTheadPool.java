import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestTheadPool implements  Runnable {

    @Override
    public void run() {
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName());
    }
    static ExecutorService ExecutorService= Executors.newFixedThreadPool(3);

    public static void main(String[] args) {

        for (int i = 0; i < 100; i++) {
            ExecutorService.execute(new TestTheadPool());
        }
    }
}
