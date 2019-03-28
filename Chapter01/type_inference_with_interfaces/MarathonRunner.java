package type_inference_with_interfaces;

/**
 * @author  Mala Gupta
 */

interface MarathonRunner {
    default void run() {
        System.out.println("I'm a marathon runner");
    }
}
