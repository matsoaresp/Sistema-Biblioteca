package model;

public class LivroModel {

    private String titulo;
    private String autor;
    private boolean emprestado = false;

    public LivroModel(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
        this.emprestado = false;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }


    public boolean isEmprestado() {
        return emprestado;
    }

    public void emprestar() {
        this.emprestado = true;

    }

    public void devolver() {
        this.emprestado = false;

    }
}
