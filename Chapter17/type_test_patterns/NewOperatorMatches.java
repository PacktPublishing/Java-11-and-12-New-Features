package type_test_patterns;

// This class will not compile with Java 12.
// Pattern matching hasn't released with Java 12.

public class NewOperatorMatches {
    public static void main(String[] args) {
        Object obj = new Ocean();                         // variable type - Object
        if (obj matches Ocean o) {                        // check & bind
            System.out.println(o.getBottles());           // extract
        }
    }

    // Sample classes with integer literal values being returned from methods
    // This has been done deliberately to keep the code simple
    //
    class Ocean {
        int getBottles() {
            return 10;
        }
        int getPlasticBags() {
            return 100;
        }
    }
    class Sea {
        int getDeadFish() {
            return 1000;
        }
    }
    class River {  }

}
