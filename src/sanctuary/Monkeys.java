package sanctuary;


/**
 * class to represent monkeys
 */
public class Monkeys implements Comparable<Monkeys>{
    private String name;
    private Species specie;
    private Sex sex;
    private int size;
    private int weight;
    private int age;
    private Foods favFood;
    private Boolean healthy;

    /**
     * Constructor to new a Monkey
     * @param name name of the monkey
     * @param specie the specie
     * @param sex its sex
     * @param size its size
     * @param weight its weight
     * @param age its age
     * @param favFood its favourite food
     * @throws IllegalArgumentException if the arguments are in valid
     */
    public Monkeys(String name, Species specie, Sex sex, int size, int weight, int age, Foods favFood) throws IllegalArgumentException{
        if(name == null || specie == null || sex == null || size <= 0 || weight <= 0 || age <=0 || favFood==null){
            throw new IllegalArgumentException("Please enter a valid monkey.");
        }else {
            this.name = name;
            this.specie = specie;
            this.sex = sex;
            this.size = size;
            this.weight = weight;
            this.age = age;
            this.favFood = favFood;
            this.healthy = false;
        }
    }

    /**
     * method to get the specie of the monkey
     * @return the specie
     */
    public Species getSpecie() {
        return specie;
    }

    /**
     * method to get the name of this monkey
     * @return the name of this monkey
     */
    public String getName(){
        return name;
    }

    /**
     * method to get the sex of this monkey
     * @return the sex of this monkey
     */
    public Sex getSex() {
        return sex;
    }

    /**
     * method to get size of this monkey
     * @return the size of this monkey
     */
    public int getSize() {
        return size;
    }

    /**
     * method to get the weight of this monkey
     * @return the weight of this monkey
     */
    public int getWeight() {
        return weight;
    }

    /**
     * method to get the age of this monkey
     * @return the age of this monkey
     */
    public int getAge() {
        return age;
    }

    /**
     * method to get this monkey's favourite food
     * @return its favourite food
     */
    public Foods getFavFood() {
        return favFood;
    }

    /**
     * method to check health status
     * @return healthy or not
     */
    public Boolean getHealthy(){
        return healthy;
    }

    /**
     * method to receive medical attention
     */
    public void getMedical(){
        this.healthy = true;
    }

    /**
     * toString method
     * @return a string that can be printed to represent this monkey
     */
    @Override
    public String toString(){
        return "Name:" + name + " Sex:" + sex + " Favourite Food:" + favFood;
    }

    /**
     * method to compare this Monkey object with the specified Monkey object for order.
     * @param other other monkey
     * @return 0 if two monkeys have a same name
     *         positive integer if this monkey's name is larger than the other's
     *         negative integer if the other monkey's name is alphabetically larger than this monkey's
     */
    @Override
    public int compareTo(Monkeys other){
        return this.name.compareTo(other.name);
    }

}
