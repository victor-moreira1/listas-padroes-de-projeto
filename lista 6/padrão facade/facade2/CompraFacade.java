public class CompraFacade {
    private Estoque meuEstoqueFacade;

    public CompraFacade(){
        this.meuEstoqueFacade = new Estoque();
    }
    
    public void reservaItemPC(){
        boolean x = meuEstoqueFacade.verificaDisponibilidade("PC");
        if (x == true){
            meuEstoqueFacade.reservarItem("PC");
            meuEstoqueFacade.baixaEstoque();
        } else {
            System.out.println("Finalizando serviço.");
        }
    }

    public void reservarItemHeadset(){
        boolean x = meuEstoqueFacade.verificaDisponibilidade("Headset");
        if (x == true){
            meuEstoqueFacade.reservarItem("Headset");
            meuEstoqueFacade.baixaEstoque();
        } else {
            System.out.println("Finalizando serviço.");
        }
    }
}
