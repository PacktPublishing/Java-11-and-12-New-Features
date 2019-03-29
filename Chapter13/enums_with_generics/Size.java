package enums_with_generics;

/*
 * Code in this enum won't compile (usage of generics)
 * Enhanced enums isn't part of a Java release yet.
 * To compile the code, download relevant repository
 * from Oracle.com
 */

enum Size<T extends Measurement> {      // enum with type parameter
    SMALL(new Small()),
    MEDIUM(new Medium()),
    LARGE(new Large());
    private T mObj;

    Size(T obj) {
        mObj = obj;
    }

    T getMeasurement() {
        return mObj;
    }
}

class Measurement {
}

class Small extends Measurement {
    String text = "Small";
}

class Medium extends Measurement {
}

class Large extends Measurement {
    public int getLength() {
        return 40;
    }
}
    }