    package creationalDesignPattern.factory.abstractFactory;

    public interface ThemeComponentFactory {
        public Button createButtonFactory();
        public Menu createMenuFactory();
    }