/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciorepita;

import javax.swing.JOptionPane;

/**
 *
 * @author Mavi da Vintch
 */
public class ExercicioRepita {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n;
        int s = 0;
        int totV = 0;
        int totP = 0;
        int totI = 0;
        int aC = 0;
        int m;
        do {
            n = Integer.parseInt(JOptionPane.showInputDialog(null, 
                    "<html>Informe um numero: <br><em>(Valor 0 interromope)</em></html>"));
            if (n % 2 == 0 && n != 0){
                totP ++;
            } else if (n != 0) {
                totI ++;
            }
            if (n > 100){
                aC ++;
            }
            if (n != 0){
               totV ++; 
            }
            s += n;
        } while ( n != 0);
        m = s / totV;
        JOptionPane.showMessageDialog(null, "<html>Resultado Final <hr>" + "<br>Total de valores: " + totV + "<br> Total de Pares: " + totP + "<br> Total de Ímpares: " + totI + "<br> Acima de 100: " + aC + "<br> Média dos valores: " + m + "</html>");
    }
    
}
