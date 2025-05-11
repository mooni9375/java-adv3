package optional;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class OptionalStartMain2 {

    private static final Map<Long, String> map = new HashMap<>();

    static {
        map.put(1L, "Kim");
        map.put(2L, "Seo");
    }

    public static void main(String[] args) {
        findAndPrint(1L);   // 값이 있는 경우
        findAndPrint(3L);   // 값이 없는 경우
    }

    static void findAndPrint(Long id) {
        Optional<String> optName = findNameById(id);
        String name = findNameById(id).orElse("UNKNOWN");
//        System.out.println("name = " + optName.orElse("UNKNOWN"));
        System.out.println("name = " + name.toUpperCase());
    }

    static Optional<String> findNameById(Long id) {
        String findName = map.get(id);
        Optional<String> optName = Optional.ofNullable(findName);
        return optName;
    }


}
