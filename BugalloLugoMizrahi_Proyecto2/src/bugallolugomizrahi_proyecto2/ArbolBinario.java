/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bugallolugomizrahi_proyecto2;

import java.io.PrintStream;
import javax.swing.JOptionPane;

/**
 *
 * @author davidmizrahi
 */
public class ArbolBinario<T> {
    
    private NodoG root;
    
    public ArbolBinario(){
    
        this.root = null;
    }

    public NodoG getRoot() {
        return root;
    }

    public void setRoot(NodoG root) {
        this.root = root;
    }
    
    public boolean isEmpty(){
    
        return this.root == null;
    }
    public void insertar(NodoG padre, T data){
//        int nodosHijos = 0;
       if(padre == null){
           this.root = new NodoG(data);
           return;
       }
       
       Queue<NodoG> q = new Queue<>();
       
       q.enqueue(padre);
       
       while(!q.isEmpty()){
           NodoG temp = q.dequeue();
           
           if(temp.getHijoIzquierdo() == null){
               temp.setHijoIzquierdo(new NodoG(data));
               break;
           }else{
               q.enqueue(temp.getHijoIzquierdo());
           }
           
           if(temp.getHijoDerecho() == null){
               temp.setHijoDerecho(new NodoG(data));
               break;
           }else{
               q.enqueue(temp.getHijoDerecho());
           }
       }
       
       
    }
//     public synchronized void recorridoPreorden()
//    {
//        imprimirPreorden(this.root, String s);
//    }
    public String inorden(NodoG root, String s){
        if(root != null){
           s = inorden(root.getHijoIzquierdo(), s);
            s+= root.getInfo();
            s = inorden(root.getHijoDerecho(), s);
        }
        return s;
    }
    
    public String preorden(NodoG root, String s){
        if(root != null){
            s+= root.getInfo();
            s = inorden(root.getHijoIzquierdo(), s);
            s = inorden(root.getHijoDerecho(), s);
        }
        return s;
    }
    
    public String postorden(NodoG root, String s){
        if(root!= null){
            s = postorden(root.getHijoIzquierdo(), s);
            s = postorden(root.getHijoDerecho(), s);
            s+= root.getInfo();
        }
        return s;
    }
     public void preorden2(NodoG N){
      NodoG temp;
        if (N!=null){
            System.out.print(N.getInfo()+" ");
            temp=N.getHijoIzquierdo();
            while (temp !=null){
                preorden2(temp);
                temp=temp.getHijoDerecho();
            }
        }
    }
    
    public String imprimirPreorden(NodoG padre, String s){
    
        NodoG temp;
//        String s = " ";
        if(padre!=null){
            System.out.print(padre.getInfo()+",");

            s = s + padre.getInfo().toString();
//            temp=padre.getHijoIzquierdo();

            s =  imprimirPreorden(padre.getHijoIzquierdo(), s);
             s = imprimirPreorden(padre.getHijoDerecho(), s);
             //System.out.println(padre.getHijoIzquierdo().getInfo());
             
        }
        return s;

    
            }
    
    
    public void traverseNodes(StringBuilder sb, String padding, String pointer, NodoG node, boolean hasRightSibling) {
    if (node != null) {
        sb.append("\n");
        sb.append(padding);
        sb.append(pointer);
        sb.append(node.getInfo());

        StringBuilder paddingBuilder = new StringBuilder(padding);
        if (hasRightSibling) {
            paddingBuilder.append("│  ");
        } else {
            paddingBuilder.append("   ");
        }

        String paddingForBoth = paddingBuilder.toString();
        String pointerRight = "└──";
        String pointerLeft = (node.getHijoDerecho() != null) ? "├──" : "└──";

        traverseNodes(sb, paddingForBoth, pointerLeft, node.getHijoIzquierdo(), node.getHijoDerecho() != null);
        traverseNodes(sb, paddingForBoth, pointerRight, node.getHijoDerecho(), false);
    }
}
    
    
    public String traversePreOrder(NodoG root) {

    if (root == null) {
        return "";
    }

    StringBuilder sb = new StringBuilder();
    sb.append(root.getInfo());

    String pointerRight = "└──";
    String pointerLeft = (root.getHijoDerecho() != null) ? "├──" : "└──";

    traverseNodes(sb, "", pointerLeft, root.getHijoIzquierdo(), root.getHijoDerecho() != null);
    traverseNodes(sb, "", pointerRight, root.getHijoDerecho(), false);

    return sb.toString();
}
    
    public void print(PrintStream os) {
    os.print(traversePreOrder(this.root));
}

    }
        
    
    

