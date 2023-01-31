package FunWithQuizzesStudio;

public abstract class Question {
    private String Question;
    private String Answer;

    public Question(String question, String answer){
        Question = question;
        Answer = answer;
    }

    public abstract boolean checkAnswer(String Answer);

    public String getQuestion() {
        return Question;
    }

    public void setQuestion(String question) {
        Question = question;
    }

    public String getAnswer() {
        return Answer;
    }

    public void setAnswer(String answer) {
        Answer = answer;
    }
}
