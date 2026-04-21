class DesligarLampadaCommand implements Command {
    private Lampada lampada;

    public DesligarLampadaCommand(Lampada lampada) {
        this.lampada = lampada;
    }

    @Override
    public void execute() {
        lampada.desligar();
    }
}