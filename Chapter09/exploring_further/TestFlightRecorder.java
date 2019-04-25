package exploring_further;

public class TestFlightRecorder {
    public static void main(String... args) throws Exception {
        for (int i = 0; i < 500; i++) {
            new Thread(new AThread("Thread" + i)).start();
        }
    }
}