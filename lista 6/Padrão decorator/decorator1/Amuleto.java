class Amuleto extends EquipamentoDecorator {
    public Amuleto(Personagem p) { 
        super(p); 
    }

    @Override
    public String getDescricao() {
        return personagem.getDescricao() + " e Amuleto Mágico";
    }

    @Override
    public int getDano() {
        return personagem.getDano() + 2;
    }
}