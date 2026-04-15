package dados;
import console.Escolhas;

import java.util.ArrayList;
import java.util.List;


public class Livro {

    private String titulo;
    private String autor;
    private String isbn;
    private int estoque;


    public Livro(String titulo, String autor, String isbn, int estoque) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.estoque = estoque;
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


    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }


    @Override
    public String toString() {
        return "╔══════════════════════════╗\n" +
                "       📚 DETALHES DO LIVRO      \n" +
                "╠══════════════════════════╣\n" +
                "  Título     : " + titulo + "\n" +
                "  Autor      : " + autor + "\n" +
                "  ISBN       : " + isbn + "\n" +
                "  Disponível : " + estoque + (estoque > 0 ? " unidades" : " (Esgotado)") + "\n" +
                "╚══════════════════════════╝";
    }
}