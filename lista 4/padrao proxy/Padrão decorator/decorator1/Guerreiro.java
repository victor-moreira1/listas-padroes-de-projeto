public class Guerreiro implements Personagem {
    @Override
    public String getDescricao() { 
        return "Guerreiro"; 
    }

    @Override
    public int getDano() { 
        return 10; 
    }
}