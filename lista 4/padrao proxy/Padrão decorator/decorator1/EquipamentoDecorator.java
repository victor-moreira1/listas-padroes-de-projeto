public abstract class EquipamentoDecorator implements Personagem {
    protected Personagem personagem;
    public EquipamentoDecorator(Personagem p) { 
        this.personagem = p; 
    }
}