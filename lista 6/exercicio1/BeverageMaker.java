public abstract class BeverageMaker {
    private void boilWater() {
        System.out.println("Passo 1: Fervendo a água...");
    }

    private void pourInCup() {
        System.out.println("Passo 3: Despejando na xícara...");
    }

    protected  abstract void brew();
    protected abstract void addCondiments();

    public void makeBeverage() {
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }

}
