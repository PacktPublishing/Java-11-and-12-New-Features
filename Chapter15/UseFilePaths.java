/*
The code won't compile with Java 12. Raw String literals is in works at Oracle.
 */
public class UseFilePaths {
    public static void main(String[] args) {
        String filePath = "C:\\Mala\\eJavaGuru\\ocp11.txt";
        String rawFilePath = `C:\Mala\eJavaGuru\ocp11.txt`;
    }
}
