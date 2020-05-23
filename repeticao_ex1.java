/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estrutura_repetiçao;

import java.util.Scanner;

/**
 *
 * @author Root
 */
public class repeticao_ex1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leitor = new Scanner(System.in); 
        int valor;
        int maior = 1;  
        
        do {  
            //Faz a leitura dos números
            System.out.printf("%dN:", maior);
             valor = leitor.nextInt();      
           
          //ve se é Positivo ou negativo
          if(valor > 0){
            System.out.println("Positivo");
           }else{
            System.out.println("Negativo");
           }
          maior++;
        } while ( maior < 11);
        
        
       
            
        
                 
              
    }
    
}
