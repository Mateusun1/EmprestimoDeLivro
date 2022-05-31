package Biblioteca;

public class Usuario{
    private String nome;
    private String documento;

    public Usuario(String nome, String doc){
        this.nome = nome;
        this.documento = doc;
    }

    public boolean usuarioExiste(String documento){
        return false;
    }

    public String getNome() {
        return nome;
    }

    public String getDocumento() {
        return documento;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}


