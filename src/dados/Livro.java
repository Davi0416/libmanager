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

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

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