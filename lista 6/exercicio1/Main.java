public class Main {
    public static void main(String[] args) {
        
        System.out.println("--- PREPARANDO O CHÁ ---");
        BeverageMaker meuCha = new TeaMaker();
        meuCha.makeBeverage();

        System.out.println("------------------------");

        System.out.println("--- PREPARANDO O CAFÉ ---");
        BeverageMaker meuCafe = new CoffeeMaker();
        meuCafe.makeBeverage();
    }
}