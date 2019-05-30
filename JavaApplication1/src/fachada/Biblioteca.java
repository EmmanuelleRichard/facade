package fachada;

/**
 *
 * @author RyukP
 */
public class Biblioteca implements Facade{
    
 private  Devolucao devolucoes;
 private  Emprestimo emprestimos;
 private Cliente clientes;
    public Biblioteca() {
        this.devolucoes = new Devolucao();
        this.emprestimos = new Emprestimo();
    }
 
 
 

    @Override
    public void emprestimo(Cliente c, Livro d) {
        
        this.emprestimos.realizaEmprestimo(c, d);
     
    }

    @Override
    public void devolução(Cliente c, Livro d) {
        
      this.devolucoes.realizaDevolucao(c, d);
      
      
    }

    @Override
    public Cliente cadastraCliente(String nome, String cpf, String numero) {
        clientes = new Cliente();
        
      clientes.setCpf(cpf);
      clientes.setNome(nome);
      clientes.setNumero(numero);
      
      return clientes;
    }
 
   
    
}
