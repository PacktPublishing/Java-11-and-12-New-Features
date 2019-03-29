package inheritance;

public class Test1 {
    public static void main(String[] args) {
        var large = Size.LARGE;

        // if uncommented, the following line won't compile
        // the type of the variable used to wrap the value of enum
        // constant is Measurement
        // System.out.println(large.getMeasurement().getLength());
    }
}
