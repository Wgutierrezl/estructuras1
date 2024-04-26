/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciopersonas;

import javax.swing.JOptionPane;
import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;
public class Ejerciciopersonas 
{

  
    public static void main(String[] args) 
    {
        List<personal> lista=new LinkedList<personal>();
        String nombre = null;
        int edad = 0;
        String cedula = null;
        int salario = 0;
        
        personal pe=new personal(nombre,edad,cedula,salario);
        pe.llenar(lista);
        pe.mostrar(lista);
        
        modificarele mo=new modificarele();
        mo.cambiar(lista);
        
        pe.mostrar(lista);
        
      
    }
    
}

