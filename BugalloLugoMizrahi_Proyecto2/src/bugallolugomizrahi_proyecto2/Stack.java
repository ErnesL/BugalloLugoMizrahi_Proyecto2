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
public class Stack<T> {
    
    private Nodo<T> pTop;
    
    int size;
    
    /**
     *
     */
    public Stack(){
        
        this.pTop = null;
    
        this.size = 0;
    }
    
    /**
     *
     * @return
     */
    public boolean isEmpty(){
    
        return this.pTop == null;
    }
    
    /**
     *
     * @param data
     */
    public void push(T data){
        
        Nodo<T> node = new Nodo<>();
        
        node.setInfo(data);
        
       node.setpNext(this.pTop);
       
       this.pTop = node;
       
       size++;
    }
    
    /**
     *Desapila el ultimo elemento en ingresar a la pila
     * @return tipo de dato T
     */
    public T pop(){
    
        if(!isEmpty()){
        Nodo<T> aux = this.pTop;
        this.pTop = this.pTop.getpNext();
        
        size--;
        return aux.getInfo();
    }else{
            System.out.println("Pila vacía");
        }
        return null;
    }
    
    /**
     *Imprime los elementos de la pila
     */
    public void printStack(){
    
        Nodo<T> aux = this.pTop;
        
        while(aux != null){
            
            System.out.println(aux.getInfo());
            
            aux = aux.getpNext();
        }
        
        if(isEmpty()){
        
            System.out.println("Stack Empty");
        }
    }
    
    /**
     */
    public void emptyStack(){
    
        while(this.pTop != null){
        
            this.pTop = this.pTop.getpNext();
            
            //size--;
        }
        System.out.println("Empty");

    }

    public Nodo<T> getpTop() {
        return pTop;
    }
    
}
