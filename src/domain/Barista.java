package domain;

public class Barista implements IBarista{
    public Coffee makeCoffee(MenuItem menuItem) {
        return new Coffee(menuItem);
    }
}
