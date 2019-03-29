package inheritance;

enum Size {
    SMALL(new Small()),
    MEDIUM(new Medium()),
    LARGE(new Large());
    private Measurement mObj;

    Size(Measurement obj) {
        mObj = obj;
    }
    Measurement getMeasurement() {
        return mObj;
    }
}