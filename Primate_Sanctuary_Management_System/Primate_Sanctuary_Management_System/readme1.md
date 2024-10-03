# Primate Sanctuary Management System

## Overview
The Primate Sanctuary Management System is a Java application designed to manage a primate sanctuary. The system allows users to perform the following operations:

1. Admit new primates into the isolation area.
2. Transfer primates from the isolation area to the designated enclosures.
3. View the list of all primates in a specific enclosure.
4. View the list of all primates housed in the sanctuary.

## System Components
The system consists of the following main components:

1. `Primate`: Represents a primate, with attributes such as name, species, sex, size, weight, age, and favorite food.
2. `Isolation`: Responsible for managing the isolation area, including adding and removing primates.
3. `Enclosure`: Responsible for managing the enclosures for specific species, including adding and removing primates.
4. `Housing`: Defines he interface for adding and removing primates.
5. `Sanctuary`: Manages the overall sanctuary, including admitting primates to the isolation area, transferring primates from the isolation area to enclosures, and viewing the primates in different enclosures and across the entire sanctuary.
6. `SanctuaryView`: Provides a graphical user interface (GUI) for interacting with the system.
7. `SanctuaryController`: Handles user interface events and calls the corresponding Sanctuary methods.
8. `SanctuaryManagement`: The entry point of the program, responsible for creating the Sanctuary, SanctuaryView, and SanctuaryController instances and starting the application.

## Usage
1. Run the `SanctuaryManagement` class to start the application.
2. In the GUI interface, you can perform the following actions:
    - Click the "Admit Primate" button to add a new primate to the isolation area.
    - Click the "Transfer Primate" button to transfer a primate from the isolation area to a specified enclosure.
    - Click the "List Enclosure" button to view the list of all primates in a specified enclosure.
    - Click the "List All" button to view the list of all primates housed in the sanctuary.

## Testing
The system includes a set of JUnit 4 test cases located in the `test/folder` directory. These test cases cover the following functionalities:
1. Creation of Monkeys: Tests to ensure that monkeys can be created successfully and that invalid inputs are handled appropriately.
2. Isolation Management: Tests related to adding monkeys to the isolation area, including handling capacity constraints.
3. Moving Monkeys to Enclosures: Tests to verify that healthy monkeys can be moved to enclosures and that attempts to move unhealthy monkeys are rejected.
4. Species Reporting: Tests for generating accurate reports on the species present in the sanctuary.
5. Listing Monkeys in Enclosures: Tests to ensure that the list of monkeys in each enclosure is generated correctly.
6. Ordering Monkeys by Name: Tests to validate the sorting order of monkeys by name.

You can run these test cases to ensure that the system's various functionalities are working correctly.

## Contact
If you have any questions or feedback, please contact:
- Email: yu.nen@northeastern.edu
- Phone: 650-531-9540