package console;

import dados.Livro;

import java.util.List;

public class ListarLivros {
    public void listarLivros(List<Livro> list) {

        for (Livro livro : list) {
            System.out.println(livro);
        }
    }
}
