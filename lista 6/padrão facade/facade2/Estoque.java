class Estoque {
    private int QuantidadeItensPC = 10;
    private int QuantidadeItensHeadset = 5;

    public boolean verificaDisponibilidade(String produto) {
        if (produto.equals("PC")) {
            if (this.QuantidadeItensPC > 0) {
                System.out.println("Há produto no estoque.");
                return true;
            } else {
                System.out.println("Não há " + produto + "no estoque.");
                return false;
            }    
        } else if (produto.equals("Headset")){
                if (this.QuantidadeItensHeadset > 0) {
                System.out.println("Há produto no estoque.");
                return true;
            } else {
                System.out.println("Não há " + produto + "no estoque.");
                return false;
            }    
        } else {
            System.out.println("Produto inexistente no estoque.");
            return false;
        }
    }

    public int getQntdPCS(){
        return this.QuantidadeItensPC;
    }

    public int getQntdHeadsets(){
        return this.QuantidadeItensHeadset;
    }

    public void setQntdPCS(int x) {
        this.QuantidadeItensPC = x;
    }

    public void setQntdHeadsets(int x) {
        this.QuantidadeItensHeadset = x;
    }

    public void reservarItem(String produto) {
        if (produto.equals("PC")) {
            int novaQuantidade = this.getQntdPCS() - 1;
            this.setQntdPCS(novaQuantidade);
        } else if (produto.equals("Headset")) {
            int novaQuantidade = this.getQntdHeadsets() - 1;
            this.setQntdHeadsets(novaQuantidade);
        }    
    } 

    public void baixaEstoque() {
        System.out.println("Baixa efetuada no sistema de estoque.");
    }
}