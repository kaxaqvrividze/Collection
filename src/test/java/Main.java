import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Main{

    public static void main(String[] args) {
        Thread.setDefaultUncaughtExceptionHandler(new Error());
        final VectorClass vectorClass = new VectorClass();
        final ConcurrentLinkedQueueClass concurrentLinkedQueueClass = new ConcurrentLinkedQueueClass();
        Thread thr1 = new Thread() {
            @Override
            public void run() {
                vectorClass.addString("Thread1");
                vectorClass.DeleteLastString();
                concurrentLinkedQueueClass.addInt(4666);
                concurrentLinkedQueueClass.deleteLastInt(4666);
            }
        };
        Thread thr2 = new Thread(){
            @Override
            public void run(){
                vectorClass.addString("Thread2");
                vectorClass.DeleteLastString();
                concurrentLinkedQueueClass.addInt(464646);
                concurrentLinkedQueueClass.deleteLastInt(464646);
            }
        };

        thr1.start();
        thr2.start();



    }
}
