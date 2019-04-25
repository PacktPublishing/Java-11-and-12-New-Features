public class Outer {
    private int outerInt = 20;
    public class Inner {
        int innerInt = outerInt;     // Can Inner access outerInt?
    }
}