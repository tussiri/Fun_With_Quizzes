package FunWithQuizzesStudio;

public class MultipleChoice extends Question {
    public MultipleChoice (String question, String answer){
        super(question, answer);
    }
    public boolean checkAnswer(String answer) {
        return (answer.toLowerCase().equals(this.getAnswer().toLowerCase()));
    }

}
