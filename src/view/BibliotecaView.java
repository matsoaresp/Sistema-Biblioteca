package view;
import model.LivroModel;
import java.util.List;

public class BibliotecaView extends javax.swing.JFrame {

public void mostrarLivros(@org.jetbrains.annotations.NotNull List<LivroModel> livroModels) {
    System.out.println("Lista de livros");
    for (LivroModel livromodel : livroModels) {
        System.out.println("- " + livromodel.getTitulo() + " | " + livromodel.getAutor() + " | Emprestado: " + (livromodel.isEmprestado() ? "Sim" : "Não"));
    }



}
}
