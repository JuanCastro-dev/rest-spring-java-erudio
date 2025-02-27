package io.github.juandev.restspringjavaerudio.utils;

public class MathUtils {

    public static Double convertToDouble(String number) {
        if (number == null || number.isEmpty()) {
            return 0D;
        }
        String num = number.replaceAll(",", ".");
        if (isNumeric(num)) {
            return Double.parseDouble(num);
        }
        return 0D;
    }

    public static boolean isNumeric(String number) {
        if (number == null || number.isEmpty()) {
            return false;
        }
        String num = number.replaceAll(",", ".");
        return num.matches("-?\\d+(\\.\\d+)?");
    }
}
