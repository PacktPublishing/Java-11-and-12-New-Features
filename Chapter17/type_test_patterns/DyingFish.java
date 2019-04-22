package type_test_patterns;

// This class will not compile with Java 12.
// Pattern matching hasn't released with Java 12.

public class DyingFish {
    void dyingFish(Object obj) {
        if (obj matches Ocean o) {                          // check & bind
            System.out.println(o.getBottles());             // extract
        }
    else if (obj matches Sea sea) {                       // test
            System.out.println(sea.getDeadFish());
        }
    else if (obj matches River riv) {                     // test
            if (riv.getPlasticBags() > 100) {      // cast & destruct
                System.out.println("Say no to plastic bags. Fish are
                        dying!");
            }
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
