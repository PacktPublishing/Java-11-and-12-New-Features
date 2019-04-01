package another_syntax_for_switch_expressions;

class Planet {
    enum SingleUsePlastic {STRAW, BAG, SPOON, FORK, KNIFE, PLATE, BOTTLE}

    private static long damage;

    public void use(SingleUsePlastic plastic) {
        damage += switch (plastic) {
            case STRAW:
                break 10;       // Use colon (:) to start code,
                                // Use break to return val
            case BAG:
                break 11;
            case SPOON, FORK, KNIFE:
                break 7;
            case PLATE:
                int radius = 6;         // no need
                                        // of using curly brace
                break (radius < 10 ? 15 : 20);      // Using
                                                    // break to
                                                    // return a value
            case BOTTLE:
                break 20;
        };
    }
}