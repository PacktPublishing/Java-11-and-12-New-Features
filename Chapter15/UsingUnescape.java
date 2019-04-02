public class UsingUnescape {
    public static void main(String[] args) {
        System.out.print("eJava");
        System.out.print("\\n");
        System.out.print("Guru");

        System.out.print("eJava");
        System.out.print(`\n`.unescape());      // Don't ignore the escape char
        System.out.print("Guru");

        System.out.print(`\n`.unescape().length());
    }
}
