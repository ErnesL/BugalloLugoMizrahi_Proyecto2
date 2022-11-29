/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bugallolugomizrahi_proyecto2;

import bugallolugomizrahi_proyecto2.interfaz.interfaz;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import javax.swing.JOptionPane;

/**
 *
 * @author ernes
 */
public class BugalloLugoMizrahi_Proyecto2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
       
        interfaz interfaz = new interfaz();
        interfaz.setLocationRelativeTo(null);
        interfaz.setVisible(true);
 
        ArbolBinario arbol = new ArbolBinario();
String infija= "(3*x^2+2*x*y^2+8*y^3)/(8*x^3+3*x^2*y^2)";
String postfija= XtoPostFija.infijaAPostFija(infija);//Aqui se convierte la operacion a posfija     
JOptionPane.showMessageDialog(null,"La operación infija es: "+infija+
         "\nExpresion en notación postfija: "+postfija);//Aqui se imprime la operacion en posfija

NodoG root = XtoPostFija.insercionArbol(postfija);

PrintStream os = new PrintStream("");
arbol.print(os);

String s = "";
String inorden = arbol.inorden(root, s);
        
System.out.println("Inorden: " + inorden);

String s1 = "";
String preorden = arbol.preorden(root, s1);

System.out.println("Preorden: " + preorden);

String s2 = "";
String postorden = arbol.postorden(root, s2);

System.out.println("Postorden: " + postorden);


//ImprimirArbol.print2DUtil(root, 0);



}
    }
    

