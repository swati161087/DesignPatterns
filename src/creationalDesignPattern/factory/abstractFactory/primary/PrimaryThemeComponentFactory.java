package creationalDesignPattern.factory.abstractFactory.primary;

import creationalDesignPattern.factory.abstractFactory.Button;
import creationalDesignPattern.factory.abstractFactory.Menu;
import creationalDesignPattern.factory.abstractFactory.ThemeComponentFactory;

public class PrimaryThemeComponentFactory implements ThemeComponentFactory {
    @Override
    public Button createButtonFactory() {
        return new PrimaryButton();
    }

    @Override
    public Menu createMenuFactory() {
        return new PrimaryMenu();
    }
}
