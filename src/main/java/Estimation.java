public class Estimation {

    public String estimationAlgorithm(int n) {
        if (n >= 2 || n <= 5) {
            if (n == 5) {
                return "выдать похвальную грамоту и перевести в следующий класс";
            }
            if (n == 4) {
                return "перевести в следующий класс";
            }
            if (n == 3) {
                return "дать задание на лето и перевести в следующий класс";
            }
            if (n == 2) {
                return "вызвать родителей и оставить в текущем классе на второй год";
            }
        }
        return "Fail";
    }
}
