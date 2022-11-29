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
public class Queue<T> {
    // Campos de la clase
    private Nodo<T> front;
    
    private Nodo<T> rear;
    
    private int size;
    
    /**
     *Constructor de la clase
     */
    public Queue(){
    
        this.front = null;
        
        this.rear = null;
        
        this.size = 0;
    }
    
    /**
     *
     * @return de tipo booleano para saber si la cola esta vacia
     */
    public boolean isEmpty(){
    
        return front == null;
    }
    
    /**
     *
     * @param valor
     * @return de tipo booleano para saber si un elemento se encuentra o no en la cola
     */
    public boolean existe(T valor){
    
        Nodo<T> aux = front;
        
        while(aux != null){
        
            if(aux.getInfo() == valor){
            
                return true;
            }
            aux = aux.getpNext();
        }
        
        return false;
    }
    
    /**
     *Encola el elemento suministrado por el usuario de tipo T
     * @param x
     */
    public void enqueue(T x){
    //this method will enqueue an element provided by the user
        Nodo<T> node = new Nodo<>();
        
        node.setInfo(x);
        
        if(isEmpty()){
        
            front = node;
            
            
        }else{
        Nodo<T> aux = front;
        
        while(aux != rear){
            
            aux = aux.getpNext();
            
            
        }
        
        rear.setpNext(node);
        
    }
        rear = node;
        
        size++;

        
    }
    
    /**
     *Imnprime los elementos de la cola
     */
    public void printQueue(){
    
        if(!isEmpty()){
        
            Nodo<T> temp = front;
            
            while(temp != null){
            
                System.out.print(temp.getInfo() + "->");
                
                temp = temp.getpNext();
            }
            
            System.out.println("null");
       
        }else{System.out.println("Queue is empty.");}
    }
    
    /**
     *
     * @return
     */
    public int queueSize(){
    
        return size;
    }
    
    /**
     *Se desencola el primer elemento en ingresar a la cola
     * @return tipo de dato T 
     */
    public T dequeue(){
    
        if(!isEmpty()){
            
            Nodo<T> aux = front;
        
            front = front.getpNext();
            
            if(front == null){
            
                rear = null;
            }
            size--;
            
            return aux.getInfo();
       
        }else{System.out.println("queue is empty.");}
        
        return null;
    }
    
//    
//    public boolean searchNodo<T>(Object x){
//    
//        //this method will search for an element in the queue
//        
//        Nodo<T> node = new Nodo<T>(x);
//                    
//        boolean found = false;
//
//        if(!isEmpty()){
//        
//            Nodo<T> aux = front;
//            
//            
//            while(aux != null){
//                
//                if(aux.getInfo() == node.getInfo()){
//                
//                    found = true;
//                    
//                    return found;
//                }
//                aux = aux.getpNext();
//            }
//        }       
//        return found;
//
//    }
    
//    public void reverseQueue(){
//    
//        //this method will reverse or invert the queue
//        Queue queue = new Queue();
//            //now thst we've initislized the srray we proceed to fill it with vslues from the queue
//        Object[] array = new Object[size];
//       
//        Nodo<T> aux = front;
//       
//        for(int i = 0; i < size; i++){
//           
//            array[i] = aux.getInfo();
//           
//            aux = aux.getpNext();
//        }
//
//        int index = size;
//        for(int k = 0; k < size; k++){
//            
//            queue.enqueue(array[index - 1]);
//            
//            index--;
//        }
//        System.out.println("");
//       
//        queue.printQueue();
//        }
    
    
//    public void insertarAlPrincipio(Object x){
//  
//        enqueue(x);
//        
//        for(int i = 0; i < size - 1; i++){
//        
//          Object  elem = front.getInfo();
//            
//           dequeue();
//            
//            enqueue(elem);
//        }
//        size++;
//    }
    
//    public void insertarPorPosicion(Object x, int k){
//    
//        //this method will insert a node in the position provided by the user
//        
//        //first we check if the element that the user wants to insert is already on queue
//        
//        if(!searchNodo<T>(x)){
//            
//            enqueue(x);
//            
//            int index = size + k;
//            
//            for(int i = 0; i < index -1; i++){
//            
//                Object elem = front.getInfo();
//                
//                dequeue();
//                
//                enqueue(elem);
//                
//            }
//            
//            size++;
//            
//        }else{System.out.println("The element you are trying to insert is already on queue");}
//    }
//    
//    public void eliminateNthNodo<T>(int x){
//    
//        //this method will eliminate the nth node on the queue 
//        
//        //the user will provide the position of the node they wish to eliminate
//   
//        int index = size - (x + 1);
//        
//        Object element;
//        
//        Nodo<T> aux = front;
//        
//        for(int i = 0; i < index - 1 ; i++){
//            
//            element = aux.getInfo();
//            
//            dequeue();
//            
//            enqueue(element);
//            
//            aux = aux.getpNext();
//                
//        }
//            
//             dequeue();
//             size--;
//             
//            
//    }

    /**
     *
     * @param n
     * @return tipo de dato entero
     */
    
    public int arrayOps(int n){
	int[] array = new int[n];
    for(int j = 1; j <= n; j++){array[j-1] = j;} 
    int counter;
    int prev;
    int mayor = 0;
	for(int i = 1; i < n ; i++ ){
		
		prev = array[i-1];
		counter = array[i]; 

                if(counter > prev){
		mayor = counter;
        }else{mayor = prev;}


	}return mayor;
}
    
   
}

