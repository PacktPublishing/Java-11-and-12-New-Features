package working_with_custom_events;

import jdk.jfr.Event;
import jdk.jfr.Label;

class MyEvent extends Event {
    @Label("EventMessage")
    String message;
}