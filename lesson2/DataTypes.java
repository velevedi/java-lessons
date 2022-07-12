public class DataTypes {

    /**
     * byte     1 byte      Stores whole numbers from -128 to 127
     * short    2 bytes     Stores whole numbers from -32,768 to 32,767
     * int      4 bytes     Stores whole numbers from -2,147,483,648 to 2,147,483,647
     * long     8 bytes     Stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
     * float    4 bytes     Stores fractional numbers. Sufficient for storing 6 to 7 decimal digits
     * double   8 bytes     Stores fractional numbers. Sufficient for storing 15 decimal digits
     * boolean  1 bit       Stores true or false values
     * char     2 bytes     Stores a single character/letter or ASCII values
     *
     * Object representation
     */
    public static void main(String[] args) {
        byte b = 1;
        short s = 2;
        int i = 3;
        long l = 4;
        float f = 5f;
        double d = 6d;
        boolean bool = true;
        char c = 'a';

        Object o = new Object();

        Byte bt = Byte.valueOf("1");
        Short sh = Short.valueOf("2");
        Integer in = Integer.valueOf("3");
        Long ln = Long.valueOf("4");
        Float fl = Float.valueOf("5f");
        Double db = Double.valueOf("6d");
        Boolean bl = Boolean.valueOf("true");
        String st = "hello world";
    }


}
