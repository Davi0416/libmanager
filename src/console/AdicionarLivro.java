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
        boolean disponivel = true;

        Livro livro = new Livro(nomeLivro, nomeAutor, isbn, disponivel);
        list.add(livro);
    }
}
