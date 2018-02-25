/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package produtosjava;

/**
 *
 * @author glauc
 */
public class Produtos {
    int id;
    String nome;
    String marca;
    double preco;
   
    

    public Produtos(int id, String nome, String marca, double preco) {
        this.id = id;
        this.nome = nome;
        this.marca = marca;
        this.preco = preco;
      
        
    }
    

   public Produtos (){
       
   }
   
    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getMarca() {
        return marca;
    }

    public double getPreco() {
        return preco;
    }
    

    public void setId(int id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
  
    
    public void diminuirPreco(double percentual){
         this.preco = this.preco - (this.preco*percentual)/100;
        
    }
    public void aunentarPreco(double percentual){
        this.preco = this.preco + (this.preco*percentual)/100;
        
    }

   
}
    
}
