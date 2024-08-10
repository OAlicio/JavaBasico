/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package linguagemdosistema;

import java.util.Locale;

/**
 *
 * @author Mavi da Vintch
 */
public class LinguagemDoSistema {

    public static void main(String[] args) {
        Locale ling = Locale.getDefault();
        System.out.println("A linguagem de seu sistema por extenso é:");
        System.out.println(ling.getDisplayLanguage());
        System.out.println("E em siglas é:");
        System.out.println(ling.getLanguage());
    }
}
