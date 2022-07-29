package creationalDesignPattern.factory.abstractFactory;

// step 1 Create Parent Class
public abstract class Theme {
    private String name;
    private String primaryColor;
    private String authorName;
 public abstract ThemeComponentFactory createThemeComponentFactory();
}
