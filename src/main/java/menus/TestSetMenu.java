package menus;

import testsets.TestSet;

public class TestSetMenu extends Menu {
    public TestSetMenu() {
        super();
        options.add(TestSet::new);
        optionStrings.add("New Test Set");
        this.execute();
    }
}
