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
// Metodo de infija a postifja
    /**
     * Metodo para pasar un string dado en notacion infija a postfija.
     * @param infija
     * @return String
     */
    public static String infijaAPostFija(String infija) {
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
//se le asginan los valores de prioridad a los operadores a ser apilados
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
//se le asginan los valores de prioridad a los operadores que ya se encuentran en la pila
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
     public static NodoG insercionArbol(String posfijo){
        
        Stack<NodoG> stack = new Stack<>();
        NodoG root = null;
        
        char[] caracteres = posfijo.toCharArray();
        
        for(char c : caracteres){
            if(Character.isLetter(c) || Character.isDigit(c)){
                stack.push(new NodoG(c));
                
            }else{
                
                ArbolBinario arbol = new ArbolBinario();
                
                arbol.setRoot(new NodoG(c));
                root = arbol.getRoot();
                root.setHijoDerecho(stack.pop());
                root.setHijoIzquierdo(stack.pop());
                
                stack.push(root);
                
            }
        }
        return root;
        
        
    }

    public static boolean esOperador(char letra) {
        if (letra == '*' || letra == '/' || letra == '+' || letra == '-' || letra == '^') {
            return true;         //se compara letra con cada uno de los operadores 
        } else {
            return false;
        }
    }
    
// Metodo de prefija a postifja
    /**
     * Metodo para pasar un string dado en notacion prefija a postfija.
     * @param prefija
     * @return String
     */
    public static String prefijaAPostFija(String prefija) {//se le pasa la operacion prefija como argumento
        String postfija = "";
        Stack<String> pila = new Stack<>();
        //se recorre la prefija al reves
        for (int i = (prefija.length()- 1); i >= 0; i--) {
            char letra = prefija.charAt(i);
            //si es operador hacer
            if (esOperador(letra)) {
                //se desapilan dos operandos y se concatenan con el operador en el string "temporal" para luego ser apilado
                String temporal = new String();
                temporal += pila.pop();
                temporal += pila.pop();
                temporal += letra;
                
                pila.push(temporal);
            }
            //si es operando hacer
            if (Character.isLetter(prefija.charAt(i)) || Character.isDigit(prefija.charAt(i))) {
                // se pasa el operando al string "temporal2" y se apila
                String temporal2 = new String();
                temporal2 += letra;
                pila.push(temporal2);
            }
        }
        // se concatena con el string vacio "postfija" el string contenido en el tope de la pila (es decir el resultado de la conversión)
        postfija += pila.pop();
        return postfija;

    }
}
