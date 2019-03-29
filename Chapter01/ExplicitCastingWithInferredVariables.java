/**
 * @author  Mala Gupta
 */

public class ExplicitCastingWithInferredVariables {
    public static void main(String[] args) {
        var age = 29;           // inferred type of age is int

        byte age = 29;                // Option 1 - no type inference
        var age = (byte) 29;           // Option 2 - explicit casting

        var letter = (char) 97;        // inferred type of letter is char
        var debit = (float) 17.9;      // inferred type of debit is float

        var obj = (Automobile)new Car();
        obj.check();                    // Won't compile; type of obj is Automobile
    }

    class Automobile {
    }

    class Car extends Automobile {
        void check() {
        }
    }
}

