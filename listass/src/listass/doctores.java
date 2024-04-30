/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listass;

import javax.swing.JOptionPane;
import java.util.List;
import java.util.ArrayList;

class doctores 
{

  public doctores()
  {
      
  }
  
  public List<pacientes> reservas(List<pacientes> lista)
  {
    disponibilidad dis=new disponibilidad();
    int opc=0;
    
        
       for(int i=0;i<lista.size();i++)
       {  
          
       
            
               JOptionPane.showMessageDialog(null, "QUE CITA NECESITA EL PACIENTE"+" "+lista.get(i).getNombre());
               opc=Integer.parseInt(JOptionPane.showInputDialog("CITAS DISPONIBLES PARA LAS SIGUIENTES RAMAS"+"\n"+
                                                                "1.GINECOLOGIA"+"\n"+
                                                                "2.MEDICO GENERAL"+"\n"+
                                                                "3.CIRUGIAS"+"\n"+
                                                                "4.UROLOGIA"+"\n"+
                                                                "5.NUTRICIONISTA"+"\n"+
                                                                "6.DENTISTA"+"\n"+
                                                                "7.NINGUNA DE LAS ANTERIORES"+"\n"));
       
       switch(opc)
       {
           case 1:
           dis.gine(lista,lista.get(i).getNombre());
           break;
           
           case 2:
           dis.mge(lista,lista.get(i).getNombre());
           break;
           
           case 3:
           dis.ciru(lista,lista.get(i).getNombre());
           break;
           
           case 4:
           dis.urolo(lista,lista.get(i).getNombre());
           break;
           
           case 5:
           dis.nutri(lista,lista.get(i).getNombre());
           break;
           
           case 6:
           dis.denti(lista,lista.get(i).getNombre());
           break;
           
           case 7:
           break;    
       } 
        
    }
       
    return lista;
  }
}

