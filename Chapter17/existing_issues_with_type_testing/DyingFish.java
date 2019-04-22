package existing_issues_with_type_testing;

public class DyingFish {
    void dyingFish(Object obj) {
        if (obj instanceof Ocean) {                          // test
            System.out.println(((Ocean)obj).getBottles());   // cast &
            // destruct
        }
        else if (obj instanceof Sea) {                       // test
            System.out.println(((Sea)obj).getDeadFish());
        }
        else if (obj instanceof River) {                     // test
            if ( ((Ocean)obj).getPlasticBags() > 100) {      // cast &
                // destruct
                System.out.println("Say no to plastic bags. Fish are dying!");
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
