package main;

/**
 * Created by bse71 on 09.02.2017.
 */
public class DataMangerWait {
    public static final Object lock = new Object();
    public static boolean ready = false;

    public static void sendData(){
        synchronized (lock){
            try {
                while(!ready){
                    lock.wait();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Data send");
        }
    }

    public static void prepareData(){
        synchronized (lock){
            System.out.println("Data prepared");
            ready = true;
            lock.notify();
        }
    }
}
