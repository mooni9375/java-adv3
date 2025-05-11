package zzzMy;

import java.util.concurrent.CompletableFuture;
import java.util.function.BiConsumer;

public class Actor {

    public CompletableFuture<Message> act(Message message, BiConsumer<Message, String> consumer) {

        System.out.println("[Actor] act...");

        CompletableFuture<Message> completableFuture = new CompletableFuture<>();
        System.out.println("[Actor] message.getMessage() = " + message.getMessage());

        try {
            throw new Exception("Exception in Actor");
            // consumer.accept(message, "Success Message set in Actor by consumer");
            // completableFuture.complete(message);

        } catch (Exception e) {
            consumer.accept(message, "Fail Message set in Actor by consumer");
            completableFuture.completeExceptionally(e);
        }

        return completableFuture;


    }
}
