import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class Escola {
    public static void main(String[] args) {
        Turma turmaJava = new Turma();
        turmaJava.adicionarAluno("Isabelle");
        turmaJava.adicionarAluno("Isabella");
        turmaJava.adicionarAluno("Victor");
        turmaJava.adicionarAluno("José");

        Iterator<String> it = turmaJava.criarIterator();

        System.out.println("Lista de Alunos da Turma:");
        
        while (it.hasNext()) {
            String nome = it.next();
            System.out.println("- " + nome);
        }
    }
}