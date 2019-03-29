import java.util.ArrayList;
import java.util.List;

/**
 * @author  Mala Gupta
 */

public class TypeInferenceWithGenerics {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();

        var names = new ArrayList<>();
        names.add(1);
        names.add("Mala");
        names.add(10.9);
        names.add(true);

        var names = new ArrayList<String>();
    }
}
