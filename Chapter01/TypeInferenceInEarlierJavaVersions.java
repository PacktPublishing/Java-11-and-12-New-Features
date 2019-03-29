import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;

/**
 * @author  Mala Gupta
 */

public class TypeInferenceInEarlierJavaVersions {
    void typeInferenceInJava5() {
        List<Integer> myListOfIntegers = Collections.<Integer>emptyList();   // old
        List<Integer> myListOfIntegers2 = Collections.emptyList();          // new
    }

    void typeInferenceInJava7() {
        List<String> myThings = new ArrayList<String>();

        List<String> myThings2 = new ArrayList<>();

        List<String> myThings3 = new ArrayList();

        MyClass<String> myClass = new MyClass<>();
        myClass.<Boolean>print(new Boolean("true"));
        myClass.print(new Boolean("true"));

    }

    class MyClass<T> {
        public <X> void print(X x) {
            System.out.println(x.getClass());
        }
    }

    void typeInferenceInJava8() {
        Consumer<String> consumer = (String s) -> System.out.println(s);
        Consumer<String> consumer2 = s -> System.out.print(s);

    }
}
