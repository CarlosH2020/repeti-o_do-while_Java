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
public class repeticao_ex2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leitor = new Scanner(System.in);
        int num = 0;
        int v_num;
        System.out.print("Digite um número:");
        v_num = leitor.nextInt();
        while(num <= v_num){
            System.out.println(num);
            num++;
            
        }
        
    }
    
}
