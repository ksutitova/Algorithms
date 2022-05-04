public class Estimation {

    public String estimationAlgorithm(int estimation) {
        if (estimation >= 2 || estimation <= 5) {
            if (estimation == 5) {
                return "выдать похвальную грамоту и перевести в следующий класс";
            }
            if (estimation == 4) {
                return "перевести в следующий класс";
            }
            if (estimation == 3) {
                return "дать задание на лето и перевести в следующий класс";
            }
            if (estimation == 2) {
                return "вызвать родителей и оставить в текущем классе на второй год";
            }
        }
        return "Fail";
    }
}
