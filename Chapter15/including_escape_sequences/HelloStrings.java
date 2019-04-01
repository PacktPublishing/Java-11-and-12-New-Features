package including_escape_sequences;

public class HelloStrings {
    public static void main(String[] args) {
        String html = "<HTML>" +
                        "\n\t" + "<BODY>" +
                        "\n\t\t" + "<H1>\\n - new line, \\t - tab</H1>" +
                        "\n\t" + "</BODY>" +
                        "\n" + "</HTML>";
    }
}
