package fachada;

/**
 *
 * @author RyukP
 */
public class Devolucao{
    
private boolean devolve;

    public boolean isDevolve() {
        return devolve;
    }

    public void setDevolve(boolean devolve) {
        this.devolve = devolve;
    }
    
    
    public void realizaDevolucao(Cliente c,Livro d){
    
      System.out.println("O cliente "+c.getNome()+" devolveu o livro "+d.getNome_Livro());
      
    }
    
}
