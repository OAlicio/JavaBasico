
package tiposprimitivos;

import java.util.Scanner;

/**
 *
 * @author Mavi da Vintch
 */
public class TiposPrimitivos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o nome do aluno:");
        String nome = teclado.nextLine();
        System.out.print("Digite a nota do aluno:");
        float nota = teclado.nextFloat();
        System.out.printf("A nota de %s é %.2f \n", nome, nota);
    }
    
}
