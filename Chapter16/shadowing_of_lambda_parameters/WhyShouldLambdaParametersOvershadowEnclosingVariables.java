package shadowing_of_lambda_parameters;

import java.util.List;

/*
The code won't compile with Java 12. Lambda leftovers is in works at Oracle.
 */

public class WhyShouldLambdaParametersOvershadowEnclosingVariables {
    void process() {
        List<String> talks = List.of("Kubernetes", "Docker", "Java 11");
        String key = "Docker"; // local variable key
        talks.stream()
                .map(key -> key.toUpperCase())         // WON'T compile : 'key' redefined
                .forEach(System.out::println);
    }

    void knownIssue() {
        List<String> talks = List.of("Kubernetes", "Docker", "Java 11");
        String key = "Docker"; // local variable key
        talks.stream()
            .map(key -> key.concat(key))
            .forEach(System.out::println);
    }


}
