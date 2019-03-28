import java.util.List;
import java.util.Optional;
import java.util.function.*;

public class ExplicitlyTypedLambdaExpressions {
    public static void main(String[] args) {

        // input Integer, return Boolean
        Predicate<Integer> predicate = (Integer age) -> age > 10;

        // input Integer, return String
        Function<Integer, String> function = (Integer age) -> age > 10 ? "Kid" : "Not a Kid";

        // input Integer, return void
        Consumer<Integer> consumer = (Integer age) -> {
            System.out.println();
        };

        // input none, return String
        Supplier<String> supplier = () -> {
            return Math.random() + "Number";
        };

        // input name, List<person> and return Optional<Integer>
        BiFunction<String, List<Person>, Optional<Integer>> firstElement =
        (String name, List<Person> list) -> {
            return (
                    list.stream().
                            filter(e -> e.getName().startsWith(name)).
                            map(Person::getAge).
                            findFirst()
            );
        };
    }

    class Person {
        int age;
        String name;

        String getName() {
            return name;
        }

        Integer getAge() {
            return age;
        }
    }
}
