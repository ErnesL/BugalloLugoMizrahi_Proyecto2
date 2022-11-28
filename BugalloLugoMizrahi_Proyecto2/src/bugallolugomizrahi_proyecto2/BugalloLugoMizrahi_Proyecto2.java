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
       
 
String infija= "(3*x^2+2*x*y^2+8*y^3)/(8*x^3+3*x^2*y^2)";
String postfija= XtoPostFija.infijaAPostFija(infija);//Aqui se convierte la operacion a posfija     
JOptionPane.showMessageDialog(null,"La operación infija es: "+infija+
         "\nExpresion en notación postfija: "+postfija);//Aqui se imprime la operacion en posfija
}
    }
    

