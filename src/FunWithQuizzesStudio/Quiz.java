package FunWithQuizzesStudio;

import java.util.ArrayList;
import java.util.Scanner;

public class Quiz {
    private ArrayList<Question> questions = new ArrayList<Question> ();
    private int correctAnswers = 0;
    private Scanner scanner = new Scanner(System.in);

    public Quiz(){

    }

    public ArrayList<Question> getQuestions() {
        return questions;
    }

    public void setQuestions(ArrayList<Question> questions) {
        this.questions = questions;
    }

    public void addQuestion(Question question){
        this.questions.add(question);
    }

    private String getInputAnswers(){
        String answer = scanner.nextLine();
        return answer;
    }

    public void runQuiz(){
        for(Question question : questions){
            System.out.println(question.getQuestion());
            boolean correctQuestion = question.checkAnswer(getInputAnswers());
            if(correctQuestion){
                this.correctAnswers++;
            }
        }
        System.out.println("You got " + correctAnswers + " correct.");
    }

}
