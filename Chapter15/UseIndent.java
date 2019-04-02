/*
The code won't compile with Java 12. Raw String literals is in works at Oracle.
 */
public class UseIndent {
    public static void main(String[] args) {
        String comment =
                `one
                    of
                            my
                        favorite
                            lang
                                feature
            from Amber(!) `
        .align().indent(15);
        System.out.println(comment);
    }
}
`