public class VoiceRecorder implements Device_Interpreter {
    @Override
    public void turnOn() {
        System.out.println("Usando gravador de voz.");
    }

    public void turnOff(){
        System.out.println("Desligando gravador de voz.");
    }

    public void start(){
        System.out.println("Iniciando reprodução de gravação de voz.");
    }

    public void stop(){
        System.out.println("Parando reprodução de gravação de voz.");
    }

    public void pause(){
        System.out.println("Pausando reprodução de gravação de voz.");
    }

    public void reset(){
        System.out.println("Reiniciando gravação de voz.");
    }
    
}