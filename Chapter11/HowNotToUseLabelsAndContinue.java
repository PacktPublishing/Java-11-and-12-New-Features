public class HowNotToUseLabelsAndContinue {
    enum SingleUsePlastic {STRAW, BAG, SPOON, FORK, KNIFE, PLATE, BOTTLE}

    private static long damage;

    public void use(SingleUsePlastic plastic) {
        myLabel:                                // Label
        for (int i = 0; i < 2; i++) {
            damage += switch (plastic) {
                case SPOON, FORK, KNIFE:
                    break 7;
                case PLATE:
                    continue myLabel;           // NOT allowed
                                                // illegal
                                                // jump
                                                // through
                                                // switch
                                                // expression
            };
        }
    }
}
            }
