/*
The code won't compile with Java 12. Raw String literals is in works at Oracle.
 */
public class UsingEscape {
    public static void main(String[] args) {
        System.out.println("eJava" + "\n".escape() + "Guru");
        System.out.println("eJava" + `•`.escape());
    }
}
