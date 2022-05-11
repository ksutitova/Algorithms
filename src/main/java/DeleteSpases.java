public class DeleteSpases {

    public String deleteSpaces(String str) {
        if (str.isEmpty() == false) {
            String str1 = str.trim();

            if (str.length() == str1.length()) {
                return "Пробелов не было";
            } else {
                return "Лишние пробелы удалены";
            }
        }
        return "Строка пустая";
    }

}
