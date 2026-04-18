package console;

import dados.Livro;
import dados.Usuario;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Escolhas {

    int opcao;
    Scanner reader = new Scanner(System.in);
    List<Livro> listaLivros = new ArrayList<>();
    List<Usuario> listaUsuarios = new ArrayList<>();

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
            System.out.println("╠══════════════════════════╣");
            System.out.println("║  6. 👤 Adicionar Usuário  ║");
            System.out.println("║  7. ❌ Remover Usuário    ║");
            System.out.println("╠══════════════════════════╣");
            System.out.println("║  8. 🚪 Sair               ║");
            System.out.println("╚══════════════════════════╝");
            System.out.print("  👉 Escolha: ");
            opcao = reader.nextInt();

            if (opcao == 8) {
                break;
            } else if (opcao == 1) {
                escolha1.addLivro(listaLivros);
            } else if (opcao == 2) {
                escolha2();
            } else if (opcao == 3) {
                escolha3.menuEdicao(listaLivros);
            } else if (opcao == 4) {
                escolha4.delLivros(listaLivros);
            } else if (opcao == 6) {
                adicionarUsuario();
            } else if (opcao == 7) {
                removerUsuario();
            }
        }
    }

    private void removerUsuario() {
        if (listaUsuarios.isEmpty()) {
            System.out.println("nenhum usuário encontrado!");
            return;
        }

        Scanner reader = new Scanner(System.in);

        for (int i = 0; i < listaUsuarios.size(); i++) {
            System.out.println("┌─── Usuário #" + i + " ───────────────┐");
            System.out.println(listaUsuarios.get(i));
        }

        System.out.println("Digite o id do usuário: ");
        String entrada = reader.nextLine();

        if (entrada.equalsIgnoreCase("SAIR")) return;

        try {
            listaUsuarios.remove(Integer.parseInt(entrada));
            System.out.println("✅ Usuário removido com sucesso!");
        } catch (NumberFormatException e) {
            System.out.println("Erro: digite um número válido.");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Erro: índice não existe.");
        }
    }

    private void adicionarUsuario() {
        Scanner reader = new Scanner(System.in);

        System.out.println("Digite o login do usuário: ");
        String login = reader.next();

        System.out.println("Digite o email do usuário: ");
        String email = reader.next();

        int id = listaUsuarios.size();
        listaUsuarios.add(new Usuario(login, email, id));
        System.out.println("Usuário adicionado com sucesso! ID: " + id);

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