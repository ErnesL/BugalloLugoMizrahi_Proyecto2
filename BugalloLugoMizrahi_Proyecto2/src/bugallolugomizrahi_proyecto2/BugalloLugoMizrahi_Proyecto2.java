/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bugallolugomizrahi_proyecto2;

import javax.swing.JOptionPane;

/**
 *
 * @author ernes
 */
public class BugalloLugoMizrahi_Proyecto2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
 
String infija= "(a+b)*c";
String postfija= XtoPostFija.infijaApostfija(infija);//Aqui se convierte la operacion a posfija

JOptionPane.showMessageDialog(null,"La operación infija es: "+infija+
         "\nExpresion en notación postfija: "+postfija);//Aqui se imprime la operacion en posfija
}
    }
    

