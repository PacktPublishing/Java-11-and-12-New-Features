class var {
}                           // can't use var as class name

interface var {
}                           // can't use var as interface name

class Demo {
    //int var = 100;         // can use var as instance variable name
    static long var = 121;   // can use var as static variable name

    void var() {                 // can use var as method name
        int var = 10;            // can use var as the name of a local variable
    }

    void aMethod(String var) {
    }                           // can use var as the name of method parameter
}

