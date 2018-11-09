class Test1 { 
    public static void main(String args[]) { 
        var large = Size.LARGE; 
        System.out.println(large.getMeasurement()
                             .getLength());      // doesn't compile 
                                                 // the type of the                                                     // variable used 
                                                 // to wrap the value                                                  // of enum  
                                                 // constant is                                                          // Measurement  
    } 
} 