package menus;

import java.util.ArrayList;
import java.util.Scanner;

public abstract class Menu {
    ArrayList<Option> options;
    ArrayList<String> optionStrings;

    public Menu() {
        this.options = new ArrayList<>();
        this.optionStrings = new ArrayList<>();
    }

    public void execute() {
        printMenu();
        int pickedOption = pickOption();
        executeOption(pickedOption);
    }

    private void executeOption(int pickedOption) {
        int INDEX_CORRECTION = 1;
        options.get(pickedOption - INDEX_CORRECTION).execute();
    }

    private int pickOption() {
        Scanner scanner = new Scanner(System.in);
        int pickedOption = -1;

        System.out.print("Pick option: ");
        while (pickedOption == -1) {
            if (scanner.hasNextInt()) {
                pickedOption = scanner.nextInt();
                if (pickedOption < 1 || pickedOption > optionStrings.size()) {
                    System.out.println("Invalid option. Please provide a number from the list.");
                    pickedOption = -1;
                }
            } else {
                System.out.println("Invalid input. Please provide input of type int.");
                scanner.next();
            }
        }

        return pickedOption;
    }

    private void printMenu() {
        // Print title of menu
        switch (this) {
            case MainMenu mainMenu -> System.out.println("=== Main Menu ===");
            case TestSetMenu testSetMenu -> System.out.println("=== Test Set Menu ===");
            case TestMenu testMenu -> System.out.println("=== Test Menu ===");
            default -> throw new IllegalStateException("Unexpected value: " + this);
        }

        // print numbered options
        int optionNumber = 1;
        for (String str : optionStrings) {
            System.out.println(optionNumber + ". " + str);
            optionNumber++;
        }
    }

}
