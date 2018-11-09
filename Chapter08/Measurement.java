class Measurement {}                      // base class 
class Small extends Measurement {         // derived class 
    String text = "Small";                // state specific to class //Small 
} 
class Medium extends Measurement {        // derived class 
    public int getLength() {              // behavior specific to class //Medium 
        return 9999; 
    } 
} 
class Large extends Measurement {}        // derived class 
 
enum Size {                                
    SMALL(new Small()),                // constant created using Small //instance 
    MEDIUM(new Medium()),              // constant created using Medium //instance 
    LARGE(new Large());                // constant created using Large //instance 
 
    private Measurement mObj;     // Measurement is base class of  
                                  // classes Small, Medium & Large 
 
    Size(Measurement obj) {     // wraps Measurement instance as an //Enum instance 
        mObj = obj; 
    } 
    Measurement getMeasurement() { // get the wrapped instance 
        return mObj; 
    } 
} 