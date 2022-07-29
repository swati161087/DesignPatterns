package creationalDesignPattern.factory.abstractFactory.dark;

import creationalDesignPattern.factory.abstractFactory.Button;
import creationalDesignPattern.factory.abstractFactory.Menu;
import creationalDesignPattern.factory.abstractFactory.ThemeComponentFactory;

public class DarkThemeComponentFactory implements ThemeComponentFactory {
    @Override
    public Button createButtonFactory() {
        return new DarkButton();
    }

    @Override
    public Menu createMenuFactory() {
        return new DarkMenu();
    }
}
