public class TesteIncremental {
    public static void main(String[] args) {
        Incremental inc = Incremental.getInstance();
        
        inc.incrementar();
        System.out.println(inc); 
        
        inc.incrementar();
        System.out.println(inc); 
    }
}