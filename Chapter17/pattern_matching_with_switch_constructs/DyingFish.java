package pattern_matching_with_switch_constructs;

// This class will not compile with Java 12.
// Pattern matching hasn't released with Java 12.

public class DyingFish {

    void dyingFish(Object obj) {
        switch (obj) {
            case Ocean o:   System.out.println(o.getBottles());
                break;
            case Sea sea:   System.out.println(sea.getDeadFish());
                break;
            case River riv: if (riv.getPlasticBags() > 100) {
                System.out.println("Humans enjoy! Fish die!");
            }
                break;
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
    class River {
        int getPlasticBags() {
            return 10000;
        }
    }

}
