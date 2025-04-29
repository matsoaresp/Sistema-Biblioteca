package repository;

import model.LivroModel;

import java.util.ArrayList;
import java.util.List;

public class LivrosRepository {
    private List<LivroModel> livros = new ArrayList<>();

    public void adicionarLivro(LivroModel livro) {
        livros.add(livro);
    }

    public List<LivroModel> listarLivros() {
        return livros;
    }

    public LivroModel encontrarPorTitulo(String titulo) {
        for (LivroModel livro : livros) {
            if (titulo.equals(livro.getTitulo())) {
                return livro;
            }
        }
        return null;
    }
}
