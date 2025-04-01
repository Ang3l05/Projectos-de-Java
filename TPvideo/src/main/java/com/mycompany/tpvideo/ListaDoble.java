/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tpvideo;
import javax.swing.JOptionPane;
/**
 *
 * @author Usuario
 */
public class ListaDoble {
    private NodoDoble inicio,fin;
    public ListaDoble(){
        inicio=fin=null;
    }
    //Metodo para saber que la lista esta vacia
    
    public boolean estVacia(){
        return inicio==null;
    }
    //metodo para agregar nodos al final
    public void Agregarfinal(int el){
        if(!estVacia()){
            fin=new NodoDoble(el,null,fin);
            fin.anterior.siguiente=fin;
        }else{
            inicio=fin=new NodoDoble(el);
        }
    }
    //Metodo para añadir al inicio
    public void AgregarInicio(int el){
        if(!estVacia()){
            inicio=new NodoDoble(el,inicio,null);
            inicio.siguiente.anterior=inicio;
        }else{
            inicio=fin=new NodoDoble(el);
        }
    }
    //Metodo Mostrar en Pantalla de inicio a fin
    public void MostrarListaInicioFin(){
        if(!estVacia()){
            String datos = "<=>";
            NodoDoble auxiliar = inicio;
            while(auxiliar !=null){
                datos = datos + "["+auxiliar.dato+"]<=>";
                auxiliar=auxiliar.siguiente;
            }
            JOptionPane.showMessageDialog(null, datos,
                    "Mostrando Lista de inicio a fin", 
                    JOptionPane.INFORMATION_MESSAGE);
        }
    }
    //Metodo para mostrar la lista de fin a Inicio
    public void MostrarListaFinInicio(){
        if(!estVacia()){
            String datos = "<=>";
            NodoDoble auxiliar = fin;
            while(auxiliar !=null){
                datos = datos + "["+auxiliar.dato+"]<=>";
                auxiliar=auxiliar.anterior;
            }
            JOptionPane.showMessageDialog(null, datos,
                    "Mostrando Lista de inicio a fin", 
                    JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
