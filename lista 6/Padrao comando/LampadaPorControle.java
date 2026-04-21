public class LampadaPorControle {
    public static void main(String[] args) {
        Lampada minhaLampada = new Lampada();

        Command ligar = new LigarLampadaCommand(minhaLampada);
        Command desligar = new DesligarLampadaCommand(minhaLampada);

        ControleRemoto controle = new ControleRemoto();

        controle.setComando(ligar);
        controle.pressionarBotao();

        controle.setComando(desligar);
        controle.pressionarBotao();
    }
}