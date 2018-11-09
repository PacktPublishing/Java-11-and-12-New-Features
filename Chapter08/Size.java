final class Size extends Enum                 // 'enum' converted to final class  
{ 
    public static final Size SMALL;           // variables to store  
    public static final Size MEDIUM;          // enum constants 
    public static final Size LARGE;           //  
 
    private static final Size $VALUES[];    // array of all enum constants 
 
    static 
    {                                       // static initializer 
        SMALL = new Size("SMALL", 0);       // to initialize enum constants 
        MEDIUM = new Size("MEDIUM", 1);     // 
        LARGE = new Size("LARGE", 2);       // 
        $VALUES = (new Size[] {             // 
            SMALL, MEDIUM, LARGE            // & populate array of enum // constants 
        }); 
    } 
    public static Size[] values() 
    { 
        return (Size[])$VALUES.clone();       // Avoiding any modification to  
    }                                // $VALUES by calling methods 
    public static Size valueOf(String s) 
    { 
        return (Size)Enum.valueOf(Size, s); 
    } 
    private Size(String s, int i) 
    { 
        super(s, i); 
    } 
} 