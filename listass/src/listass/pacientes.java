/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listass;

import javax.swing.JOptionPane;
import java.util.List;
import java.util.ArrayList;

class pacientes 
{
    String nombre;
    int edad;
    String rh;
    String cita;
    
    public pacientes(String nombre, int edad, String rh, String cita)
    {
      this.nombre=nombre;
      this.edad=edad;
      this.rh=rh;
      this.cita=cita;
    }
    
   
    public pacientes()
    {
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getRh() {
        return rh;
    }

    public void setRh(String rh) {
        this.rh = rh;
    }

    public String getCita() {
        return cita;
    }

    public void setCita(String cita) {
        this.cita = cita;
    }

    
    
    public List<pacientes> llenar(List<pacientes> lista)
    {
        int pac;
        JOptionPane.showMessageDialog(null, "PACIENTES DEL HOSPITAL");
        pac=Integer.parseInt(JOptionPane.showInputDialog("DIGITE LA CANTIDAD DE PACIENTES A INGRESAR"));
        for(int i=0;i<pac;i++)
        {
           JOptionPane.showMessageDialog(null, "PACIENTE"+" "+(i+1));
           nombre=JOptionPane.showInputDialog("DIGITE EL NOMBRE DEL PACIENTE");
           edad=Integer.parseInt(JOptionPane.showInputDialog("DIGITE LA EDAD DEL PACIENTE"));
           rh=JOptionPane.showInputDialog("DIGITE EL TIPO DE SANGRE DEL PACIENTE");
           cita=JOptionPane.showInputDialog("DIGITE LA ULTIMA CITA QUE TUVO EL PACIENTE");
           
           lista.add(new pacientes(nombre,edad,rh,cita));
           
        }
        
        return (lista);
    }
    
    public List<pacientes> mostrar(List<pacientes> lista)
    {
        String texto="";
        
        for(int i=0;i<lista.size();i++)
        {
          // pacientes paci=lista.get(i);
          // texto=texto+"PACIENTE"+" "+(i+1)+"\n"+
                // "NOMBRE:"+" "+paci.getNombre()+"\n"+
                // "EDAD:"+" "+paci.getEdad()+"\n"+
                // "TIPO DE SANGRE:"+" "+paci.getRh()+"\n"+
                // "ULTIMA CITA MEDICA:"+" "+paci.getCita()+"\n";
            
          texto=texto+"NOMBRE:"+" "+lista.get(i).getNombre()+"\n"+
                      "EDAD:"+" "+lista.get(i).getEdad()+"\n"+
                      "GRUPO SANGUINEO:"+" "+lista.get(i).getRh()+"\n"+  
                      "ULTIMA CITA REGISTRADA:"+" "+lista.get(i).getCita()+"\n";
                   
        }
        
        JOptionPane.showMessageDialog(null, texto);
        return lista;
    }
    
    public List<pacientes> agendar(List<pacientes> lista)
    {
        JOptionPane.showMessageDialog(null, "CITAS DISPONIBLES DE ACUERDO A LA EDAD DEL PACIENTE"+"\n"
                                             +"EDAD ENTRE 4 A 25 AÑOS"+"\n"+
                                              "EDAD ENTRE 26 A 35 AÑOS"+"\n"+
                                              "EDAD ENTRE 36 A 50 AÑOS"+"\n"+
                                              "EDAD DE 51 AÑOS EN ADELANTE:");
        
        for(int i=0;i<lista.size();i++)
        {
            if(lista.get(i).getEdad()>=4 && lista.get(i).getEdad()<=25)
            {
                JOptionPane.showMessageDialog(null, "EL PACIENTE"+" "+lista.get(i).getNombre()+" "+"PODRA AGENDAR SU CITA DENTRO DE 2 A 3 MESES");
            }
            else
            {
                if(lista.get(i).getEdad()>=26 && lista.get(i).getEdad()<=35)
                {
                   JOptionPane.showMessageDialog(null, "EL PACIENTE"+" "+lista.get(i).getNombre()+" "+"PODRA AGENDAR SU CITA DENTRO DE 4 A 5 MESES"); 
                } 
                else
                {
                    if(lista.get(i).getEdad()>=36 && lista.get(i).getEdad()<=50)
                    {
                        JOptionPane.showMessageDialog(null, "EL PACIENTE"+" "+lista.get(i).getNombre()+" "+"PODRA AGENDAR SU CITA DENTRO DE 6 A 8 MESES");
                    }
                    else
                    {
                        if(lista.get(i).getEdad()>=50)
                        {
                            JOptionPane.showMessageDialog(null, "EL PACIENTE"+" "+lista.get(i).getNombre()+" "+"PODRA AGENDAR SU CITA DENTRO DE 1 A 2 MESES");
                        }
                    }
                }
            }
        }
        
        return lista;
        
        
    }
}


