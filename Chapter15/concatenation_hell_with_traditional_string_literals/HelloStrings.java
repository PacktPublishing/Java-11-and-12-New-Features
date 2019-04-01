package concatenation_hell_with_traditional_string_literals;

public class HelloStrings {
    public static void main(String[] args) {
        String html = "<HTML>\n\t<BODY>\n\t\t<H1>Meaning in life</H1>\n\t</BODY>\n</HTML>";

        String html2 = "<HTML>" +
                "\n\t" + "<BODY>" +
                "\n\t\t" + "<H1>Meaning of life</H1>" +
                "\n\t" + "</BODY>" +
                "\n" +
                "</HTML>";

        String html3 = "<HTML>" +
                            "\n\t" + "<BODY>" +
                                "\n\t\t" + "<H1>Meaning of life</H1>" +
                            "\n\t" + "</BODY>" +
                        "\n" + "</HTML>";
    }
}
