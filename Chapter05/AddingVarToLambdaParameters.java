import java.util.List;
import java.util.Optional;
import java.util.function.*;

public class AddingVarToLambdaParameters {
    public static void main(String[] args) {

        Predicate<Integer> predicate = (var age) -> age > 10;

        Function<Integer, String> function = (var age) -> age > 10 ? "Kid" : "Not a Kid";

        Consumer<Integer> consumer = (var age) -> {
            System.out.println();
        };

        Supplier<String> supplier = () -> {
            return Math.random() + "Number";
        };

        // input name, List<person> and return Optional<Integer>
        BiFunction<String, List<Person>, Optional<Integer>> firstElement =
                (var name, var list) -> {
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

