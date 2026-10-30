import roleinitiative.*;

public static void main(String[] args) {

    PlayerProfile player = new PlayerProfile();

    Questionnaire questionnaire = new Questionnaire(player);

   for (Question question : QuestionBank.createQuestions()){
       questionnaire.addQuestion(question);
   }

    questionnaire.run();

    player.printProfile();

    //    player.adjustTrait(Trait.MAGIC_INTEREST, 2);
//    player.adjustTrait(Trait.TACTICAL_COMBAT, 3);
//
//    System.out.println(player.getTraitScore(Trait.MAGIC_INTEREST));
//    System.out.println(player.getTraitScore(Trait.TACTICAL_COMBAT));
} //Start Role Initiative