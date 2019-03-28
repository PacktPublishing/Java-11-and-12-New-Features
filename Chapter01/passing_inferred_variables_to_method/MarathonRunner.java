package passing_inferred_variables_to_method;

/**
 * @author  Mala Gupta
 */

interface MarathonRunner {
    default void run() {
        System.out.println("I'm a marathon runner");
    }
}