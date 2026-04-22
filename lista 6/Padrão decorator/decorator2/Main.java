
public class Main {
    public static void main(String[] args) {
        System.out.println("Isabelle:");
        Pessoa isabelle = new Pessoa();
        isabelle.pessoaVestida();
        isabelle.TemperaturaAmbiente();
        System.out.println("-----------------------");
        
        System.out.println("Victor:");
        Pessoa victor = new Moletom(new Pessoa());
        victor.pessoaVestida();
        victor.TemperaturaAmbiente();
    }
}
