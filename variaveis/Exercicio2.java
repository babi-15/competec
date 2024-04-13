/*
1. Crie uma variável que armazena o valor de uma laranja;
2. Crie uma variável que informa o valor de uma uva;
3. Some o valor da laranja com a uva;
*/

import java.util.Scanner;


public class Exercicio2 {
    public static void main(String[] args) {
      
        Scanner sc = new Scanner(System.in);

        double laranja = sc.nextDouble();
        double uva = sc.nextDouble();
     
        double precototal = laranja + uva;

     
    
        System.out.print("PREÇO TOTAL= " +precototal);
        System.out.println("preço total= " +precototal);

       // Recebam duas idades, faça uma soma e imprima no terminal
        int idade = sc.nextInt();
        int idade2 = sc.nextInt(); 

        int totalidade = idade + idade2;
        System.out.println("Soma de idades= " +totalidade);




        
        
    }
}