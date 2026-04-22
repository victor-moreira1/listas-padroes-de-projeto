public class DVDPlayer implements Device_Interpreter {
    @Override
    public void turnOn() {
        System.out.println("Usando DVD player.");
    }

    public void turnOff(){
        System.out.println("Desligando DVD player.");
    }

    public void start(){
        System.out.println("Iniciando reprodução de DVD.");
    }

    public void stop(){
        System.out.println("Parando reprodução de DVD.");
    }

    public void pause(){
        System.out.println("Pausando reprodução de DVD.");
    }

    public void reset(){
        System.out.println("Reiniciando DVD Player.");
    }
    
}
