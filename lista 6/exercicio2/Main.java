public class Main {
    public static void main(String[] args) {
        Aprovador atendente = new Atendente();
        Aprovador gerente = new Gerente();
        Aprovador diretor = new Diretor();

        atendente.setProximo(gerente);
        gerente.setProximo(diretor);

        atendente.aprovar(50);
        atendente.aprovar(200);
        atendente.aprovar(800);
    }
}