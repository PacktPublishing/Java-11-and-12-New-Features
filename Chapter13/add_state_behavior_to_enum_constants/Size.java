package add_state_behavior_to_enum_constants;

enum Size {
    SMALL(36, 19),
    MEDIUM(32, 20) {          // Constant specific class body
        int number = 10;                    // variable specific to MEDIUM

        int getSize() {                     // method specific to MEDIUM
            return length + width;
        }
    },

    LARGE(34, 22) {
        @Override
        public String toString() {          // overriding method toText
            // for
            return "LARGE";                 // constant LARGE
        }
    };

    int length;                             // instance variable accessible
    int width;                              // to all enum constants

    Size(int length, int width) {           // enum constructor;
        // accepts length and width
        this.length = length;
        this.width = width;
    }

    int getLength() {                       // method accessible to all enum constants
        return length;                      // constants
    }

    int getWidth() {                        // method accessible to all enum constants
        return width;                       // constants
    }

    public String toText() {               // method accessible to all enum
        return length + " X " + width;     // constants
    }
}