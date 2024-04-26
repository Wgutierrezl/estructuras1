/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio;

import java.util.LinkedList;
import java.util.List;
import javax.swing.JOptionPane;


public class Ejercicio {


    public static void main(String[] args) 
    {
        List<String> lista=new LinkedList<>();
        
        for(int i=0;i<3;i++)
        {
            lista.add("DIGITE UN NOMBRE");
        }
       
        JOptionPane.showMessageDialog(null, lista);
    }
    
}
