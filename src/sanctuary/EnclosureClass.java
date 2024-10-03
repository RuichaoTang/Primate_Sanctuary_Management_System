package sanctuary;

import java.util.ArrayList;

/**
 * class implementing the enclosure
 */
public class EnclosureClass implements Enclosure{
    private ArrayList<Monkeys> monkeys;

    /**
     * constructor to create a new enclosure
     */
    public EnclosureClass(){
        monkeys = new ArrayList<>();
    }

    public void addAMonkey(Monkeys monk){
        monkeys.add(monk);
    }

    public String printAll(){
        ArrayList<String> str = new ArrayList<>();
        for(Monkeys monk : monkeys ){
            str.add(monk.toString());
        }
        return str.toString();
    }

}
