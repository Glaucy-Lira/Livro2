/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package produtosjava;

import java.util.Scanner;

/**
 *
 * @author glauc
 */
public class ProdutosJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          Scanner sc = new  Scanner (System.in);
          
          
          Produtos produtos[] = new Produtos[2];
          
          Produtos prod;
          
            for(int i = 0; i< produtos.length; i++ ){
                 prod = new Produtos();
                
                System.out.println("Informe o id: ");
                prod.setId(sc.nextInt());
                sc.nextLine();
                System.out.println("Informe o nome: ");
                prod.setNome(sc.nextLine());                
                System.out.println("Informe a Marca: ");
                prod.setMarca(sc.nextLine());                
                System.out.println("Informe o Preço: ");
                prod.setPreco(sc.nextDouble());
                produtos[i] = prod;
                
                
            }
            
            for(int i = 0; i< produtos.length; i++ ){
                prod = produtos[i];
                System.out.println("Id: " + prod.getId());
                System.out.println("Nome: " + prod.getNome());        
                System.out.println( "Marca: " + prod.getMarca());
                System.out.println( "Preco: " + prod.getPreco());
                prod.diminuirPreco(15);
                System.out.println("Preço Reajustado: " + prod.getPreco());
                
                
                
            }
        
                
    }
    
}


    }
    
}
