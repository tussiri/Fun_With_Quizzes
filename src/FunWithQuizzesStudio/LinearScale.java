package FunWithQuizzesStudio;

public class LinearScale extends Question {
    private int lowerLimit;
    private int upperLimit;

    public LinearScale(String question, int lowerLimit, int upperLimit) {
        super(question, null);
        this.lowerLimit = lowerLimit;
        this.upperLimit = upperLimit;
    }

    public boolean checkAnswer(String answer) {
        int answerNumber = Integer.parseInt(answer);
        return answerNumber >= lowerLimit && answerNumber <= upperLimit;
    }

    public int getLowerLimit() {
        return lowerLimit;
    }

    public void setLowerLimit(int lowerLimit) {
        this.lowerLimit = lowerLimit;
    }

    public int getUpperLimit() {
        return upperLimit;
    }

    public void setUpperLimit(int upperLimit) {
        this.upperLimit = upperLimit;
    }
}