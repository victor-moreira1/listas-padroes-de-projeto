public class Main {
    public static void main(String[] args) {
        Personagem p = new Amuleto(new Espada(new Guerreiro()));
        System.out.println(p.getDescricao());
    }
}