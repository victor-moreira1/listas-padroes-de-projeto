
public class FacadeComputador {
    
    private Processador cpu;
    private Memoria memoria;
    private Hardware hardware;
    private SistemaOperacional SO;

    public FacadeComputador() {
        this.cpu = new Processador();
        this.memoria = new Memoria();
        this.hardware = new Hardware();
        this.SO = new SistemaOperacional();
    }

    public void ligarComputador(){
        System.out.println("Inicializando serviços.");
        cpu.ligaCPU();
        memoria.preparaMemoria();
        hardware.verificaHardware();
        SO.preparaSO();
        System.out.println("Computador funcionando!!");
    }

    public void desligaComputador(){
        System.out.println("Preparando para desligar...");
        SO.desligaSO();
        memoria.desalocaMemoria();
        hardware.desligaHardware();
        cpu.desligaCPU();
        System.out.println("Computador desligado.");
    }

}