public class CoffeeMaker extends BeverageMaker {
    @Override
    protected void brew() {
        System.out.println("Passo 2: Filtrando o café moído...");
    }

    @Override
    protected void addCondiments() {
        System.out.println("Passo 4: Adicionando açúcar e leite...");
    }
}