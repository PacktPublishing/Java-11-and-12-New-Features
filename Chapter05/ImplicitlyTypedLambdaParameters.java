import java.util.List;
import java.util.Optional;
import java.util.function.*;

public class ImplicitlyTypedLambdaParameters {
    public static void main(String[] args) {

        Predicate<Integer> predicate = (age) -> age > 10;

        Function<Integer, String> function = (age) -> age > 10 ? "Kid" : "Not a Kid";

        Consumer<Integer> consumer = (age) -> {
            System.out.println();
        };

        Supplier<String> supplier = () -> {
            return Math.random() + "Number";
        };

        // input name, List<person> and return Optional<Integer>
        BiFunction<String, List<Person>, Optional<Integer>> firstElement =
                (name, list) -> {
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

