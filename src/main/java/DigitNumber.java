public class DigitNumber {
    /**
     * Напишите алгоритм программы, которая проверяет число типа short на количество разрядов,
     * и выводит результат проверки.
     * ( Например, “It’s a two-digit number.”, “It’s a five-digit number.”, etc)
     * Выведите результат проверки на печать.
     */

    public String digitNumberAlgorithm(short number) {
        number = (short) Math.abs(number);
        String str = Short.toString(number);
        if (2 == str.length()) {
            return "It’s a two-digit number.";
        } else if (3 == str.length()) {
            return "It’s a three-digit number.";
        } else if (4 == str.length()) {
            return "It’s a four-digit number.";
        } else if (4 == str.length()) {
            return "It’s a five-digit number.";
        }
        if (number <= Short.MIN_VALUE && number >= Short.MAX_VALUE) {
            return "Fail";
        } return "";
    }
}
