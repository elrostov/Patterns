package refactoring_guru.builder.atavrel;

/**
 * Реализация паттерна Строитель с использованием вложенного класса
 */

public class Pizza {

    private boolean tomato;
    private boolean cheese;
    private boolean olives;
    private boolean sausage;
    private boolean mushrooms;

    private Pizza(PizzaMaker pizzaMaker) {
        this.tomato = pizzaMaker.tomato;
        this.cheese = pizzaMaker.cheese;
        this.olives = pizzaMaker.olives;
        this.sausage = pizzaMaker.sausage;
        this.mushrooms = pizzaMaker.mushrooms;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "tomato=" + tomato +
                ", cheese=" + cheese +
                ", olives=" + olives +
                ", sausage=" + sausage +
                ", mushrooms=" + mushrooms +
                '}';
    }

    public static class PizzaMaker {

        private boolean tomato;
        private boolean cheese;
        private boolean olives;
        private boolean sausage;
        private boolean mushrooms;

        public PizzaMaker tomato(Boolean hasTomato) {
            this.tomato = hasTomato;
            return this;
        }

        public PizzaMaker olives(Boolean hasOlives) {
            this.olives = hasOlives;
            return this;
        }

        public PizzaMaker sausage(Boolean hasSausage) {
            this.sausage = hasSausage;
            return this;
        }

        public PizzaMaker mushrooms(Boolean hasMushrooms) {
            this.mushrooms = hasMushrooms;
            return this;
        }

        public PizzaMaker cheese(Boolean hasCheese) {
            this.cheese = hasCheese;
            return this;
        }

        public Pizza make() {
            return new Pizza(this);
        }
    }
}
