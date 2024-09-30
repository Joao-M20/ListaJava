public class Livro {

    private String nome;
    private String anoPublicacao;
    private Autor autor;
    private Editora editora;

    public Livro(String nome, String anoPublicacao, Autor autor, Editora editora) {
        this.nome = nome;
        this.anoPublicacao = anoPublicacao;
        this.autor = autor;
        this.editora = editora;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(String anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public Editora getEditora() {
        return editora;
    }

    public void setEditora(Editora editora) {
        this.editora = editora;
    }
}
