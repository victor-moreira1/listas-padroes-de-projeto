import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

class AlunoIterator implements Iterator<String> {
    private List<String> alunos;
    private int posicao = 0;

    public AlunoIterator(List<String> alunos) {
        this.alunos = alunos;
    }

    @Override
    public boolean hasNext() {
        return posicao < alunos.size();
    }

    @Override
    public String next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        return alunos.get(posicao++);
    }
}