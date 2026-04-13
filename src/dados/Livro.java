package dados;
import console.Escolhas;

import java.util.ArrayList;
import java.util.List;


public class Livro {

    private String titulo;
    private String autor;
    private String isbn;
    private boolean disponivel;


    public Livro(String titulo, String autor, String isbn, boolean disponivel) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.disponivel = disponivel;
    }

    Escolhas escolhas = new Escolhas();

    @Override
    public String toString() {
        return "╔══════════════════════════╗\n" +
                "       📚 DETALHES DO LIVRO      \n" +
                "╠══════════════════════════╣\n" +
                "  Título    : " + titulo + "\n" +
                "  Autor     : " + autor + "\n" +
                "  ISBN      : " + isbn + "\n" +
                "  Disponível: " + (disponivel ? "✅ Sim" : "❌ Não") + "\n" +
                "╚══════════════════════════╝";
    }
}