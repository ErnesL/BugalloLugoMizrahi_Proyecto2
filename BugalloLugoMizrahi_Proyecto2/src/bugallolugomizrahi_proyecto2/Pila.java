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
public class Pila {

    private char pila[];
    private char dato;
    private int tope = -1;
    private int max = 0;
    private boolean res;

    Pila(int max) {//el constructor pide el tamaño de la pila
        this.max = max;
        pila = new char[max];//se crea un arreglo del tamano pasado ateriormente
        dato = 0;
    }

    public void borrarpila() {//metodo para borrar toda la pila
        tope = -1;//mandamos el tope al principio, esto indica que la pila esta vacia
    }

    public boolean llena() {//Método para cuando la pila esta llena
        if (tope == (max - 1)) {
            res = true;
        } else {
            res = false;
        }
        return res;
    }

    public boolean esVacio() {//Método para cuando la pila es vacia
        if (tope == -1) {
            res = true;
        } else {
            res = false;
        }
        return res;
    }
//Los métodos push y pop te permiten simular una pila de objetos LIFO (último en entrar, primero en salir).

    public boolean push(char dato) {//Metodo por si la pia esta llena
        if (llena()) {
            System.err.print("Error: Pila llena");//Si la pila esta llena nos manda un error 
        } else {//Si la pila esta vacia continua con el progama
            tope++;
            pila[tope] = dato;
            res = true;
        }
        return res;
    }

    public char pop() {
        if (esVacio()) {
            System.err.print("Sub-Desbordamiento: Pila vacia");
        } else {
            dato = pila[tope];
            tope--;
        }
        return dato;
    }

    public char getTope() {//Retorna un valor
        char top = 0;
        if (esVacio()) {
        } else {
            top = pila[tope];
        }
        return top;
    }

}
