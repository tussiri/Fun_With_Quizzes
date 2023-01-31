package FunWithQuizzesStudio;

public class ShortAnswerQuestion extends Question{
    public ShortAnswerQuestion(String question, String answer) {
        super(question, answer);
    }

    public boolean checkAnswer(String answer) {
        if (answer.length() <= 80) {
            if (answer.toLowerCase().equals(this.getAnswer().toLowerCase())) {
                return true;
            } else {
                return false;
            }
        } else {
            System.out.println("Answer exceeds 80 characters in length. Please shorten answer.");
            return false;
        }
    }
}
