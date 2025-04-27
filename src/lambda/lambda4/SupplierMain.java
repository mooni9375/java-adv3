package lambda.lambda4;

import java.util.UUID;
import java.util.function.Supplier;

public class SupplierMain {

    public static void main(String[] args) {

        Supplier<UUID> supplier = () -> UUID.randomUUID();

        UUID uuid = supplier.get();

        System.out.println("supplier.get() = " + uuid);
    }

}
