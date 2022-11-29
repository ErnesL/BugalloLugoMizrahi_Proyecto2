/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bugallolugomizrahi_proyecto2;

/**
 *
 * @author davidmizrahi
 */
public class ImprimirArbol {
    static final int COUNT = 5;
//        this.root = new NodoG();
    



     public static String print2DUtil(NodoG root, int space, String s)
    {
       
        // Base case
        if (root == null)
            return s;
 
        // Increase distance between levels
        space += COUNT;
 
        // Process right child first
       s = print2DUtil(root.getHijoDerecho(), space, s);
 
        // Print current node after space
        // count
        s+= "\n";
        for (int i = COUNT; i < space; i++)
            s+= " ";
        s+= root.getInfo() + "\n";
 
        // Process left child
      s =  print2DUtil(root.getHijoIzquierdo(), space, s);
        return s;
    }
    
}
