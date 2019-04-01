package workarounds_to_access_enum_constants;

enum Size {
    SMALL(36, 19),
    MEDIUM(32, 20),
    LARGE(34, 22);

    int length;                            // instance variable accessible
    int width;                             // to all enum constants

    Size(int length, int width) {          // enum constructor; accepts length
        this.length = length;             // and width
        this.width = width;
    }

    int getSize() {
        if (this == MEDIUM) return length + width;
        else                                           // throws runtime exception
            throw new UnsupportedOperationException();   // if used with constants
    }                                                 // other than MEDIUM
}