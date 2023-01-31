package FunWithQuizzesStudio;
import java.util.List;

public class CheckBoxQuestion extends Question {

    public CheckBoxQuestion(String question, String answer){
        super(question, answer);

    }
    public boolean checkAnswer(String answer){
        return answer.toLowerCase().equals(this.getAnswer().toLowerCase());
    }
}
