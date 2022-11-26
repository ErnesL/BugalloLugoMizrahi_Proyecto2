/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bugallolugomizrahi_proyecto2;

/**
 *
 * @author juand
 */
public class XtoPostFija {

    public static String infijaApostfija(String infija) {//se le pasa la operacion infija como argumento
        String postfija = "";
        Pila pila = new Pila(30);

        for (int i = 0; i < infija.length(); i++) {

            char letra = infija.charAt(i);
            if (esOperador(letra)) {
                if (letra == ')') {

                    while (pila.getTope() != '(') {
                        postfija += pila.pop();
                    }
                    if (pila.getTope() == '(') {
                        pila.pop();
                    }
                }
                if (pila.esVacio()) {
                    if (letra != ')') {
                        pila.push(letra);
                    }
                } else {
                    if (letra != ')') {
                        int pe = prioridadExp(letra);
                        int pp = prioridadPila((char) pila.getTope());
                        if (pe > pp) {
                            pila.push(letra);
                        } else {

                            postfija += pila.pop();

                            pila.push(letra);
                        }
                    }
                }
            } else {
                postfija += letra;
            }
        }
        while (!pila.esVacio()) {
            postfija += pila.pop();
        }
        return postfija;
    }

    public static int prioridadExp(char x) {
        if (x == '^') {
            return 4;
        }
        if (x == '*' || x == '/') {
            return 2;
        }
        if (x == '+' || x == '-') {
            return 1;
        }
        if (x == '(') {
            return 5;
        }
        if (x == ')') {
            return 5;
        }
        return 0;
    }

    public static int prioridadPila(char x) {
        if (x == '^') {
            return 3;
        }
        if (x == '*' || x == '/') {
            return 2;
        }
        if (x == '+' || x == '-') {
            return 1;
        }
        if (x == '(') {
            return 0;
        }
        if (x == ')') {
            return 0;
        }
        return 0;
    }

    public static boolean esOperador(char letra) {
        if (letra == '*' || letra == '/' || letra == '+' || letra == '-' || letra == '^' || letra == '(' || letra == ')') {
            return true;         //se compara letra con cada uno de los operadores 
        } else {
            return false;
        }
    }

}
