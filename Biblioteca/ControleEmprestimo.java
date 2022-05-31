package Biblioteca;

import java.util.ArrayList;
import java.util.List;

public class ControleEmprestimo {

    private List<RegistroEmprestimo> registro;
    private static int contador;

    public ControleEmprestimo() {
        this.registro = new ArrayList<>();
    }

    // Setter
    public void adicionaRegistro(RegistroEmprestimo novoRegistro){
        this.registro.add(novoRegistro);
        this.contador += 1;
    }

    //Getter
    public List<RegistroEmprestimo> leRegistro(){
        return this.registro;
    }

    public void excluiRegistro(Livro livro, Usuario usuario){
        // percorre toda a lista de livro com FOR
        // para cada livro, compara se achou o nome do livro e o nome do usuário no registro que está vendo no for
        // se achou, guarda a posição da lista
        // ** usar comando BREAK
        // se não achou, continua procurando

        // se achou a posição válida, chama o remove com o valor do indice.
        // https://www.journaldev.com/31869/java-list-remove-methods-arraylist-remove

        for (int i=0; i<registro.size(); i++) {
                if ((livro.getTitulo().equals(livro.getTitulo())) && (usuario.getNome().equals(usuario.getNome()))) {
                    registro.get(i);
                    registro.remove(i);
                    this.contador--;
                    break;
                }
        }


        /*

        ****** como filtar uma stream java

        RegistroEmprestimo remover = new RegistroEmprestimo(livro, usuario);
        Optional<RegistroEmprestimo> registro = this.registro.stream().filter(reg -> reg.usuario.getNome().equals(usuario.getNome()) && reg.livro.getTitulo().equals(livro.getTitulo())).findFirst();

        if(registro.isPresent()) {
            boolean removido = this.registro.remove(registro.get());
            this.contador -= 1;
        }
        */

    }

    public void emprestarLivro(Livro livro, Usuario usuario){
        RegistroEmprestimo novoEmprestimo = new RegistroEmprestimo(livro, usuario);
        adicionaRegistro(novoEmprestimo);
    }

    public void imprimeLivrosEmprestados(){
        this.registro.forEach( reg -> imprimirRegistro(reg));
        System.out.println("FIM RELATORIO ");
    }

    public void imprimirRegistro(RegistroEmprestimo registro){

        System.out.println("Livro "+ registro.livro.getTitulo() + " emprestado para Usuário: "+registro.usuario.getNome());
    }

    public void devolverLivro(Livro livro, Usuario usuario){
        excluiRegistro(livro, usuario);
    }

    public static int numeroRegistros(){
        return contador;
    }
}

