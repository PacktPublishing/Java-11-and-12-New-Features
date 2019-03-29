package type_inference_with_derived_classes_2;

/**
 * @author  Mala Gupta
 */

class Test {
    public static Parent getObject(String type) {
        if (type.equals("Parent")) return new Parent();
        else return new Child();
    }

    public static void main(String[] args) {
        var obj = getObject("Child");
        obj.whistle();
        obj.stand();              // This line doesn't compile
    }
}