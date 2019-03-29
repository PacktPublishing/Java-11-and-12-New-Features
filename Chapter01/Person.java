import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Java version required to compile and use this code: Java 10 or later.
 * @author  Mala Gupta
 */

public class Person {
    {
        var name = "Aqua Blue";         // instance initializer block
    }
    static {
        var anotherLocalVar = 19876;    // static initializer block
    }

    Person() {
        var ctr = 10;                                      // constructor
        for (var loopCtr = 0; loopCtr < 10; ++loopCtr) {   // loop - for
            switch(loopCtr) {
                case 7 :{
                    var probability = ctr / loopCtr;       // switch
                    System.out.println(probability);
                    break;
                }
            }
        }
    }

    public String readFile() throws IOException {
        var filePath = "data.txt";

        // try with resources
        try (var reader = new BufferedReader(new FileReader(filePath))) {
            return reader.readLine();
        }
    }
}