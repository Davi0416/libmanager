package console;

import dados.Livro;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Escolhas {

    int opcao;
    Scanner reader = new Scanner(System.in);
    List<Livro> listaLivros = new ArrayList<>();

    public void menuInicial() {

        while (true) {
            System.out.println("\n╔══════════════════════════╗");
            System.out.println("║       📖 LIBMANAGER       ║");
            System.out.println("╠══════════════════════════╣");
            System.out.println("║  1. ➕ Adicionar Livro    ║");
            System.out.println("║  2. 📋 Listar Livros      ║");
            System.out.println("║  3. ✏️  Atualizar Livro   ║");
            System.out.println("║  4. 🗑️  Deletar Livro     ║");
            System.out.println("║  5. 🔖 Aluguel de Livros  ║");
            System.out.println("║  6. 🚪 Sair               ║");
            System.out.println("╚══════════════════════════╝");
            System.out.print("  👉 Escolha: ");
            opcao = reader.nextInt();
            if (opcao == 6) {
                break;
            } else if (opcao == 1) {
                escolha1();
            } else if (opcao == 2) {
                escolha2();
            }
        }
    }

    public void escolha1() {

        System.out.println("Digite o nome do livro: ");
        String nomeLivro = reader.nextLine();
        nomeLivro = reader.nextLine();

        System.out.println("Digite o nome do autor: ");
        String nomeAutor = reader.nextLine();

        System.out.println("Digite o ISBN do livro: ");
        String isbn = reader.nextLine();
        boolean disponivel = true;

        Livro livro = new Livro(nomeLivro, nomeAutor, isbn, disponivel);
        listaLivros.add(livro);
    }

    @Override
    public String toString() {
        return "Escolhas{" +
                "listaLivros=" + listaLivros +
                '}';
    }

    public void escolha2(){
        for (Livro livro : listaLivros) {
            System.out.println(livro);
        }
    }
}