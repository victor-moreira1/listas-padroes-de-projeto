public class Espada extends EquipamentoDecorator {
    
    public Espada(Personagem p) {
         super(p); 
        }

    @Override
    public String getDescricao() { 
        return personagem.getDescricao() + ", com Espada"; 
    }
    
    @Override
    public int getDano() { 
        return personagem.getDano() + 5; 
    }

}