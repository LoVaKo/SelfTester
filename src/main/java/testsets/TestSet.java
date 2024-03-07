package testsets;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class TestSet {
    private final static Scanner scanner = new Scanner(System.in);
    private final LinkedHashMap<String, String> questionSet;
    private String name;

    public TestSet() {
        this.questionSet = new LinkedHashMap<>();
        this.name = "";
        createSet();
    }

    private void createSet() {
        System.out.print("Name of test set: ");
        String name = scanner.nextLine();
        setName(name);
        addQuestion();
        printQuestionSet();
    }

    public void addQuestion() {
        System.out.println("To stop adding questions, type 'quit'.");
        String question;
        String answer;

        while (true) {
            System.out.println("Question: ");
            question = scanner.nextLine();
            if (question.equalsIgnoreCase("quit")) {
                break;
            }
            System.out.println("Answer: ");
            answer = scanner.nextLine();
            questionSet.put(question, answer);
        }
    }

    public void removeQuestion() {

    }

    public void adjustQuestion() {

    }

    public void printQuestionSet() {
        int questionNumber = 1;
        for (Map.Entry<String, String> entry : questionSet.entrySet()) {
            System.out.println("Q" + questionNumber + ": " + entry.getKey());
            System.out.println("A" + questionNumber + ": " + entry.getValue());
            questionNumber++;
        }
    }

    public void save() {

    }

    // Getters and setters

    public void setName(String name) {
        this.name = name;
    }
}
