package zzzMy;

import java.util.concurrent.ExecutionException;

public class Handler {

    private Helper helper = new Helper();

    public void myProcess() throws ExecutionException, InterruptedException {
        System.out.println("[Handler] myProcess...");

        helper.doSomething(this::updateMessage);

        helper.doSomething((message, msg) -> {
            updateMessage(message, msg);
        });
    }

    public void updateMessage(Message message, String msg) {
        message.setMessage(msg);
        System.out.println("[Handler] updateMessage..." + message.getMessage());
    }
}
