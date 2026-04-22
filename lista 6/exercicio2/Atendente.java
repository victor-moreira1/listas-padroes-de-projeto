class Atendente extends Aprovador {
    @Override
    public void aprovar(double valor) {
        if (valor <= 100) {
            System.out.println("Compra de R$" + valor + " aprovada pelo Atendente");
        } else if (proximo != null) {
            proximo.aprovar(valor);
        }
    }
}