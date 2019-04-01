package local_variable_switch_branch;

class Planet {

    enum SingleUsePlastic {STRAW, BAG, SPOON, FORK, KNIFE, PLATE, BOTTLE}

    private static long damage;

    public void use(SingleUsePlastic plastic) {
        damage += switch (plastic) {
            case STRAW -> 10;
            case BAG -> 11;
            case SPOON, FORK, KNIFE -> 7;
            case PLATE -> {
                int radius = 20;  // Local variable
                break (radius < 10 ? 15 : 20);          // Using break to return a value
            }
            case BOTTLE -> 20;
        };
    }
}