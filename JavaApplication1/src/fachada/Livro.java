package fachada;

/**
 *
 * @author RyukP
 */
public class Livro {
    private String nome_Livro;
    private String cod_Livro;
    private int num_Paginas;

    public Livro() {
        
    }

    
    public Livro(String nome_Livro, String cod_Livro, int num_Paginas) {
        this.nome_Livro = nome_Livro;
        this.cod_Livro = cod_Livro;
        this.num_Paginas = num_Paginas;
    }

    public String getNome_Livro() {
        return nome_Livro;
    }

    public void setNome_Livro(String nome_Livro) {
        this.nome_Livro = nome_Livro;
    }

    public String getCod_Livro() {
        return cod_Livro;
    }

    public void setCod_Livro(String cod_Livro) {
        this.cod_Livro = cod_Livro;
    }

    public int getNum_Paginas() {
        return num_Paginas;
    }

    public void setNum_Paginas(int num_Paginas) {
        this.num_Paginas = num_Paginas;
    }
    
    
    
    
}
