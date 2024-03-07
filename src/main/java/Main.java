import testsets.TestSet;

public class Main {
    public static void main(String[] args) {
        System.out.println("Creating new Test Set");
        TestSet practiceSet = new TestSet("practiceset");
        practiceSet.addQuestion();
        practiceSet.printQuestionSet();
    }
}
