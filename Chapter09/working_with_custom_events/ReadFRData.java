package working_with_custom_events;

import jdk.jfr.consumer.RecordedEvent;
import jdk.jfr.consumer.RecordingFile;

import java.nio.file.Path;
import java.nio.file.Paths;

class ReadFRData {
    public static void main(String args[]) throws Exception {
        Path p = Paths.get("CustomEvents.jfr");
        for (RecordedEvent e : RecordingFile.readAllEvents(p)) {
            System.out.println(e.getStartTime() +
                    " : " +
                    e.getValue("message"));
        }
    }
}