package basic;

public class Number {
    public static void main(StringSection[] args) {
        byte iniByte = 100;
        short iniShort = 1000;
        int iniInt = 1000000;
        long iniLong = 1000000;
        long iniLong2 = 1000000L;

        System.out.println(iniByte);
        System.out.println(iniShort);
        System.out.println(iniInt);
        System.out.println(iniLong);
        System.out.println(iniLong2);

        float iniFloat = 10.12F;
        float iniFloat2 = 11.22F;
        double iniDouble = 12.2334;
        System.out.println(iniFloat);
        System.out.println(iniFloat2);
        System.out.println(iniDouble);

        // menggunakan underscore
        long pakaiUnderscore = 1_000_000_000L;
        int pakaiUnderscore2 = 1_000_000;
        System.out.println(pakaiUnderscore);
        System.out.println(pakaiUnderscore2);

        // Literal
        int decimalInt = 25;
        int hexaDecimalInt = 0xA123B;
        int binaryInt = 0b010110110;
        System.out.println(decimalInt);
        System.out.println(hexaDecimalInt);
        System.out.println(binaryInt);
    }
}
