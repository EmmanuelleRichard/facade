/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fachada;

/**
 *
 * @author RyukP
 */
public interface Facade {
    
    
    public void emprestimo(Cliente c,Livro d);
    public void devolução(Cliente c,Livro d);
    public Cliente cadastraCliente(String nome,String cpf,String numero);
  
    
}
