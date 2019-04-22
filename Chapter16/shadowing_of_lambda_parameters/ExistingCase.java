package shadowing_of_lambda_parameters;

/*
The code won't compile with Java 12. Lambda leftovers is in works at Oracle.
 */

import java.util.List;

public class ExistingCase {
    public static void main(String[] args) {
        List<String> talks = List.of("Kubernetes", "Docker", "Java 11");
        talks.stream()
                .map(key -> key.toUpperCase())
                .forEach(System.out::println);
    }

    void process() {
        List<String> talks = List.of("Kubernetes", "Docker", "Java 11");
        String key = "Docker"; // local variable key
        talks.stream()
                .map(key -> key.toUpperCase())       // WON'T compile: 'key' redefined
                .forEach(System.out::println);
    }
}
