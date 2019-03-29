package type_inference_with_derived_classes;

/**
 * @author  Mala Gupta
 */

class Child extends Parent {
    void whistle() {
        System.out.println("Child-Whistle");
    }

    void stand() {
        System.out.println("Child-stand");
    }
}