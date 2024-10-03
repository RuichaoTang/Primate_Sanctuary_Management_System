package sanctuary;

import javax.swing.*;
import java.awt.*;
import java.util.Objects;

/**
 * Represents the view component of the Sanctuary application, providing a graphical user interface (GUI)
 * for interacting with the sanctuary.
 */
public class JFrameView extends JFrame {
    private JLabel textNewMonkey, name, species,sex,size,weight,age,favFood;
    private JTextField monkeyName, monkeyAge ,monkeyWeight, monkeySize; // take user input as text
    private JTextArea result;
    private JButton receiveButton , exitButton, giveMedical, moveToEnclosure, showAll, showEnclosure;// buttons

    private JComboBox<String> speciesChoice, foodChoice, sexChoice;



    /**
     * Constructs a new instance of JFrameView with the specified title.
     *
     * @param title The title of the JFrame.
     */
    public JFrameView(String title){
        super(title);
        setSize(950,600);
        setLocation(300,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        this.textNewMonkey = new JLabel("Receive a new Monkey into this Sanctuary or move it to the enclosure using name:    ");
        this.add(textNewMonkey);


        this.name = new JLabel("Name:");
        this.add(name);
        this.monkeyName = new JTextField(9);
        this.add(monkeyName);

        this.size = new JLabel("Size:");
        this.add(size);
        this.monkeySize = new JTextField(4);
        this.add(monkeySize);

        this.weight = new JLabel("Weight:");
        this.add(weight);
        this.monkeyWeight = new JTextField(4);
        this.add(monkeyWeight);

        this.age = new JLabel("Age:");
        this.add(age);
        this.monkeyAge = new JTextField(4);
        this.add(monkeyAge);

        this.species = new JLabel("Specie:");
        this.add(species);
        speciesChoice = new JComboBox<String>();
        speciesChoice.addItem("drill");
        speciesChoice.addItem("guereza");
        speciesChoice.addItem("howler");
        speciesChoice.addItem("mangabey");
        speciesChoice.addItem("saki");
        speciesChoice.addItem("spider");
        speciesChoice.addItem("squirrel");
        speciesChoice.addItem("tamarin");

        this.add(speciesChoice);

        this.favFood = new JLabel("Favourite Food:");
        this.add(favFood);
        foodChoice = new JComboBox<String>();
        foodChoice.addItem("eggs");
        foodChoice.addItem("fruits");
        foodChoice.addItem("insects");
        foodChoice.addItem("leaves");
        foodChoice.addItem("nuts");
        foodChoice.addItem("seeds");
        foodChoice.addItem("treeSap");

        this.add(foodChoice);

        this.sex = new JLabel("Sex:");
        this.add(sex);
        sexChoice = new JComboBox<String>();
        this.add(sexChoice);
        sexChoice.addItem("Male");
        sexChoice.addItem("Female");

        this.receiveButton = new JButton("Receive");
        this.add(receiveButton);
        this.giveMedical = new JButton("Health Check");
        this.add(giveMedical);
        this.moveToEnclosure = new JButton("To Enclosure");
        this.add(moveToEnclosure);
        this.showEnclosure = new JButton("Print Enclosure");
        this.add(showEnclosure);
        this.showAll = new JButton("Show All");
        this.add(showAll);
        this.exitButton = new JButton("Quit");
        this.add(exitButton);

        this.result = new JTextArea(10,60);
        this.add(result);

//        this.pack();
        this.setVisible(true);


    }

    /**
     * Sets the result text in the JTextArea.
     *
     * @param str The string to be displayed as the result.
     */
    public void setResult(String str){
        this.result.setText(str);
    }

    /**
     * Adds event listeners to GUI components to enable interaction with the sanctuary.
     *
     * @param features The SancController object responsible for handling user interactions.
     */
    public void addFeatures(SancController features) {
        this.receiveButton.addActionListener(evt -> features.receiveAMonkey(monkeyName.getText(), Objects.requireNonNull(speciesChoice.getSelectedItem()).toString(), Objects.requireNonNull(sexChoice.getSelectedItem()).toString(),monkeySize.getText(),monkeyWeight.getText(),monkeyAge.getText(), Objects.requireNonNull(foodChoice.getSelectedItem()).toString()));
        this.showAll.addActionListener(evt -> features.showAll());
        this.giveMedical.addActionListener(evt -> features.giveMedical(monkeyName.getText()));
        this.moveToEnclosure.addActionListener(evt -> features.moveToEnclosure(monkeyName.getText()));
        this.showEnclosure.addActionListener(evt -> features.printEnclosure(Objects.requireNonNull(speciesChoice.getSelectedItem()).toString()));
        this.exitButton.addActionListener(evt -> features.exitProgram());
    }

}
