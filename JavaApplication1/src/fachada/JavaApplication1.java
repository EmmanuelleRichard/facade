package fachada;

/**
 *
 * @author RyukP
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

     Cliente[] lista = new Cliente[100];
        
        Livro novoLivro = new Livro("Percy jackson","5855",856);
        
        Facade nini = new Biblioteca();
        
       lista[0] = nini.cadastraCliente("Johnas","556","28526666");
        
       nini.emprestimo(lista[0], novoLivro);

    }
    
}
