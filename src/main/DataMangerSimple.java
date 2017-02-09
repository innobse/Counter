package main;

/**
 * Created by bse71 on 09.02.2017.
 */
public class DataMangerSimple {
    private static boolean ready = false;

    public static void sendData(){
        while(!ready){
            System.out.println("Waiting for data...");
        }
        System.out.println("Data send!");
    }

    public static void prepareData(){
        System.out.println("Data prepared");
        ready = true;
    }
}
