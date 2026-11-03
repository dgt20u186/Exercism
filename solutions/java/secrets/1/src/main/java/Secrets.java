public class Secrets {
    public static int shiftBack(int value, int amount) {
        String[] myArray = new String[] { Integer.toString(value) };
        if (myArray[0] == "0") {
            return value >> amount;
        } else {
             return value >>> amount;   
        }
    }

    public static int setBits(int value, int mask) {
        return value | mask;
    }

    public static int flipBits(int value, int mask) {
        return value ^ mask;
    }

    public static int clearBits(int value, int mask) {
        return value & ~mask;
    }
}