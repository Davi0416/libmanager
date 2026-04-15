package console;

import dados.Livro;

import java.util.List;
import java.util.Scanner;

public class AluguelLivros {

    public void alugarLivro(List<Livro> list) {
        while (true) {
            Scanner indiceInicial = new Scanner(System.in);

            for (int i = 0; i < list.size(); i++) {
                System.out.println("┌─── Livro #" + i + " ───────────────┐");
                System.out.println(list.get(i) + "\n");
            }

            System.out.println();
            System.out.println("Digite o índice do livro que deseja alugar ou SAIR pra sair: ");
            String indice = indiceInicial.nextLine();

            if (indice.equalsIgnoreCase("SAIR")) {
                return;
            }

            try {
                Livro livro = list.get(Integer.parseInt(indice));

                if (livro.getEstoque() == 0) {
                    System.out.println("Sem estoque para esse livro!");
                    continue;
                }

                if (livro.getEstoque() > 0) {
                    livro.setEstoque(livro.getEstoque() - 1);
                    continue;
                }
            } catch (NumberFormatException e) {
                System.out.println("Erro: Por favor, digite um número válido ou 'SAIR'.");
                continue;
            } catch (IndexOutOfBoundsException e) {
                System.out.println("Erro: O índice " + indice + " não existe na lista.");
                continue;
            }
        }
    }
}
