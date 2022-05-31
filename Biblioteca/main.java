package Biblioteca;

import java.util.*;

public class main {

    static List<Livro> biblioteca = new ArrayList<>();
    static List<Usuario> membrosBiblioteca = new ArrayList<>();

    public static void main(String[] args) {

        //Adicionando Livros
        Livro livroThor = new Livro("Thor", 1);
        Livro livroHF = new Livro("Homem de Ferro", 2);
        Livro livroHA = new Livro("Homem Aranha", 3);
        Livro livroM = new Livro("Morbius", 4);
        Livro livroCiencias = new Livro("ciencias", 5);

        biblioteca.add(livroThor);
        biblioteca.add(livroHF);
        biblioteca.add(livroHA);
        biblioteca.add(livroM);

        //Adicionando Alunos
        Usuario matheus = new Usuario("Matheus", "12345");
        Usuario joao = new Usuario("joao", "22222");
        Usuario pedro = new Usuario("Pedro", "44444");
        membrosBiblioteca.add(matheus);
        membrosBiblioteca.add(joao);
        membrosBiblioteca.add(pedro);

        //ControleEmprestimo controleEmprestimo = new ControleEmprestimo(biblioteca, membrosBiblioteca);

        ControleEmprestimo controleEmprestimo = new ControleEmprestimo();

        controleEmprestimo.emprestarLivro(livroHA, matheus);
        controleEmprestimo.emprestarLivro(livroHA, pedro);
        controleEmprestimo.emprestarLivro(livroThor, pedro);
        controleEmprestimo.emprestarLivro(livroM, joao);

        controleEmprestimo.imprimeLivrosEmprestados();

        controleEmprestimo.devolverLivro(livroHA, matheus);
        controleEmprestimo.devolverLivro(livroCiencias, matheus);

        System.out.println("=============================");

        controleEmprestimo.imprimeLivrosEmprestados();
        System.out.println("=============================");

        //emprestarLivro("batata", 2);

        System.out.println("Emprestei: " + controleEmprestimo.numeroRegistros() +" livros");

    }
}
