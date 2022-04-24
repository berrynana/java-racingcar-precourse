package common;

public class Util {

    public static Integer stringToInteger(String strNumber) {
        if (strNumber.isEmpty()
            || strNumber.matches("[0-9]+")) {
            throw new IllegalArgumentException();
        }

        return Integer.parseInt(strNumber);
    }
}
