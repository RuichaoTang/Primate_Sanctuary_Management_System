package sanctuary;

import java.util.ArrayList;

/**
 * class implementing the isolation
 */
public class IsolationClass implements Isolation{
    private final int MAX_IN_ISOLATION = 20;
    private ArrayList<Monkeys> monkeys;
    private int size;


    /**
     * constructor to create a new isolation
     */
    public IsolationClass(){
        this.monkeys = new ArrayList<>();
        this.size = 0;
    }

    public void addAMonkey(Monkeys monk) throws IllegalArgumentException{
        if(size >= MAX_IN_ISOLATION){
            throw new IllegalArgumentException("The isolation is currently full.");
        }
        size++;
        monkeys.add(monk);
    }

    public void removeAMonkey(Monkeys monk) throws IllegalArgumentException{
        if(!monkeys.contains(monk)){
            throw new IllegalArgumentException("No such a monkey found.");
        }
        monkeys.remove(monk);
        size--;
    }

    public int getSize(){
        return size;
    }

    public String printAll(){
        ArrayList<String> str = new ArrayList<>();
        for(Monkeys monk : monkeys){
            str.add(monk.getName());
        }
        return str.toString();
    }
}
