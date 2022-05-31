package Biblioteca;

public class Livro {
    private String titulo;
    private int id;

    public String getTitulo() {
        return titulo;
    }

    public int getId() {
        return id;
    }

    public Livro(String titulo, int id){
        super();
        this.titulo = titulo;
        this.id = id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
