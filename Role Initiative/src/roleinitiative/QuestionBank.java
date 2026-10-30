package roleinitiative;
import java.util.ArrayList;
import java.util.List;


public class QuestionBank {

    public static List<Question> createQuestions(){

        List<Question> questions = new ArrayList<>();

        Question q1 = new Question("How interested are you in magic?");

        Answer q1a1 = new Answer(" I am very interested.");
        Answer q1a2 = new Answer("I would like a little magic, but not have it be my focus");
        Answer q1a3 = new Answer("I don't think I want to play a character with magical abilities.");
        q1a1.addTraitChange(Trait.MAGIC_INTEREST, 2);
        q1a2.addTraitChange(Trait.MAGIC_INTEREST, 1);
        q1a3.addTraitChange(Trait.MAGIC_INTEREST, -2);

        Question q2 = new Question("How would your character approach a dangerous enemy?");

        Answer q2a1 = new Answer("They would confront them head on.");
        Answer q2a2 = new Answer("They would try to get some kind of tactical advantage");
        Answer q2a3 = new Answer("They would see if they remember anything about them and use that knowledge to their advantage.");
        Answer q2a4 = new Answer ("They would support the rest of the party as best as possible during the encounter.");
        Answer q2a5 = new Answer("They would try to talk their way out of trouble if possible.");
        Answer q2a6 = new Answer("I would rather try an avoid dangerous enemies when possible.");

        q2a1.addTraitChange(Trait.DIRECT_COMBAT, 2);
        q2a2.addTraitChange(Trait.TACTICAL_COMBAT, 2);
        q2a3.addTraitChange(Trait.KNOWLEDGE, 2);
        q2a3.addTraitChange(Trait.TACTICAL_COMBAT, 1);
        q2a4.addTraitChange(Trait.SUPPORT, 2);
        q2a5.addTraitChange(Trait.DIRECT_COMBAT, -2);
        q2a5.addTraitChange(Trait.SOCIAL, 2);
        q2a6.addTraitChange(Trait.DIRECT_COMBAT, -2);

        q1.addAnswer(q1a1);
        q1.addAnswer(q1a2);
        q1.addAnswer(q1a3);

        q2.addAnswer(q2a1);
        q2.addAnswer(q2a2);
        q2.addAnswer(q2a3);
        q2.addAnswer(q2a4);
        q2.addAnswer(q2a5);
        q2.addAnswer(q2a6);

        questions.add(q1);
        questions.add(q2);

        return questions;

    }



}
