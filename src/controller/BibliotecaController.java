package controller;

import model.LivroModel;
import repository.LivrosRepository;
import view.BibliotecaView;

public class BibliotecaController {

    private LivrosRepository repository;
    private BibliotecaView view;


    public BibliotecaController(LivrosRepository repository, BibliotecaView view) {
        this.repository = repository;
        this.view = new BibliotecaView();
    }

    public void adicionarLivro (String titulo, String autor) {
        LivroModel livro = new LivroModel(titulo, autor);
        repository.adicionarLivro(livro);
        view.exibirMensagem("Livro adicionado com sucesso!");

    }

    public void listarLivros () {
        view.mostrarLivros(repository.listarLivros());
    }

    public void emprestarLivro (String titulo){
        LivroModel livro = repository.encontrarPorTitulo(titulo);
        if(livro != null && !livro.isEmprestado()){
            livro.emprestar();
            view.exibirMensagem("Livro emprestado com sucesso!");
        }else {
            view.exibirMensagem("Livro não encontrado ou já emprestado");
        }
    }
    public void devolverLivro (String titulo){
        LivroModel livro = repository.encontrarPorTitulo(titulo);
        if(livro != null && livro.isEmprestado()){
            livro.devolver();
            view.exibirMensagem("Livro devolvido com sucesso!");
        }else {
            view.exibirMensagem("Livro não encontrado ou não está emprestado");
        }
    }

}
