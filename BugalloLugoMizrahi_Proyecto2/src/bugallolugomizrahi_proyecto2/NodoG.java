/**
 * Christian Guillén Drija.
 * Estructuras de datos.
 * Una implementación de árboles generales.
 *
 */

package bugallolugomizrahi_proyecto2;


public class NodoG<T> {
    private T info;
    public NodoG hijoIzquierdo; 
    public NodoG hijoDerecho; 

    public NodoG(T data) {
        this.info = data;
        this.hijoIzquierdo = null;
        this.hijoDerecho = null;
    }
 
    public T getInfo() {
        return info;
    }

    public void setInfo(T info) {
        this.info = info;
    }

    public NodoG getHijoIzquierdo() {
        return hijoIzquierdo;
    }

    public void setHijoIzquierdo(NodoG hijoIzquierdo) {
        this.hijoIzquierdo = hijoIzquierdo;
    }

    public NodoG getHijoDerecho() {
        return hijoDerecho;
    }

    public void setHijoDerecho(NodoG hijoDerecho) {
        this.hijoDerecho = hijoDerecho;
    }

    public boolean es_hoja (){
        return this.getHijoIzquierdo() == null;
    }
    
}
