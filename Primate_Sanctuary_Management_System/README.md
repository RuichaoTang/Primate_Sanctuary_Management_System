# Primate Sanctuary Management System

## Overview
The Primate Sanctuary Management System is a Java-based application that allows users to manage and track monkeys in a sanctuary. It provides functionality to add monkeys to the sanctuary, move them between isolation and species-specific enclosures, and generate reports on the monkeys and their housing.

## Features
- Add new monkeys to the sanctuary with specific attributes such as species, favorite food, name, sex, size, weight, age, and health status.
- Move monkeys from isolation to their corresponding species enclosure.
- View a list of monkeys housed in each species enclosure.
- View a list of monkeys currently in isolation.
- Generate an alphabetically ordered list of all monkeys in the sanctuary.
- Display error messages for invalid actions or input.

## Usage
1. Ensure that you have Oracle OpenJDK version 21.0.1 installed on your system. If not, please download and install it from the official Java website: https://www.oracle.com/java/technologies/downloads/

2. Open a terminal or command prompt and navigate to the directory where the PROJECT6.jar file is located.
Run the following command to start the application:
java -jar PROJECT6.jar

3. The Primate Sanctuary Management System graphical user interface will open.

4. Use the graphical user interface to interact with the sanctuary management system:
   - Enter the details of a monkey in the "Add Monkey" section and click the "Add Monkey" button to add a new monkey to the sanctuary.
   - Select the name of a monkey from the isolation list and click the "Move to Enclosure" button to move the monkey to its corresponding species enclosure.
   - View the list of monkeys in each species enclosure in the "Enclosures" section.
   - View the list of monkeys in isolation in the "Isolation" section.
   - View the alphabetically ordered list of all monkeys in the sanctuary in the "Alphabetical List" section.

5. Error messages will be displayed if any invalid actions or input are encountered.

## Design
The Primate Sanctuary Management System follows a Model-View-Controller (MVC) architectural pattern. The `Sanctuary` class represents the model, the `SanctuaryView` class represents the view, and the `SanctuaryController` class acts as the controller between the model and the view.

The system consists of the following classes and interfaces:
- `Monkey`: Represents a monkey with its attributes and implements the `Monkeys` interface.
- `Monkeys`: An interface that defines the methods for accessing monkey attributes.
- `MonkeySpecies`: An enum that defines the different species of monkeys.
- `FavouriteFoods`: An enum that defines the favorite foods of monkeys.
- `Sex`: An enum that defines the sex of monkeys.
- `Housing`: An interface that defines the methods for adding and removing monkeys from housing units.
- `Enclosures`: Implements the `Housing` interface and represents species-specific enclosures for housing monkeys.
- `Isolation`: Implements the `Housing` interface and represents the isolation housing unit for monkeys.
- `Sanctuary`: Represents the sanctuary and manages the housing units and monkeys.
- `SanctuaryController`: Acts as a controller between the `Sanctuary` model and the `SanctuaryView` user interface.
- `SanctuaryView`: Implements the graphical user interface for interacting with the sanctuary management system.

## Assumptions
- The system assumes that the user will provide valid input for monkey attributes.

## Limitations
- The isolation housing unit has a fixed capacity of 20 monkeys.
- The species-specific enclosures have no capacity limit.

## Dependencies
The application requires the following dependencies:
- Java Runtime Environment (JRE) Oracle OpenJDK version 21.0.1
- Java Development Kit (JDK) 8 or above.
- Java Swing library for the graphical user interface.

## Contributing
Contributions to the Primate Sanctuary Management System are welcome. If you find any bugs or have suggestions for improvements, please feel free to contact me. My email address is li.shansho@northeastern.edu

## Citations
- [Java Documentation](https://docs.oracle.com/en/java/)
- [Swing Tutorial](https://docs.oracle.com/javase/tutorial/uiswing/)
