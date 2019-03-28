import java.time.LocalDateTime;
import java.util.HashMap;

/**
 * Java version required to compile and use this code: Java 10 or later.
 * @author  Mala Gupta
 */

public class TypeInferenceWithVar2 {
    public static void main(String[] args) {

        var name = "Java Everywhere";            // variable 'name' inferred as String
        var dateTime = LocalDateTime.now();      // variable 'dateTime' inferred as LocalDateTime

        var map = new HashMap<Integer, String>();
    }
}
