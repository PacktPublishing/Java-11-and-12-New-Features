import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FilterReader;

/**
 * This class includes code snippets from chapter 1, section - Using var with primitive data types
 *
 * If you compare the name of some of the variables in the book, you'll
 * notice that some of the variable names have been modified in this class.
 *
 * For example, counter to counter2, divResult to devResult2 and others.
 *
 * This section used multiple lines of code (with same variable name) to show
 * correct and incorrect variable assignmensts. I also used the same variable name to
 * highlight difference in the value that would be assigned to it, if I change the
 * expression on the right. However, without a change in the variable name, this code
 * wouldn't compile.
 *
 * Java version required to compile and use this code: Java 10 or later.
 *
 * @author  Mala Gupta
 */

public class UsingVarWithPrimitiveDataTypes {

    public static void main(String[] args) {

        // var counter = 9_009_998_992_887;         // code doesn't compile

        var counter2 = 9_009_998_992_887L;       // code compiles

        var aChar = (char)91;

        // type of result inferred as int; 'result' stores 2
        var divResult = 5/2;

        // result of (5/2), that is 2 casted to a double; divResult stores 2.0
        var divResult2 = (double)(5/ 2);

        // operation of a double and int results in a double; divResult stores
        // 2.5
        var divResult3 = (double)5/ 2;

        byte b1 = 10;
        char c1 = 9;
        var sum = b1 + c1;        // inferred type of sum is int

        byte cupsOfCoffee = 10;
        long population = 10L;
        float weight = 79.8f;
        double distance = 198654.77;

        var total1 = cupsOfCoffee + population;     // inferred type of total1 is long
        var total2 = distance + population;         // inferred type of total2 is double
        var total3 = weight + population;           // inferred type of total3 is float
    }
}
