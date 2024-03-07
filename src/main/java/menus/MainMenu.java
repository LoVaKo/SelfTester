package menus;

public class MainMenu extends Menu {
    public MainMenu() {
        super();
        this.options.add(TestMenu::new);
        this.options.add(TestSetMenu::new);
        this.optionStrings.add("Test");
        this.optionStrings.add("Manage Test Sets");
        this.execute();
    }

}
