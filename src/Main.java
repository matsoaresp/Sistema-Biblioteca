import model.LivroModel;
import view.BibliotecaView;

public class Main {
    public static void main(String[] args) {


        LivroModel livromodel = new LivroModel("Harry Potter","JH","Saraiva");
        BibliotecaView bib = new BibliotecaView();

        System.out.println(bib);


    }
}