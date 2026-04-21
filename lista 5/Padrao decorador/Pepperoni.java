public class Pepperoni extends PizzaDecorator {
    public Pepperoni(Pizza p) {
        super(p);
    }

    @Override
    public void fazer() {
        super.fazer();
        System.out.print(" + Adicionando Pepperoni");
    }
}