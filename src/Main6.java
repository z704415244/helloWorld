import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Main6 {
    public static void main(String[] args) {
        System.out.println('A' + 'B');
        Lock lock = new ReentrantLock();
        try {
            lock.tryLock(1000, TimeUnit.DAYS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }
}
