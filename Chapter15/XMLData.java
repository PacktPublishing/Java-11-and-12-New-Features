/*
The code won't compile with Java 12. Raw String literals is in works at Oracle.
 */
public class XMLData {
    public static void main(String[] args) {
        /*
        Sample XML data
        <plastic id="98751">
            <singleuse>
                <item value="Water Bottle" replaceWith="Steel bottle" />
                <item value="Straw" replaceWith="Ban Straws" />
                <item value="spoon" replaceWith="Steel Spoon" />
            </singleuse>
        </plastic>
         */

        String data =
                "<plastic id=\"98751\">\n" +
                        "<singleuse>\n" +
                        "<item value=\"Water Bottle\" replaceWith=\"Steel bottle\" />\n" +
                        "<item value=\"Straw\" replaceWith=\"Ban Straws\" />\n" +
                        "<item value=\"spoon\" replaceWith=\"Steel Spoon\" />\n" +
                        "</singleuse>\n" +
                        "</plastic>";


        String dataUsingRawStrings =
                ```
                <plastic id="98751">
                    <singleuse>
                        <item value="Water Bottle" replaceWith="Steel bottle" />
                        <item value="Straw" replaceWith="Ban Straws" />
                        <item value="spoon" replaceWith="Steel Spoon" />
                    </singleuse>
                </plastic>
                ```;

    }
}
