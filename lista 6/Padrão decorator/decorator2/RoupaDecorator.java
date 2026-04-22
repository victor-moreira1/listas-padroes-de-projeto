public class RoupaDecorator extends Pessoa {
    protected Pessoa pessoa1 = new Pessoa();

    public RoupaDecorator(Pessoa p) { 
        this.pessoa1 = p; 
    }
}
