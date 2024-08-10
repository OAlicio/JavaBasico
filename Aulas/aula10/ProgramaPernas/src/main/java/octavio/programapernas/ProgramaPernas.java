/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package octavio.programapernas;

import java.util.Scanner;

/**
 *
 * @author Mavi da Vintch
 */
public class ProgramaPernas {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Quantas pernas?");
        int perna = teclado.nextInt();
        String tipo;
        System.out.println("Isso é um(a)");
        switch (perna){
            case 1:
                tipo = "Saci";
                break;
            case 2: 
                tipo = "Bípede";
                break;
            case 3:
                tipo = "Trípede";
                break;
            case 4:
                tipo = "Quadrúpede";
                break;
            case 6:
                tipo = "Aranha";
                break;
            default:
                tipo = "ET";
        }
        System.out.print(tipo);
    }
}
