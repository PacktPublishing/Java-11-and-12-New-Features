package working_with_custom_events;

public class WithCustomEvents {
    public static void main(String... args) throws Exception {
        for (int i = 0; i < 500; i++) {
            new Thread(new AThread("Thread" + i)).start();
        }
    }
}