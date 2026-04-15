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
        ListarLivros escolha2 = new ListarLivros();
        MenuEdicao escolha3 = new MenuEdicao();
        DeletarLivros escolha4 = new DeletarLivros();
        AluguelLivros escolha5 = new AluguelLivros();

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

            switch (opcao) {
                case 1:
                    escolha1.addLivro(listaLivros);
                    break;
                case 2:
                    escolha2.listarLivros(listaLivros);
                    break;
                case 3:
                    escolha3.menuEdicao(listaLivros);
                    break;
                case 4:
                    escolha4.delLivros(listaLivros);
                    break;
                case 5:
                    escolha5.alugarLivro(listaLivros);
                    break;
                case 6:
                    System.out.println("Até logo! 👋");
                    return;
                default:
                    System.out.println("⚠️  Opção inválida! Tente novamente.");
            }
        }
    }

    @Override
    public String toString() {
        return "Escolhas{" +
                "listaLivros=" + listaLivros +
                '}';
    }
}