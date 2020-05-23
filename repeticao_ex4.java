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
public class repeticao_ex4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leitor = new Scanner(System.in);
        int cont = 1;
        int valor;
        int maior = 0;
        System.out.println("Digite 15 números");
        do {
            System.out.printf("%dN:",cont);
            valor = leitor.nextInt();
            cont++;
            
            if(valor > maior){
                maior = valor;
            }
            
            
        } while (cont <= 15);
        System.out.println("O maior número digitado é:"+maior);
    }
    
}
