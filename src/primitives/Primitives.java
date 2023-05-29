package primitives;

public class Primitives {

    /**
     * 1) Discuss primitive types (and casting)
     * 2) Discuss variables and naming conventions
     * 2) Discuss operators
     * 3) Discuss primitive object wrappers (small intro to objects just a glance)
     */
    public static void main(String[] args) {
        // Primitive types
        byte myByte = 1; // 8 bits
        short myShort = 2; // 2 bytes
        int myInt = 4; // 4 bytes
        long myLong = 8; // 8 bytes

        float myFloat = 10.4F;
        double myDouble = 100.5;

        boolean myBoolean = true;
        char myChar = 'A';

        // primitive types wrappers
        Byte myWrapperByte = 1;
        Short myWrapperShort = 2;
        Integer myWrapperInteger = 10;
        Long myWrapperLong = 10L;

        Float myWrapperFloat = 10f;
        Double myWrapperDouble = 100.01;

        Boolean myWrapperBoolean = null;
        Character myWrapperChar = 'C';

        System.out.println(myInt + myLong); // returns long
        System.out.println(myInt / 3); // returns 1
        System.out.println(myDouble / 2);

        System.out.println(myChar); // returns A
        System.out.println((int) myChar); // returns int from ASCII table
    }
}
