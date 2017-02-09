package main;

import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by bse71 on 09.02.2017.
 */
public class AtomicMain {
    public static AtomicInteger count
            = new AtomicInteger(0);
    public static void main(String[] args) {
        Runnable mRunnable = new Runnable() {
            @Override
            public void run() {
                Random rand = new Random();
                count.addAndGet(1);
                System.out.println(count);
            }
        };
        for(int i = 0; i < 100; i++){
            Thread thread = new Thread(mRunnable);
            thread.start();
        }
    }
}
