/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package verificadoridade;

import java.util.Scanner;

/**
 *
 * @author Mavi da Vintch
 */
public class VerificadorIdade {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ano de nascimento: ");
        int nasc = teclado.nextInt();
        int idade = 2024 - nasc;
        if (idade >= 18){
            System.out.println("" + idade + " anos Maior de idade");
        } else{
            System.out.println("" + idade + " anos Menor de idade");
        }
    }
    
}
