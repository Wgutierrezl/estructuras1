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
        List<Integer> lista=new LinkedList<>();
        
        int num1=0;
        int num2=1;
        int num3=0;
        String texto="";
        int fibonacci;
        
        for(int i=0;i<5;i++)
        {
            fibonacci=num1+num2;
            num1=num2;
            num3=fibonacci;
            texto=texto+"("+num1+" "+num2+" "+fibonacci+")";
            
        }
        
        
        JOptionPane.showMessageDialog(null, lista);
       
        JOptionPane.showMessageDialog(null, texto);
    }
    
}
