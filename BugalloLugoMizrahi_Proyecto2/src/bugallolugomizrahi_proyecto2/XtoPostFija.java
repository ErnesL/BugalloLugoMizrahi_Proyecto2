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

    public static String infijaAPostFija(String infija) {//se le pasa la operacion infija como argumento
        String postfija = "";
        Stack<Character> pila = new Stack<>();
        for (int i = 0; i < infija.length(); i++) {
            char letra = infija.charAt(i);
            //Si es una variable X || Y se agrega a la salida
            if (Character.isLetter(infija.charAt(i)) || Character.isDigit(infija.charAt(i))) {
                postfija += letra;
            }
            //Si es parentesis izq se agrega a la pila
            if (letra == '(') {
                pila.push(letra);
            }
            if (letra == ')') {//Si es parentesis der 
                //Mientras la pila no sea vacia y el tope no sea parentesis izq hacer
                while (!pila.isEmpty() && pila.getpTop().getInfo() != '(') {
                    postfija += pila.pop();  // Se extrae el elemento de la pila e insertarlo al final de la salida

                }
                // Se elimina el parentesis izq
                pila.pop();
            }
            if (esOperador(letra)) {
                if (pila.isEmpty()) {
                    pila.push(letra);
                } else {
                    int pe = prioridadExp(letra);
                    int pp = prioridadPila(pila.getpTop().getInfo());
                    while (!pila.isEmpty() && pp >= pe) {

                        postfija += pila.pop();
                        pp = prioridadPila(pila.getpTop().getInfo());
                    }
//                
                    pila.push(letra);
                }
            }
        }
        while (!pila.isEmpty()) {

            postfija += pila.pop();

        }
        return postfija;
    }

    public static int prioridadExp(char x) {
        if (x == '^') {
            return 3;
        }
        if (x == '*' || x == '/') {
            return 2;
        }
        if (x == '+' || x == '-') {
            return 1;
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

        return 0;
    }

    public static boolean esOperador(char letra) {
        if (letra == '*' || letra == '/' || letra == '+' || letra == '-' || letra == '^') {
            return true;         //se compara letra con cada uno de los operadores 
        } else {
            return false;
        }
    }
}
