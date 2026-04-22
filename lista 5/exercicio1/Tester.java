public class Tester {
    public static void main(String[] args) {
        Device_Interpreter meuPlayer = new DVDPlayer();

        System.out.println("--- Iniciando teste do dispositivo ---");
        meuPlayer.turnOn();
        meuPlayer.start();
        meuPlayer.pause();
        meuPlayer.stop();
        meuPlayer.turnOff();
    }
}