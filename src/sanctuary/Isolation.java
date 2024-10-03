package sanctuary;

/**
 * interface representing the isolation
 */
public interface Isolation {
    /**
     * method to get the current number of monkeys in this isolation
     * @return integer representing the number of the monkeys in this isolation
     */
    int getSize();

    /**
     * method to add a monkey into this isolation
     * @param monk the monkey that will be added into this isolation
     * @throws IllegalArgumentException if the isolation is currently full
     */
    void addAMonkey(Monkeys monk) throws IllegalArgumentException;

    /**
     * method to remove a monkey from this isolation
     * @param monk the monkey that will be removed from this isolation
     * @throws IllegalArgumentException if there is no such a monkey in this isolation
     */
    void removeAMonkey(Monkeys monk) throws IllegalArgumentException;

    /**
     * method to print all monkeys in this isolation
     */
    String printAll();
}
