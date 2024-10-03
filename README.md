# Primate Sanctuary Management System

## Overview
The Sanctuary Application is a Java application designed to manage a primate sanctuary. The system allows users to perform the following operations:

1. register new monkeys into the sanctuary (straight into the isolation area).
2. Transfer monkeys that have received medical attention to the right enclosure.
3. View the list of all monkeys in a specific enclosure.
4. View the list of all monkeys housed in the sanctuary.

## System Components
The system consists of the following main components:
1. `Enclosure` represent the interface of the enclosure class.
2. `Monkeys`: Represents a primate, with attributes such as name, species, sex, size, weight, age, and favorite food.
3. `IsolationClass`: Responsible for managing the isolation area, including adding and removing primates.
4. `EnclosureClass`: Responsible for managing the enclosures for specific species, including adding and removing primates.
5. `Sanctuary`: represent the Sanctuary.
6. `JFrameView`: Provides a graphical user interface (GUI) for interacting with the system.
7. `SancController`: Handles user interface events and calls the corresponding Sanctuary methods.
8. `Demo`: The entry point of the program, responsible for creating the Sanctuary, SanctuaryView, and SanctuaryController instances and starting the application


### Usage
1. **Run from Demo class**:
   - Run the `Demo` class to start the application.
   - The program will start, and you can interact with it using the graphical user interface.
1. **Run from JAR File**:
   - Ensure that you have Java installed on your system.
   - Download the JAR file `hw6.jar` from /res.
   - Open a terminal or command prompt.
   - Navigate to the directory where the JAR file is located.
   - Run the following command:
     ```
     java -jar hw6.jar
     ```
   - The program will start, and you can interact with it using the graphical user interface.

2. **Graphical User Interface (GUI) Instructions**:
   - To receive a new monkey into the sanctuary, make sure you enter a unique name and full information for every single monkey.
     After filling the blank, hit "Receive" button.
   - When receiving new monkeys, you will get notified if there is no room for new monkeys (because the isolation cages are full).
   - To give medical care to a specific monkey, please enter the monkey's name in the name text filed. And then hit "Health Check" button.
   - when a monkey's health status is unknown, if you move that monkey to enclosure, the result text filed will display "The monkey has not been tested healthy.".
   - To print an enclosure, select a specie and then hit the "Print Enclosure" button.
   - To print all monkey's name (in alphabetical order), hit "Show All" button.

## Example for Use
To receive a new monkey into the sanctuary, make sure you enter a unique name and full information for every single monkey. After filling the blank, hit the "Receive" button.
- Name: Bobo
- Species: drill
- Sex: Male
- Size: 15
- Weight: 50
- Age: 5
- Favorite Food: Tree Sap

After entering the details, clicking "Receive" should add Bobo to the sanctuary.



## Testing
The system includes a set of JUnit 4 test cases located in the `/test` directory. These test cases cover the following functionalities:
1. Creation of Monkeys: Tests to ensure that monkeys can be created successfully and that invalid inputs are handled appropriately.
2. Isolation Management: Tests related to adding monkeys to the isolation area, including handling capacity constraints.
3. Moving Monkeys to Enclosures: Tests to verify that healthy monkeys can be moved to enclosures and that attempts to move unhealthy monkeys are rejected.
4. Species Reporting: Tests for generating accurate reports on the species present in the sanctuary.
5. Listing Monkeys in Enclosures: Tests to ensure that the list of monkeys in each enclosure is generated correctly.
6. Ordering Monkeys by Name: Tests to validate the sorting order of monkeys by name.

### Assumptions

1. **Single Instance of Sanctuary**: The system assumes that there is only one instance of the sanctuary being managed. It does not support multiple independent sanctuaries.

2. **GUI Environment**: The system assumes that it will be primarily used in a graphical user interface (GUI) environment.

3. **Monkeys are Unique by Name**: The system assumes that each monkey is uniquely identified by its name. Duplicate names are not allowed for individual monkeys.

4. **Monkeys are Moved Manually**: The system assumes that monkeys are moved to enclosures manually by users. There is no automated system for managing monkey movement based on certain criteria.

5. **Health Checks are Manual**: The system assumes that health checks for monkeys are performed manually by users. There is no automated health monitoring system integrated into the application.

6. **Stable Enclosure Capacity**: The system assumes that the capacity of enclosures remains stable during operation. It does not dynamically adjust enclosure capacities based on factors such as available space or population dynamics.


### Limitations

1. **Unique Names Requirement**: Every monkey's name must be unique. Since the program identifies monkeys by their names, using non-unique names can lead to confusion or errors. For example, attempting to add two monkeys named "Bobo" would result in a conflict.

2. **Manual Health Checks**: Health checks for monkeys are performed manually by users. The system does not include automated health monitoring.

3. **GUI Dependency**: The system is designed primarily for use in a graphical user interface (GUI) environment. Command-line interface (CLI) support is not provided.

4. **Limited Reporting**: While the system provides basic reporting functionalities, it does not offer advanced analytics or reporting features.


## Contact
If you have any questions or feedback, please contact:
- Email: tang.ruic@northeastern.edu
- Phone: 628-231-9242
