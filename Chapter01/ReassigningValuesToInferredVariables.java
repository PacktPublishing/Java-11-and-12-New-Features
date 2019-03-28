/**
 * @author  Mala Gupta
 */

public class ReassigningValuesToInferredVariables {
    public static void main(String[] args) {
        var age = 9;     // type of variable age inferred as int
        age = 10.9;      // can't assign 10.9 to variable of type int

        var query = new StringBuilder("SELECT");        // Type of variable
                                                        // query is StringBuilder
        query = query.toString() + "FROM" + "TABLE";    // won't compile
                                                        // can't assign String
                                                        // to variable query
    }
}
