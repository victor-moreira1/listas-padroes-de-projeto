public class ComputadorFacade {
    CPU cpu;
    Memoria memoria;
    HardDrive hd;

    public ComputadorFacade() {
        this.cpu = new CPU();
        this.memoria = new Memoria();
        this.hd = new HardDrive();
    }

    public void ligarComputador() {
        System.out.println("Iniciando Boot do Sistema");
        cpu.iniciar();
        memoria.carregarBios();
        hd.lerDadosDoSetorDeBoot();
        System.out.println("Sistema operacional pronto para uso");
    }
}