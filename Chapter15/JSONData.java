/*
The code won't compile with Java 12. Raw String literals is in works at Oracle.
 */
public class JSONData {
    public static void main(String[] args) {

        String data =
                "{\"plastic\": { \n" +
                        "\"id\": \"98751\", \n" +
                            "\"singleuse\": { \n" +
                                "\"item\": [ \n" +
                                    "{\"value\": \"Water Bottle\", \"replaceWith\": \"Steel Bottle()\"}, \n" +
                                    "{\"value\": \"Straw\", \"replaceWith\": \"Ban Straws\"}, \n" +
                                    "{\"value\": \"Spoon\", \"replaceWith\": \"Steel Spoon\"} \n" +
                            "] \n" +
                        "} \n" +
                    "}}";


        String data2 =
                ```{"plastic": {
                    "id": "98751",
                        "singleuse": {
                            "item": [
                                {"value": "Water Bottle", "replaceWith": "Steel Bottle()"},
                                {"value": "Straw", "replaceWith": "Ban Straws"},
                                {"value": "Spoon", "replaceWith": "Steel Spoon"}
                            ]
                        }
                    }}```;
    }
}
