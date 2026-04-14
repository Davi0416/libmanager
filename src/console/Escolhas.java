package console;

import dados.Livro;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Escolhas {

    int opcao;
    Scanner reader = new Scanner(System.in);
    List<Livro> listaLivros = new ArrayList<>();

    public void menuInicial() {
        AdicionarLivro escolha1 = new AdicionarLivro();
        MenuEdicao escolha3 = new MenuEdicao();
        DeletarLivros escolha4 = new DeletarLivros();

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
                    escolha1.addLivro(listaLivros);
                } else if (opcao == 2) {
                    escolha2();
                } else if (opcao == 3) {
                    escolha3.menuEdicao(listaLivros);
                } else if (opcao == 4) {
                    escolha4.delLivros(listaLivros);
                }
            }
    }

    @Override
    public String toString() {
        return "Escolhas{" +
                "listaLivros=" + listaLivros +
                '}';
    }

    public void escolha2() {
        for (Livro livro : listaLivros) {
            System.out.println(livro);
        }
    }
}