public class TeaMaker extends BeverageMaker {
    @Override
    protected void brew() {
        System.out.println("Passo 2: Fazendo a infusão das folhas de chá...");
    }

    @Override
    protected void addCondiments() {
        System.out.println("Passo 4: Adicionando limão...");
    }
}