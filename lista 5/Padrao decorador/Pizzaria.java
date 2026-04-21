public class Pizzaria {
    public static void main(String[] args) {
        Pizza pizzaPepperoni = new Pepperoni(new PizzaMussarela());
        pizzaPepperoni.fazer();
        
        System.out.println("\n");

        Pizza pizzaCombo = new Pepperoni(new BordaRecheada(new PizzaMussarela()));
        pizzaCombo.fazer();
    }
}