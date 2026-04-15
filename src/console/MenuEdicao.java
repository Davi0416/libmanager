package console;

import dados.Livro;

import java.util.List;
import java.util.Scanner;

public class MenuEdicao {
    public void menuEdicao(List<Livro> lista) {

        for (int i = 0; i < lista.size(); i++) {
            System.out.println("┌─── Livro #" + i + " ───────────────┐");
            System.out.println(lista.get(i));
        }

        Scanner reader = new Scanner(System.in);

        System.out.print("Índice do livro para editar: ");
        int indice = reader.nextInt();
        reader.nextLine();

        Livro livro = lista.get(indice);

        while (true) {

            System.out.println("\n╔══════════════════════════╗");
            System.out.println("║      ✏️  EDITAR LIVRO      ║");
            System.out.println("╠══════════════════════════╣");
            System.out.println("║  1. 📖 Alterar Título     ║");
            System.out.println("║  2. 👤 Alterar Autor      ║");
            System.out.println("║  3. 🔢 Alterar ISBN       ║");
            System.out.println("║  4. 🔄 Alterar Disponib.  ║");
            System.out.println("║  5. 🚪 Voltar             ║");
            System.out.println("╚══════════════════════════╝");
            System.out.print("  👉 Escolha: ");


            int opcaoEdicao = reader.nextInt();
            reader.nextLine();

            switch (opcaoEdicao){
                case 1:
                    System.out.println("Digite o novo título: ");
                    livro.setTitulo(reader.nextLine());
                    break;

                case 2:
                    System.out.println("Digite o novo autor: ");
                    livro.setAutor(reader.nextLine());
                    break;

                case 3:
                    System.out.println("Digite o novo ISBN: ");
                    livro.setIsbn(reader.nextLine());
                    break;

                case 4:
                    System.out.println("Digite a nova quantidade em estoque: ");
                    livro.setEstoque(reader.nextInt());
                    break;

                case 5:
                    System.out.println("Saindo...");
                    return;

                default:
                    System.out.println("Nenhuma opção válida foi selecionada!");
            }
        }
    }
}
