package existing_issues_with_type_testing;

public class UseInstanceofOperator {
    public static void main(String[] args) {
        Object obj = new Ocean();                         // variable type - Object
        if (obj instanceof Ocean) {                         // check instance type
            System.out.println(((Ocean) obj).getBottles());  // cast & extract value
        }

    }

    // A simple class - Ocean
    class Ocean {
        private long bottles;

        public long getBottles() {
            return bottles;
        }
    }

}
