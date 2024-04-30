/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listass;

import javax.swing.JOptionPane;
import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;
public class Listass {


    public static void main(String[] args) 
    {
        JOptionPane.showMessageDialog(null, "BIENVENIDOS AL HOSPITAL PABLO TOBON URIBE");
        String nombre="";
        int edad=0;
        String grupo="",cita="";
        List<pacientes> lista=new LinkedList<>();
        pacientes pa=new pacientes(nombre, edad, grupo, cita);
        pa.llenar(lista);
        pa.mostrar(lista);
        pa.agendar(lista);
        doctores doc=new doctores();
        doc.reservas(lista);
        
    }
    
}
