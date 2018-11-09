interface Swimmer {                             // test METHOD IS 
                                                // MODIFIED
    boolean test(int lap);                      // String lap changed //to int lap
}
interface Diver {
    String dive(int height);
}
class SwimmingMeet {
    static void evaluate(Swimmer swim) {              // code compiles
        System.out.println("evaluate swimmer");
    }
    static void evaluate(Diver diver) {               // code compiles
        System.out.println("evaluate diver");
    }
}