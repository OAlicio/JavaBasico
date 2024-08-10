/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package octavio.resolucaotela;

import java.awt.Dimension;
import java.awt.Toolkit;

/**
 *
 * @author Mavi da Vintch
 */
public class ResolucaoTela {

    public static void main(String[] args) {
        Toolkit tela = Toolkit.getDefaultToolkit();
        Dimension a = tela.getScreenSize();
        System.out.println("A resolução da tela é: " + a.width + " X " + a.height);
    }
}
