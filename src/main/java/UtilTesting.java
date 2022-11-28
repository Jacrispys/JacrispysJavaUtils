import utils.*;

import java.util.Arrays;

public class UtilTesting {

    public static void main(String[] args) {
        System.out.println(CollectionUtils.findMode("Testingsg"));
        System.out.println(CollectionUtils.findMode(Arrays.asList("a", "b", "a", "b")));
    }
}
