package type_inference_with_derived_classes;

/**
 * @author  Mala Gupta
 */

class Test {
    public static void main(String[] args) {
        var obj = new Child();
        obj.whistle();
        obj.stand();     // type of obj inferred as Child
    }
}