package sanctuary;

/**
 * interface representing enclosures
 */
public interface Enclosure {
    /**
     * method to add a monkey into this enclosure
     * @param monk the monkey will be added
     */
    void addAMonkey(Monkeys monk);

    /**
     * method to print all monkeys in this enclosure
     */
    String printAll();
}
