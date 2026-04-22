public class Incremental {
    private static int count = 0;
    private static Incremental instancia;

    private Incremental(){}

    public void incrementar() {
        ++count;
    }

    public static Incremental getInstance() {
        if (instancia == null) {
            instancia = new Incremental();
        }
        return instancia;
    }

    public String toString() {
        return "Incremento " + count;
    }
}
