class Gerente extends Aprovador {
    @Override
    public void aprovar(double valor) {
        if (valor <= 500) {
            System.out.println("Compra de R$" + valor + " aprovada pelo Gerente");
        } else if (proximo != null) {
            proximo.aprovar(valor);
        }
    }
}