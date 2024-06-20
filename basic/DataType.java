package basic;

public class DataType {
    public static void main(String[] args) {
        // primitif default value 0
        byte itByte = 1;
        short itShort = 1;
        int itInt = 1;
        long itLong = 1;

        float itFloat = 0.5F;
        double itDouble = 0.5;

        char itChar = 'A';
        boolean itBool = true;

        System.out.println(itByte);
        System.out.println(itShort);
        System.out.println(itInt);
        System.out.println(itLong);
        System.out.println(itFloat);
        System.out.println(itDouble);
        System.out.println(itChar);
        System.out.println(itBool);

        // Bukan Primitif
        Byte iniByte = null;
        Short iniShort = null;
        Integer iniInteger = null;
        Long iniLong = null;
        Float iniFloat = null;
        Double iniDouble = null;
        String iniString = null;
        Boolean iniBoolean = null;
        Character iniCharacter = null;

        System.out.println(iniByte);
        System.out.println(iniShort);
        System.out.println(iniInteger);
        System.out.println(iniLong);
        System.out.println(iniFloat);
        System.out.println(iniDouble);
        System.out.println(iniString);
        System.out.println(iniBoolean);
        System.out.println(iniCharacter);

        // conversion
        iniByte = itByte;
        iniShort = itShort;
        iniInteger = itInt;
        iniLong = itLong;
        iniFloat = itFloat;
        iniDouble = itDouble;
        // iniBoolean = itBool;//tidak bisa
        // iniCharacter = itChar;//tidak bisa
        iniString = "Agus Sutarom";
        System.out.println(iniByte);
        System.out.println(iniShort);
        System.out.println(iniInteger);
        System.out.println(iniLong);
        System.out.println(iniFloat);
        System.out.println(iniDouble);
        System.out.println(iniString);

        // bukan primitif bisa mempunyai fungsi bawaan
        System.out.println(iniString.length());
        short thisShort = iniInteger.shortValue();
        System.out.println(thisShort);
    }
}
