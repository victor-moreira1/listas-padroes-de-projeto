public class CDPlayer implements Device_Interpreter {
    @Override
    public void turnOn() {
        System.out.println("Usando CD player.");
    }

    public void turnOff(){
        System.out.println("Desligando CD player.");
    }

    public void start(){
        System.out.println("Iniciando reprodução de CD.");
    }

    public void stop(){
        System.out.println("Parando reprodução de CD.");
    }

    public void pause(){
        System.out.println("Pausando reprodução de CD.");
    }

    public void reset(){
        System.out.println("Reiniciando CD Player.");
    }
    
}
