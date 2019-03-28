package type_inference_with_interfaces;

/**
 * @author  Mala Gupta
 */

class Test {
    public static void main(String[] args) {
        var obj = new Child();              // inferred type of var obj is Child
        obj.whistle();
        obj.stand();
        obj.run();
    }
}