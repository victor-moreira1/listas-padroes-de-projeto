class LigarLampadaCommand implements Command {
    private Lampada lampada;

    public LigarLampadaCommand(Lampada lampada) {
        this.lampada = lampada;
    }

    @Override
    public void execute() {
        lampada.ligar();
    }
}