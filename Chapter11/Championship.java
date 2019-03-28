
class Championship {
    static boolean prize(Integer lapTime) {
        return(lapTime < 60);
    };
    static boolean prize(String lap) {
        return(lap.equalsIgnoreCase("final "));
    }
}