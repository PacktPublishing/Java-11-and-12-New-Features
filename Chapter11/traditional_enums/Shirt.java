package traditional_enums;

enum Size {XS, S, M, L, XL, XXL};

class Shirt {
    private int length;

    public void setSize(Size size) {
        switch (size) {
            case XS:
                length = 10;
                System.out.println(length);
                break;
            case S:
                length = 12;
                System.out.println(length);
                break;
            case M:
                length = 14;
                System.out.println(length);
            case L:
                length = 16;
                break;
            case XL:
                length = 18;
                System.out.println(length);
                break;
            case XXL:
                length = 20;
                System.out.println(length);
                break;
        }
    }

    public static void main(String[] args) {
        Shirt s = new Shirt();
        s.setSize(Size.XXL);
        System.out.println(s.length);

        Shirt s2 = new Shirt();
        s2.setSize(Size.M);
        System.out.println(s2.length);
    }
}