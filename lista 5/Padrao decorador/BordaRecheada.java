public class BordaRecheada extends PizzaDecorator {
    public BordaRecheada(Pizza p) {
        super(p);
    }

    @Override
    public void fazer() {
        super.fazer();
        System.out.print(" + Adicionando Borda de Catupiry");
    }
}