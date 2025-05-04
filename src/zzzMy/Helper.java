package zzzMy;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.function.BiConsumer;

public class Helper {

    Actor actor = new Actor();

    public void doSomething(BiConsumer<Message, String> consumer) throws ExecutionException, InterruptedException {

        System.out.println("[Helper] doSomething...");
        Message message = new Message();
        message.setMessage("Message Set in Helper");

        CompletableFuture<Message> completableFuture = actor.act(message, consumer);

        System.out.println("[Helper] completableFuture = " + completableFuture.get().getMessage());
    }
}
