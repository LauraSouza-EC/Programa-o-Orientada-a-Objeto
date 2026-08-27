//atributos como título, autor, e ISBN. Métodos para exibir 
// informações sobre o livro.

public class Livro{
    String titulo;
    String autor;
    String isbn;
    
    public Livro(String titulo, String autor, String isbn){
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
    }
    
    public void exibirLivro(){
        System.out.println("Livro: " + titulo + "Autor: " + autor + "ISBN: " 
        + isbn);
    }
}