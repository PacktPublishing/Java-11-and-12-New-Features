package disambiguation_of_functional_expressions.existing_issues;

class FunctionalDisambiguation {
    public static void main(String args[]) {
        SwimmingMeet.evaluate(a -> false); // This code WON'T compile

        SwimmingMeet.evaluate((String a) -> false);         // This compiles!!
    }
}