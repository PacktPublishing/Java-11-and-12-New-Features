package type_inference_with_interfaces;

/**
 * @author  Mala Gupta
 */

class Test2 {
    public static MarathonRunner getObject() {
        return new Child();
    }

    public static void main(String[] args) {
        var obj = getObject();      // inferred type of var obj is MarathonRunner
        obj.whistle();              // This won't compile
        obj.stand();                // This won't compile
        obj.run();
    }
}