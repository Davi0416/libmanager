import console.Escolhas;
import dados.Livro;
import dados.Usuario;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Escolhas escolhas = new Escolhas();

        escolhas.menuInicial();

        Scanner reader = new Scanner(System.in);
        var livro = new Livro[10];
        var user = new Usuario();

        int opcao = 0;
    }
}
