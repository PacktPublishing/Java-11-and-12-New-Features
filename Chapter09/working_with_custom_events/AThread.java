package working_with_custom_events;

import java.util.ArrayList;
import java.util.Random;

class AThread implements Runnable {
    String name = "default";
    private Random numGenerator = new Random();
    private ArrayList<Double> list = new ArrayList<Double>(1000000);

    AThread(String name) {
        this.name = name;
    }

    public void run() {
        MyEvent event;
        for (int i = 0; i < 1000000; i++) {
            list.add(numGenerator.nextDouble());
            event = new MyEvent();
            event.message = "Allocated : " + name + "[" + i + "]";
            event.commit();
        }
    }
}
