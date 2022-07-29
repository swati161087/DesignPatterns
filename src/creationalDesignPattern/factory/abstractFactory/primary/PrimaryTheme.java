package creationalDesignPattern.factory.abstractFactory.primary;
import creationalDesignPattern.factory.abstractFactory.Theme;
import creationalDesignPattern.factory.abstractFactory.ThemeComponentFactory;

public class PrimaryTheme extends Theme {
    @Override
    public ThemeComponentFactory createThemeComponentFactory() {
        return new PrimaryThemeComponentFactory();
    }
}
