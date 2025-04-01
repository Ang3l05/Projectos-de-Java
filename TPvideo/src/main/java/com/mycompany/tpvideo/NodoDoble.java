/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tpvideo;

/**
 *
 * @author Usuario
 */
public class NodoDoble {
    public int dato;
    NodoDoble siguiente, anterior;
    
    //constructor para cuando aun no existen nodos
    public NodoDoble(int el){
        this(el,null,null);
    }
    
    //Constructor para cuando existen nodos
    public NodoDoble(int el, NodoDoble s, NodoDoble a){
        this.dato = el;
        this.anterior = a;
        this.siguiente = s;
   }
}
