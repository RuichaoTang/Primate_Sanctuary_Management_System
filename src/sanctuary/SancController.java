package sanctuary;

import javax.swing.*;

/**
 * The controller class responsible for handling user interactions and updating the view and model accordingly.
 */
public class SancController {
    JFrameView view;
    Sanctuary model;


    /**
     * Constructs a new instance of the controller.
     *
     * @param view  The view component of the MVC pattern.
     * @param model The model component of the MVC pattern.
     */
    public SancController(JFrameView view, Sanctuary model){
        this.view = view;
        this.model = model;
        this.view.addFeatures(this);
    }

    /**
     * Exits the program.
     */
    public void exitProgram() {
        System.exit(0);
    }

    /**
     * Receives information about a new monkey and adds it to the sanctuary.
     *
     * @param name    The name of the monkey.
     * @param specie  The species of the monkey.
     * @param sex     The sex of the monkey.
     * @param size    The size of the monkey.
     * @param weight  The weight of the monkey.
     * @param age     The age of the monkey.
     * @param favFood The favorite food of the monkey.
     */
    public void receiveAMonkey(String name,String specie, String sex, String size, String weight, String age, String favFood){
        Species spec = Species.GUEREZA;
        Sex sexIn = Sex.FEMALE;
        Foods foodIn = Foods.TREESAP;
        switch (specie) {
            case "drill" -> spec = Species.DRILL;
            case "guereza" -> spec = Species.GUEREZA;
            case "howler" -> spec = Species.HOWLER;
            case "mangabey" -> spec = Species.MANGABEY;
            case "saki" -> spec = Species.SAKI;
            case "spider" -> spec = Species.SPIDER;
            case "squirrel" -> spec = Species.SQUIRREL;
            case "tamarin" -> spec = Species.TAMARIN;
        }

        switch (sex){
            case "Male" -> sexIn = Sex.MALE;
            case "Female" -> sexIn = Sex.FEMALE;
        }

        switch (favFood){
            case "eggs" -> foodIn = Foods.EGGS;
            case "fruits" -> foodIn = Foods.FRUITS;
            case "insects" -> foodIn = Foods.INSECT;
            case "leaves" -> foodIn = Foods.LEAVES;
            case "nuts" -> foodIn = Foods.NUTS;
            case "seeds" -> foodIn = Foods.SEEDS;
            case "treeSap" -> foodIn = Foods.TREESAP;
        }




        Monkeys monk = new Monkeys(name,spec,sexIn,Integer.parseInt(size),Integer.parseInt(weight),Integer.parseInt(age),foodIn);
        try {
            model.receiveNewMonkey(monk);
            view.setResult(name+" now in the sanctuary.");
        }catch (Exception e){
            view.setResult("Isolation is currently full.");
        }
    }


    /**
     * Displays names of all monkeys in the sanctuary.
     */
    public void showAll() {
        String str = model.printAllMonkeys();
        view.setResult(str);
    }

    /**
     * Provides medical care to a monkey.
     *
     * @param name The name of the monkey to receive medical care.
     */
    public void giveMedical(String name) {
        model.giveMedical(model.getMonkey(name));
        view.setResult(name+" received medical care.");
    }

    /**
     * Moves a monkey to an enclosure.
     *
     * @param name The name of the monkey to move to an enclosure.
     */
    public void moveToEnclosure(String name) {
        try {
            model.moveToEnclosure(model.getMonkey(name));
            view.setResult(name+" has been moved to enclosure.");
        }catch (Exception e){
            view.setResult("The monkey has not been tested healthy.");
        }
    }


    /**
     * Prints information about monkeys in a specific enclosure.
     *
     * @param specie The species of monkeys to print in the enclosure.
     */
    public void printEnclosure(String specie) {
        Species spec = Species.GUEREZA;
        switch (specie) {
            case "drill" -> spec = Species.DRILL;
            case "guereza" -> spec = Species.GUEREZA;
            case "howler" -> spec = Species.HOWLER;
            case "mangabey" -> spec = Species.MANGABEY;
            case "saki" -> spec = Species.SAKI;
            case "spider" -> spec = Species.SPIDER;
            case "squirrel" -> spec = Species.SQUIRREL;
            case "tamarin" -> spec = Species.TAMARIN;
        }
        view.setResult(model.printMonkeysInEnclosure(spec));

    }
}
