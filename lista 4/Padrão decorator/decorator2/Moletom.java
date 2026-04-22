public class Moletom extends RoupaDecorator {
    
    public Moletom(Pessoa p) {
         super(p); 
        }

    @Override
    public void pessoaVestida() { 
        System.out.println("Agora a pessoa está de regata e moletom sobreposto!!");
    }
    
    @Override
    public void TemperaturaAmbiente() { 
         System.out.println("Está frio, mas essa pessoa está vestida pra ficar quentinha.");
    }

}