package domain;

public class Customer implements ICustomer{
    public void order(String menuName, Menu menu, Barista barista) {
        Coffee coffee = barista.makeCoffee(menu.choose(menuName));
    }
}
