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
public class Emprestimo{
    
    private boolean emprestado=false;

    public boolean isEmprestado() {
        return emprestado;
    }

    public void setEmprestado(boolean emprestado) {
        this.emprestado = emprestado;
    }
   
    
    public void realizaEmprestimo(Cliente c,Livro d){
           
        System.out.println("O cliente "+c.getNome()+" Pegou o livro "+d.getNome_Livro());
        this.emprestado=true;
        
        
    }
}
