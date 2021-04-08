package level2;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingDeque;

public class ProducerConsumerProblemWithBlockingQueue {
	
	public static void main(String[] args) throws InterruptedException {
		//bounded queue
		BlockingQueue<Integer> blockingQueue = new LinkedBlockingDeque<>(2);
		ExecutorService executor = Executors.newFixedThreadPool(2);//new way
		
		Runnable producerTask = () -> {
            try {
                int value = 0;
                while (true) {
                    blockingQueue.put(value);

                    System.out.println("Produced " + value);

                    value++;

                    Thread.sleep(1000);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };
		
		/*
		 * old way Thread producerThread = new Thread(() -> { try { int value = 0; while
		 * (true) { blockingQueue.put(value);
		 * 
		 * System.out.println("Produced " + value);
		 * 
		 * value++;
		 * 
		 * Thread.sleep(1000); } } catch (InterruptedException e) { e.printStackTrace();
		 * } });
		 */
        
        Runnable consumerTask = () -> {
            try {
                while (true) {
                    int value = blockingQueue.take();

                    System.out.println("Consume " + value);

                    Thread.sleep(1000);
                }

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };
        
        executor.execute(producerTask);
        executor.execute(consumerTask);

        executor.shutdown();
	}

}
