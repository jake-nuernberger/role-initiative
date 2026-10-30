package roleinitiative;

import java.util.HashMap;
import java.util.Map;

public class PlayerProfile{

    private Map<Trait, Integer> traitScores;

    public PlayerProfile(){
        traitScores = new HashMap<>();

        for (Trait trait : Trait.values()){
            traitScores.put(trait, 0);
        }
    }

    public void adjustTrait(Trait trait, int amount){
        int currentScore = traitScores.get(trait);
        traitScores.put(trait, currentScore + amount);
    }

    public int getTraitScore(Trait trait){
        return traitScores.get(trait);
    }

    public void printProfile() {
        for (Trait trait : Trait.values()) {
            System.out.println(
                    trait + ": " + traitScores.get(trait)
            );
        }
    }
}



