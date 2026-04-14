package console;

import dados.Livro;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class DeletarLivros {
    public void delLivros(List<Livro> list) {
        if (list.size() == 0){
            System.out.println("Nenhum livro disponível!");
            return;
        }

        Scanner reader =  new Scanner(System.in);
        while (true){
            for (int i = 0; i < list.size(); i++) {
            System.out.println("┌─── Livro #" + i + " ───────────────┐");
            System.out.println(list.get(i));
        }
            System.out.println("Digite o índice do livro que quer deletar ou SAIR pra sair");
            String indice = reader.nextLine();
            if (indice.equals("SAIR")){
                return;
            }

            try {
                list.remove(Integer.parseInt(indice));
            } catch (NumberFormatException e){
                System.out.println("Nenhuma opção válida selecionada!");
                return;
            }
        }
    }
}
