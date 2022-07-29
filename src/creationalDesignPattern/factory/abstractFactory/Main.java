package creationalDesignPattern.factory.abstractFactory;

import creationalDesignPattern.factory.abstractFactory.dark.DarkTheme;
import creationalDesignPattern.factory.abstractFactory.primary.PrimaryTheme;

public class Main {
    public static void main(String[] args) {
        Theme primaryTheme=new PrimaryTheme();
        Button primayButton= primaryTheme.createThemeComponentFactory().createButtonFactory();
        Theme darkTheme=new DarkTheme();
        Button darkButton= darkTheme.createThemeComponentFactory().createButtonFactory();
    }
}
