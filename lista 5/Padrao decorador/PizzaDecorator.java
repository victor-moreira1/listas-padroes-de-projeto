public class PizzaDecorator implements Pizza {
    protected Pizza pizza;

    public PizzaDecorator(Pizza p) {
        this.pizza = p;
    }

    @Override
    public void fazer() {
        this.pizza.fazer();
    }
}