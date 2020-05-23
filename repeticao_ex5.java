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
public class repeticao_ex5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leitor = new Scanner(System.in);
        int cont = 1;
        double soma = 0;
        float maior = 0;
        float menor = 0;
        double salario;
        float altura;
        String sexo ;
        String quant = "f";
        
        System.out.println("Cadastro de dados funcionários");
        do {
            System.out.printf("%dº - Pessoa\n",cont);
            System.out.print("Altura:");
            altura = leitor.nextFloat();
            System.out.print("Sexo(M/F):");
            sexo = leitor.next();
            System.out.print("Salário:");
            salario = leitor.nextFloat();
            cont++;
            soma = soma+ salario/20;
            if(altura > maior){
                altura = maior;
            }if(altura < menor){
                altura = menor;
            }if(!(quant ==sexo)){
                quant = sexo;
            } 
            
        } while (cont <= 20);
        
        System.out.println("Média salárial:"+soma);
        System.out.println("Maior altura:"+maior 
            +"\nMenor altura:"+ menor);
       System.out.println("quantidade de mulheres com salário até R$1.000,00 :"+quant);
        
        
    }
    
}
