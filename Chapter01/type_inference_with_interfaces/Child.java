package type_inference_with_interfaces;

/**
 * @author  Mala Gupta
 */

class Child implements MarathonRunner {
    void whistle() {
        System.out.println("Child-Whistle");
    }

    void stand() {
        System.out.println("Child-stand");
    }
}