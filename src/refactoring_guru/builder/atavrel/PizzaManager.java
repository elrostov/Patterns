package refactoring_guru.builder.atavrel;

public class PizzaManager {

    public void pizzaWithMushroomsAndCheese(Pizza.PizzaMaker pizzaMaker) {
        pizzaMaker.cheese(true).mushrooms(true).tomato(true);

    }

    public void pizzaWithOlivesAndSausage(Pizza.PizzaMaker pizzaMaker) {
        pizzaMaker.sausage(true).olives(true);
    }

}
