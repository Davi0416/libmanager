package console;

import dados.Livro;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class DeletarLivros {
    public void delLivros(List<Livro> list) {
        while (true){
        if (list.isEmpty()){
            System.out.println("Nenhum livro disponível!");
            return;
        }
        Scanner reader =  new Scanner(System.in);

            for (int i = 0; i < list.size(); i++) {
            System.out.println("┌─── Livro #" + i + " ───────────────┐");
            System.out.println(list.get(i));
        }
            System.out.println("Digite o índice do livro que quer deletar ou SAIR pra sair");
            String entrada = reader.nextLine();

            if (entrada.equalsIgnoreCase("SAIR")){
                return;
            }

            try {
                list.remove(Integer.parseInt(entrada));
            } catch (NumberFormatException e) {
                System.out.println("Erro: Por favor, digite um número válido ou 'SAIR'.");
                continue;
            } catch (IndexOutOfBoundsException e) {
                System.out.println("Erro: O índice " + entrada + " não existe na lista.");
                continue;
            }
        }
    }
}
