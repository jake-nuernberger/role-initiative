package roleinitiative;

import java.util.List;
import java.util.ArrayList;

public class Question{

    private String text;
    private List<Answer> answers;

    public Question(String text){
        this.text = text;
        answers = new ArrayList<>();
    }

    public void addAnswer(Answer answer){
        answers.add(answer);
    }

    public String getText(){
        return text;
    }

    public List<Answer> getAnswers(){
        return answers;
    }
}