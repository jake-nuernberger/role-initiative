package roleinitiative;

import java.util.HashMap;
import java.util.Map;

public class Answer{

    private String text;
    private Map<Trait, Integer> traitChanges;

    public Answer(String text){
        this.text = text;
        traitChanges = new HashMap<>();

    }

    public void addTraitChange(Trait trait, int amount){
        traitChanges.put(trait, amount);
    }

    public String getText(){
        return text;
    }

    public Map<Trait, Integer> getTraitChanges(){
        return traitChanges;
    }
}