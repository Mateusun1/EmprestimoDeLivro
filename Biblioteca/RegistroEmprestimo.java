package Biblioteca;

public class RegistroEmprestimo {

    public Livro livro;
    public Usuario usuario;

    public RegistroEmprestimo(Livro livro, Usuario usuario){
        this.livro = livro;
        this.usuario = usuario;
    }

}

