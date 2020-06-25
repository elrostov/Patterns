package refactoring_guru.builder.atavrel;

public class PizzaTest {

    public static void main(String[] args) {

        // Нельзя создать экземпляр класса не прибегая к помощи строителя, конструктор класса Pizza приватный
        // Pizza somePizza = new Pizza();


        // Задаем только те ингридиенты, которые нужны
        Pizza pizzaWithMushroomsAndCheese = new Pizza.PizzaMaker().cheese(true).mushrooms(true).tomato(true).make();
        System.out.println(pizzaWithMushroomsAndCheese);

        Pizza pizzaWithOlivesAndSausage = new Pizza.PizzaMaker().sausage(true).olives(true).make();
        System.out.println(pizzaWithOlivesAndSausage);


        // а теперь у нас появился директор(PizzaManager) , которому мы можем сделать заказ на пиццу
        PizzaManager manager = new PizzaManager();
        Pizza.PizzaMaker maker = new Pizza.PizzaMaker();

        // - Делаем заказ на пиццу с грибами и сыром!
        // - Манагер получает заказ и передает повару

        manager.pizzaWithMushroomsAndCheese(maker);

        //  Повар на кухне готовит и отдает нам
        Pizza p = maker.make();
        System.out.println("=========================================================================\n");
        System.out.println(p);

    }

}
