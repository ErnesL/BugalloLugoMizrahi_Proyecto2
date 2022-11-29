/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bugallolugomizrahi_proyecto2;

/**
 *
 * @author ernes
 */
public class BugalloLugoMizrahi_Proyecto2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
 
String infija = "(3*x^2+2*x*y^2+8*y^3)/(8*x^3+3*x^2*y^2)";
String prefija = " /++*3^x2**2x^y2*8^y3+*8^x3**3^x2^y2";

//Aqui se convierte la operacion a posfija   
String postfija= XtoPostFija.infijaAPostFija(infija); 
String postfija2= XtoPostFija.prefijaAPostFija(prefija);

        System.out.println("Infija a Postfija: "+ postfija);
        System.out.println("Prefija a Postfija: "+ postfija2);

    } 
}
