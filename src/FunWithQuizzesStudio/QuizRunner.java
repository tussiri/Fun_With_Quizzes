package FunWithQuizzesStudio;

public class QuizRunner {
    public static void main(String[] args) {
        Quiz newQuiz = new Quiz();

        MultipleChoice multipleChoice = new MultipleChoice("In soccer, you just committed a bad foul and the referee wants to send you off the pitch. What color is the card that he is showing you?"+ "\nA: Black \nB: Yellow \nC: Red \nD: Green", "C");

        MultipleChoice multipleChoice2 = new MultipleChoice("Which team did quarterback John Elway play for?" + "\nA:Baltimore Colts \nB:Philadelphia Eagles \nC: Cleveland Browns \nD:Denver Broncos", "D");

        newQuiz.addQuestion(multipleChoice);
        newQuiz.addQuestion(multipleChoice2);

        CheckBoxQuestion checkBox = new CheckBoxQuestion("Which actors have played James Bond?" +"\nA:Daniel Craig \nB:Sean Connery \nC:Roger Moore \nD:Matt Damon", "A, B, C");

        newQuiz.addQuestion(checkBox);

        ShortAnswerQuestion shortAnswerQuestion = new ShortAnswerQuestion("Who wrote the Harry Potter series?", "J.K. Rowling");

        newQuiz.addQuestion(shortAnswerQuestion);

        LinearScale linearScaleQuestion = new LinearScale("On a scale of 1-10, 1 being not likely, 10 being very likely: How likely are you to recommend LaunchCode?", 0, 10);

        newQuiz.runQuiz();
    }

}
