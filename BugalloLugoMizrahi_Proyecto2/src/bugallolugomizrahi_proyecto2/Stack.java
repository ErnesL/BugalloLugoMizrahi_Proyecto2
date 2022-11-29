/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bugallolugomizrahi_proyecto2;

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
     *Apila un elemento de tipo T
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
     *Desapila un elemento de tipo T
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
     * 
     * @return tipo de dato T
     */
    public Nodo<T> getpTop() {
        return pTop;
    }
    
}
