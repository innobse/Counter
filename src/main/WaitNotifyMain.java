package main;

import java.util.Random;

/**
 * Created by bse71 on 09.02.2017.
 */
public class WaitNotifyMain {


    public static void main(String[] args) {
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                Random rand = new Random();
                try{
                    Thread.sleep(rand.nextInt(1000));
                } catch (InterruptedException e){
                    e.printStackTrace();
                }
                DataMangerWait.prepareData();
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                Random rand = new Random();
                try{
                    Thread.sleep(rand.nextInt(1000));
                } catch (InterruptedException e){
                    e.printStackTrace();
                }
                DataMangerWait.sendData();
            }
        });
        thread1.start();
        thread2.start();
    }
}
