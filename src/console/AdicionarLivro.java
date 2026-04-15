package console;
import dados.Livro;
import java.util.List;
import java.util.Scanner;

public class AdicionarLivro {
    public void addLivro(List <Livro> list) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Digite o nome do livro: ");
        String nomeLivro = reader.nextLine();

        System.out.println("Digite o nome do autor: ");
        String nomeAutor = reader.nextLine();

        System.out.println("Digite o ISBN do livro: ");
        String isbn = reader.nextLine();

        int estoque;
        while (true) {
            System.out.println("Digite a quantidade para ter em estoque: ");
            estoque = reader.nextInt();
            if (estoque > 0){
                break;
            }
            if (estoque <= 0){
                System.out.println("O número de estoque precisa ser maior do que 0!");
            }
        }

        Livro livro = new Livro(nomeLivro, nomeAutor, isbn, estoque);
        list.add(livro);
    }
}