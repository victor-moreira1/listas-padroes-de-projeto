import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

class Turma implements ColecaoAlunos {
    private List<String> alunos;

    public Turma() {
        this.alunos = new ArrayList<>();
    }

    public void adicionarAluno(String nome) {
        this.alunos.add(nome);
    }

    @Override
    public Iterator<String> criarIterator() {
        return new AlunoIterator(alunos);
    }
}