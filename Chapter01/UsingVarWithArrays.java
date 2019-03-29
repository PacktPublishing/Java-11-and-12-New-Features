public class UsingVarWithArrays {
    /**
     * @author  Mala Gupta
     */

    public static void main(String[] args) {
        char name[] = {'S', 't', 'r', 'i', 'n', 'g'};

        var name[] = {'S', 't', 'r', 'i', 'n', 'g'};
        var[] name = {'S', 't', 'r', 'i', 'n', 'g'};
        var name = {'S', 't', 'r', 'i', 'n', 'g'};

        var name = new char[]{'S','t','r','i','n','g'};
    }
}
