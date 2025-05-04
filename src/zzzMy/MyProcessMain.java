package zzzMy;

import java.util.concurrent.ExecutionException;

public class MyProcessMain {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        Handler handler = new Handler();
        
        handler.myProcess();
    }
}
