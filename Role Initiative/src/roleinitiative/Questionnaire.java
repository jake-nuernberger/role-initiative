package roleinitiative;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;

public class Questionnaire {

    private PlayerProfile playerProfile;
    private List<Question> questions;
    private Scanner scanner;

    public Questionnaire(PlayerProfile playerProfile){
        this.playerProfile = playerProfile;
        questions = new ArrayList<>();
        scanner = new Scanner(System.in);

    }

    public void addQuestion(Question question){
        questions.add(question);
    }

    public void run(){

        for (Question question : questions){

            System.out.println(question.getText());

            for (int i = 0; i < question.getAnswers().size(); i++){
                System.out.println( (i +1) + ". " + question.getAnswers().get(i).getText());
            }


            System.out.print("Choose an answer: ");

            int choice = scanner.nextInt();

            Answer selectedAnswer = question.getAnswers().get(choice - 1);

            System.out.println( "You chose: " + selectedAnswer.getText());

            for (Map.Entry<Trait, Integer> entry : selectedAnswer.getTraitChanges().entrySet()){
                playerProfile.adjustTrait(entry.getKey(), entry.getValue());
            }
        }




    }
}
