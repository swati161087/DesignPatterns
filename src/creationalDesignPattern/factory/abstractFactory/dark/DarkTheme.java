package creationalDesignPattern.factory.abstractFactory.dark;

import creationalDesignPattern.factory.abstractFactory.Theme;
import creationalDesignPattern.factory.abstractFactory.ThemeComponentFactory;

public class DarkTheme extends Theme {
    @Override
    public ThemeComponentFactory createThemeComponentFactory() {
        return new DarkThemeComponentFactory();
    }
}
