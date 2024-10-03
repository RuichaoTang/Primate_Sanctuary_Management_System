package sanctuary;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/**
 * class implementing the Sanctuary
 * The Sanctuary has room for twenty monkeys in isolation (cages) and eight enclosure spaces (one for each species of of monkeys).
 */
public class Sanctuary {
    private final int MAX_IN_ISOLATION = 20;
    private Isolation isolation;
    private ArrayList<Enclosure> enclosures;
    private  ArrayList<Monkeys> all;
    private Set<Species> species;
    private HashMap<Species,Integer> hashmap;
    private HashMap<String,Monkeys> nameHash;



    /**
     * constructor to create a sanctuary
     */
    public Sanctuary(){
        hashmap = new HashMap<>();
        hashmap.put(Species.DRILL,0);
        hashmap.put(Species.GUEREZA,1);
        hashmap.put(Species.HOWLER,2);
        hashmap.put(Species.MANGABEY,3);
        hashmap.put(Species.SAKI,4);
        hashmap.put(Species.SPIDER,5);
        hashmap.put(Species.SQUIRREL,6);
        hashmap.put(Species.TAMARIN,7);

        this.enclosures = new ArrayList<>();
        enclosures.add( new EnclosureClass() );
        enclosures.add( new EnclosureClass() );
        enclosures.add( new EnclosureClass() );
        enclosures.add( new EnclosureClass() );
        enclosures.add( new EnclosureClass() );
        enclosures.add( new EnclosureClass() );
        enclosures.add( new EnclosureClass() );
        enclosures.add( new EnclosureClass() );
        nameHash = new HashMap<>();
        species = new HashSet<>();
        isolation = new IsolationClass();
        all = new ArrayList<>();
    }

    /**
     * method to receive a new monkey to the sanctuary, put it into the isolation
     * if the Isolation is full, throw IllegalArgumentException
     * @param monkey the monkey new to the sanctuary
     */
    public void receiveNewMonkey(Monkeys monkey) throws IllegalArgumentException{
        if(isolation.getSize() >= MAX_IN_ISOLATION){
            throw new IllegalArgumentException("The isolation is full.");
        }
        all.add(monkey);
        nameHash.put(monkey.getName(),monkey);
        isolation.addAMonkey(monkey);
        species.add(monkey.getSpecie());
    }

    /**
     * method to give medical attention to a monkey
     * @param monkey that receive medical attention
     */
    public void giveMedical(Monkeys monkey){
        monkey.getMedical();
    }

    /**
     * method to move a monkey to the enclosure
     * @param monkey monkey will be moved to the enclosure
     * @throws IllegalArgumentException if the monkey is not healthy
     */
    public void moveToEnclosure(Monkeys monkey) throws IllegalArgumentException{
        if(!monkey.getHealthy()){
            throw new IllegalArgumentException("The monkey is not healthy.");
        }
        else {
            isolation.removeAMonkey(monkey);
            enclosures.get(hashmap.get(monkey.getSpecie())).addAMonkey(monkey);
        }
    }

    /**
     * method to report species currently in this sanctuary
     * @return a set of current species
     */
    public Set<Species> reportSpecies(){
        return species;
    }

    /**
     * method to print all monkeys in this sanctuary by name (in alphabetical order)
     */
    public String printAllMonkeys(){
        all.sort(Monkeys::compareTo);
        ArrayList<String> str = new ArrayList<>();
        for(Monkeys monk : all){
            str.add(monk.getName());
        }
        return str.toString();
    }

    /**
     * method to print monkeys in isolation
     */
    public String printIsolation(){
        return isolation.printAll();
    }

    /**
     * method to get the isolation
     * @return the isolation
     */
    public Isolation getIsolation(){
        return isolation;
    }

    /**
     * method to get the enclosure for the given specie
     * @param spec the specie that the enclosure has
     * @return the enclosure for the given specie
     */
    public Enclosure getEnclosure(Species spec){
        return enclosures.get(hashmap.get(spec));
    }

    /**
     * method to print all monkeys in a certain enclosure
     * @param spec the specie that the enclosure has
     */
    public String printMonkeysInEnclosure(Species spec){
        Enclosure monkeys =  enclosures.get(hashmap.get(spec));
        return monkeys.printAll();
    }

    /**
     * get the monkey object by monkey's name
     * @param name name of the monkey
     * @return the monkey
     */
    public Monkeys getMonkey(String name){
        return nameHash.get(name);
    }
}
