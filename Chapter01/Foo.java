/**
 * @author  Mala Gupta
 */

class Foo {
    public static void main(String args[]) {
        try {
            char[] name = new char[]{'S', 't', 'r', 'i', 'n', 'g'};
            for (var c : name) {
                System.out.println(c + ":" + (c + 1 - 1));
            }
        // } catch (var e) {                // this line of code won't compile
        } catch (Exception e) {                // this line of code won't compile
            //code
        }
    }
}