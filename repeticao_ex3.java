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
public class repeticao_ex3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leitor = new Scanner(System.in);
        int cont = 1;
        int valor;
        int soma = 0 ,media;
        
        System.out.println("Digite 20 números");
        do {
            System.out.printf("%dN:",cont);
            valor = leitor.nextInt();
            ++cont; 
          soma = soma + valor;
          
        } while (cont <= 20);
         
         System.out.println(soma);
        
        
            
        
    }
    
}
