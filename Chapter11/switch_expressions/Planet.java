package switch_expressions;

enum SingleUsePlastic {STRAW, BAG, SPOON, FORK, KNIFE, PLATE, BOTTLE};

class Planet {
    private static long damage;

    public void use(SingleUsePlastic plastic) {
        switch (plastic) {
            case STRAW:
                damage += 10;
                break;
            case BAG:
                damage += 11;
                break;
            case SPOON:
                damage += 7;
                break;
            case FORK:
                damage += 7;
                break;
            case KNIFE:
                damage += 7;
                break;
            case PLATE:
                damage += 15;
                break;
            case BOTTLE:
                damage = 20;
                break;
        }
    }

    public static void calcDamage(SingleUsePlastic plastic) {
        damage += switch (plastic) {
            case STRAW -> 10;
            case BAG -> 11;
            case SPOON, FORK, KNIFE -> 7;
            case PLATE -> 15;
            case BOTTLE -> 20;
        };
    }
}