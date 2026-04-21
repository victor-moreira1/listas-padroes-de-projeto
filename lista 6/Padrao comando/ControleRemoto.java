class ControleRemoto {
    private Command comando;

    public void setComando(Command comando) {
        this.comando = comando;
    }

    public void pressionarBotao() {
        if (comando != null) {
            comando.execute();
        }
    }
}