class Diretor extends Aprovador {
    @Override
    public void aprovar(double valor) {
        System.out.println("Compra de R$" + valor + " aprovada pelo Diretor");
    }
}