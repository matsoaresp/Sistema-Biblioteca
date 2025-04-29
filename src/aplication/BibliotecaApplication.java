package aplication;

import repository.LivrosRepository;
import controller.BibliotecaController;
import view.BibliotecaView;

import java.util.Scanner;

public class BibliotecaApplication {
    private final BibliotecaController controller;
    private final Scanner scanner;

    public BibliotecaApplication() {
        LivrosRepository repository = new LivrosRepository();
        BibliotecaView view = new BibliotecaView();
        this.controller = new BibliotecaController(repository, view);
        this.scanner = new Scanner(System.in);
    }

    public void run() {
        int opcao;

        do {
            mostrarMenu();
            opcao = lerOpcao();

            switch (opcao) {
                case 1 -> adicionarLivro();
                case 2 -> controller.listarLivros();
                case 3 -> emprestarLivro();
                case 4 -> devolverLivro();
                case 0 -> System.out.println("Saindo...");
                default -> System.out.println("Opção inválida!");
            }

        } while (opcao != 0);

        scanner.close();
    }

    private void mostrarMenu() {
        System.out.println("\n1 - Adicionar livro");
        System.out.println("2 - Listar livros");
        System.out.println("3 - Emprestar livro");
        System.out.println("4 - Devolver livro");
        System.out.println("0 - Sair");
        System.out.print("Escolha: ");
    }

    private int lerOpcao() {
        int opcao = scanner.nextInt();
        scanner.nextLine(); // Consumir enter
        return opcao;
    }

    private void adicionarLivro() {
        System.out.print("Título: ");
        String titulo = scanner.nextLine();
        System.out.print("Autor: ");
        String autor = scanner.nextLine();
        controller.adicionarLivro(titulo, autor);
    }

    private void emprestarLivro() {
        System.out.print("Título do livro para emprestar: ");
        String titulo = scanner.nextLine();
        controller.emprestarLivro(titulo);
    }

    private void devolverLivro() {
        System.out.print("Título do livro para devolver: ");
        String titulo = scanner.nextLine();
        controller.devolverLivro(titulo);
    }
}
