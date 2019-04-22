package an_example;

import java.util.function.BiFunction;

/*
The code won't compile with Java 12. Lambda leftovers is in works at Oracle.
 */

public class Example {
    // the following line of code won't compile.
    //BiFunction<Integer, String, Boolean> calc = (age, _) -> age > 10;

    // Approach 1
    // Pass null to the unused parameter
    BiFunction<Boolean, Integer, Boolean> calc1 = (age, null) -> age > 10;

    // Approach 2
    // Pass empty string to the unused parameter
    BiFunction<Boolean, Integer, String> calc2 = (age, "") -> age > 10;

    // Approach 3
    // Pass ANY String value to the unused parameter
    // - doesn't matter, since it is not used
    BiFunction<Boolean, Integer, String> calc3 = (age, "Ban plastic straws") -> age > 10;

    // Approach 4
    // Pass any variable (of the same type) to the unused parameter
    // - doesn't matter, since it is not used
    BiFunction<Boolean, Integer, String> calc4 = (age, name) -> age > 10;

}
