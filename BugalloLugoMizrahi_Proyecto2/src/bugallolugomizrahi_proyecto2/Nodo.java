/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bugallolugomizrahi_proyecto2;

/**
 *
 * @author davidmizrahi
 * @param <T>
 */
public class Nodo<T> {
    //Campos de la clase
    private T info;
    
    private Nodo pNext;
    
//    public Nodo(Object arista){
//    
//        this.info = arista;
//        
//        this.pNext = null;
//    }

    /**
     *
     * @return info de tipo T
     */
    
    public T getInfo(){
    
        return info;
    }
    
    /**
     *
     * @param info
     */
    public void setInfo(T info){
    
        this.info = info;
    }
    
    /**
     *
     * @return Apuntador al siguiente nodo de tipo Nodo
     */
    public Nodo getpNext(){
    
        return pNext;
    }
    
    /**
     *
     * @param pNext
     */
    public void setpNext(Nodo pNext){
    
        this.pNext = pNext;
    }
}
