/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listass;

import javax.swing.JOptionPane;
import java.util.List;
import java.util.ArrayList;

class disponibilidad 
{
    
    
    public disponibilidad()
    {
        
    }
    
   public void gine(List<pacientes> lista, String nom)
  {
      JOptionPane.showMessageDialog(null, "PARA CITA DE GINECOLOGIA TENEMOS DISPONIBLE A LO DOCTORES:"+"\n"+
                                          "1. RAUL SANTANA DE CHEMISQUIRA"+"\n"+
                                          "2. MICHEL BROWN DE JESUS PEREZ"+"\n");
      
      int docto=0,docto2=0;
      
         
             docto=Integer.parseInt(JOptionPane.showInputDialog("CUAL DE ESTOS DOCTORES DESEA ELEGIR PARA SU CITA MEDICA:"+"\n"+
                                                                 "1. RAUL SANTANA DE CHEMISQUIRA"+"\n"+
                                                                 "2. MICHEL BROWN DE JESUS PEREZ"+"\n"));
             switch(docto)
             {
                 case 1:
                 JOptionPane.showMessageDialog(null, "EL MEDICO GINECOLOGO RAUL SANTANA TIENE DISPONIBLE LAS SIGUIENTES FECHAS:"+"\n"+
                                                      "1. 15 DE AGOSTO 2024 4.00PM SEDE VALLE VIEJO"+"\n"+
                                                      "2. 30 DE NOVIEMBRE 2024 8.00AM SEDE EPS"+"\n");
                 
                 docto2=Integer.parseInt(JOptionPane.showInputDialog("¿CUAL DE LAS FECHAS ANTERIORES ELIGE:"+"\n"+
                                                                     "1. 15 DE AGOSTO 2024 4.00PM SEDE VALLE VIEJO"+"\n"+
                                                                     "2. 30 DE NOVIEMBRE 2024 8.00AM SEDE EPS"+"\n"));
                 switch(docto2)
                 {
                     case 1:
                     JOptionPane.showMessageDialog(null, "PARA EL PACIENTE"+" "+nom+" "+"QUEDA AGENDADA PARA EL DIA 15 DE AGOSTO 2024 4.00PM SEDE VALLE VIEJO");
                     break;
                     
                     case 2:
                     JOptionPane.showMessageDialog(null, "PARA EL PACIENTE"+" "+nom+" "+"QUEDA AGENDADA PARA EL DIA 30 DE NOVIEMBRE DE 2024 8.00AM EPS");   
                     break;
                 } 
                 break;
                 
                 case 2:
                 JOptionPane.showMessageDialog(null, "EL MEDICO GINECOLOGO MICHEL BROWN DE JESUS PEREZ TIENE DISPONIBLE LAS SIGUIENTES FECHAS:"+"\n"+
                                                      "1. 2 DE FEBRERO 2024 4.00PM SEDE VALLE VIEJO"+"\n"+
                                                      "2. 4 DE ABRIL 2024 8.00AM SEDE EPS"+"\n"); 
                 
                 docto2=Integer.parseInt(JOptionPane.showInputDialog("¿CUAL DE LAS FECHAS ANTERIORES ELIGE:"+"\n"+
                                                      "1. 2 DE FEBRERO 2024 4.00PM SEDE VALLE VIEJO"+"\n"+
                                                      "2. 4 DE ABRIL 2024 8.00AM SEDE EPS"+"\n"));
                 
                 switch(docto2)
                 {
                     case 1:
                     JOptionPane.showMessageDialog(null, "PARA EL PACIENTE"+" "+nom+" "+"QUEDA AGENDADA PARA EL DIA 2 DE FEBRERO DE 2024 4.00PM SEDE VALLE VIEJO");
                     break;
                     
                     case 2:
                     JOptionPane.showMessageDialog(null, "PARA EL PACIENTE"+" "+nom+" "+"QUEDA AGENDADA PARA EL DIA 4 DE ABRIL DE 2024 8.00AM EPS");   
                     break;
                 } 
                 break;
                 
             }
         }
         
   
  public void mge(List<pacientes> lista, String nom)
  {
      JOptionPane.showMessageDialog(null, "PARA CITA DE MEDICO GENERAL TENEMOS DISPONIBLE A LO DOCTORES:"+"\n"+
                                          "1. JUAN BAPTISTA LOPERA"+"\n"+
                                          "2. GUILLERMO DEL TORO"+"\n");
      
      int docto=0,docto2=0;
      
     
             docto=Integer.parseInt(JOptionPane.showInputDialog("CUAL DE ESTOS DOCTORES DESEA ELEGIR PARA SU CITA MEDICA:"+"\n"+
                                                                 "1. JUAN BAPTISTA LOPERA"+"\n"+
                                                                 "2. GUILLERMO DEL TORO"+"\n"));
             switch(docto)
             {
                 case 1:
                 JOptionPane.showMessageDialog(null, "EL MEDICO GENERAL JUAN BAPTISTA LOPERA TIENE DISPONIBLE LAS SIGUIENTES FECHAS:"+"\n"+
                                                      "1. 15 DE JULIO DE AGOSTO 2024 4.00PM SEDE VALLE VIEJO"+"\n"+
                                                      "2. 30 MAYO 2024 8.00AM SEDE EPS"+"\n");
                 
                 docto2=Integer.parseInt(JOptionPane.showInputDialog("¿CUAL DE LAS FECHAS ANTERIORES ELIGE:"+"\n"+
                                                                     "1. 15 DE JULIO DE AGOSTO 2024 4.00PM SEDE VALLE VIEJO"+"\n"+
                                                                     "2. 30 MAYO 2024 8.00AM SEDE EPS"+"\n"));
                 switch(docto2)
                 {
                     case 1:
                     JOptionPane.showMessageDialog(null, "PARA EL PACIENTE"+" "+nom+" "+"QUEDA AGENDADA PARA EL DIA 15 DE JULIO 2024 4.00PM SEDE VALLE VIEJO");
                     break;
                     
                     case 2:
                     JOptionPane.showMessageDialog(null, "PARA EL PACIENTE"+" "+nom+" "+"QUEDA AGENDADA PARA EL DIA 30 DE MAYO DE 2024 8.00AM EPS");   
                     break;
                 } 
                 break;
                 
                 case 2:
                 JOptionPane.showMessageDialog(null, "EL MEDICO GENERAL GUILLERMO DEL TORO TIENE DISPONIBLE LAS SIGUIENTES FECHAS:"+"\n"+
                                                      "1. 5 DE OCTUBRE 2024 4.00PM SEDE VALLE VIEJO"+"\n"+
                                                      "2. 24 DE DICIEMBRE 2024 8.00AM SEDE EPS"+"\n"); 
                 
                 docto2=Integer.parseInt(JOptionPane.showInputDialog("¿CUAL DE LAS FECHAS ANTERIORES ELIGE:"+"\n"+
                                                      "1. 5 DE OCTUBRE 2024 4.00PM SEDE VALLE VIEJO"+"\n"+
                                                      "2. 24 DE DICIEMBRE 2024 8.00AM SEDE EPS"+"\n")); 
                 
                 switch(docto2)
                 {
                     case 1:
                     JOptionPane.showMessageDialog(null, "PARA EL PACIENTE"+" "+nom+" "+"QUEDA AGENDADA PARA EL DIA 5 DE OCTUBRE DE 2024 4.00PM SEDE VALLE VIEJO");
                     break;
                     
                     case 2:
                     JOptionPane.showMessageDialog(null, "PARA EL PACIENTE"+" "+nom+" "+"QUEDA AGENDADA PARA EL DIA 24 DE DICIEMBRE DE 2024 8.00AM EPS");   
                     break;
                 } 
                 break;
                 
             }
  }
  
    public void ciru(List<pacientes> lista,String nom)
  {
      JOptionPane.showMessageDialog(null, "PARA CITA DE CIRUGIA TENEMOS DISPONIBLE A LO DOCTORES:"+"\n"+
                                          "1. CILLIAN MURPHY"+"\n"+
                                          "2. RYAN REYNOLDS"+"\n");
      int docto=0,docto2=0;
      
             docto=Integer.parseInt(JOptionPane.showInputDialog("CUAL DE ESTOS DOCTORES DESEA ELEGIR PARA SU CITA MEDICA:"+"\n"+
                                          "1. CILLIAN MURPHY"+"\n"+
                                          "2. RYAN REYNOLDS"+"\n"));
             switch(docto)
             {
                 case 1:
                 JOptionPane.showMessageDialog(null, "EL MEDICO CIRUJANO CILLIAN MURPHY TIENE DISPONIBLE LAS SIGUIENTES FECHAS:"+"\n"+
                                                      "1. 28 DE FEBRERO 2024 4.00PM SEDE VALLE VIEJO"+"\n"+
                                                      "2. 30 DE ABRIL 2024 8.00AM SEDE EPS"+"\n");
                 
                 docto2=Integer.parseInt(JOptionPane.showInputDialog("¿CUAL DE LAS FECHAS ANTERIORES ELIGE:"+"\n"+
                                                      "1. 28 DE FEBRERO 2024 4.00PM SEDE VALLE VIEJO"+"\n"+
                                                      "2. 30 DE ABRIL 2024 8.00AM SEDE EPS"+"\n"));
                 switch(docto2)
                 {
                     case 1:
                     JOptionPane.showMessageDialog(null, "PARA EL PACIENTE"+" "+nom+" "+"QUEDA AGENDADA PARA EL DIA 28 DE FEBRERO DE 2024 4.00PM SEDE VALLE VIEJO");
                     break;
                     
                     case 2:
                     JOptionPane.showMessageDialog(null, "PARA EL PACIENTE"+" "+nom+" "+"QUEDA AGENDADA PARA EL DIA 30 DE ABRIL DE 2024 8.00AM EPS");   
                     break;
                 } 
                 break;
                 
                 case 2:
                 JOptionPane.showMessageDialog(null, "EL MEDICO CIRUJANO RYAN REYNOLDS TIENE DISPONIBLE LAS SIGUIENTES FECHAS:"+"\n"+
                                                      "1. 30 DE FEBRERO 2024 4.00PM SEDE VALLE VIEJO"+"\n"+
                                                      "2. 15 DE ABRIL 2024 8.00AM SEDE EPS"+"\n"); 
                 
                 docto2=Integer.parseInt(JOptionPane.showInputDialog("¿CUAL DE LAS FECHAS ANTERIORES ELIGE:"+"\n"+
                                                      "1. 30 DE FEBRERO 2024 4.00PM SEDE VALLE VIEJO"+"\n"+
                                                      "2. 15 DE ABRIL 2024 8.00AM SEDE EPS"+"\n"));
                 
                 switch(docto2)
                 {
                     case 1:
                     JOptionPane.showMessageDialog(null, "PARA EL PACIENTE"+" "+nom+" "+"QUEDA AGENDADA PARA EL DIA 30 DE FEBRERO DE 2024 4.00PM SEDE VALLE VIEJO");
                     break;
                     
                     case 2:
                     JOptionPane.showMessageDialog(null, "PARA EL PACIENTE"+" "+nom+" "+"QUEDA AGENDADA PARA EL DIA 15 DE ABRIL DE 2024 8.00AM EPS");   
                     break;
                 } 
                 break;
                 
             }
  }
  
  public void urolo(List<pacientes> lista, String nom)
  {
     JOptionPane.showMessageDialog(null, "PARA CITA DE UROLOGIA TENEMOS DISPONIBLE A LO DOCTORES:"+"\n"+
                                          "1. RAUL SANTANA DE CHEMISQUIRA"+"\n"+
                                          "2. MICHEL BROWN DE JESUS PEREZ"+"\n"); 
     int docto=0,docto2=0;
      
             docto=Integer.parseInt(JOptionPane.showInputDialog("CUAL DE ESTOS DOCTORES DESEA ELEGIR PARA SU CITA MEDICA:"+"\n"+
                                                                "1. RAUL SANTANA DE CHEMISQUIRA"+"\n"+
                                                                "2. MICHEL BROWN DE JESUS PEREZ"+"\n")); 
             switch(docto)
             {
                 case 1:
                 JOptionPane.showMessageDialog(null, "EL UROLOGO RAUL SANTANA TIENE DISPONIBLE LAS SIGUIENTES FECHAS:"+"\n"+
                                                      "1. 15 DE MAYO DE FEBRERO 2024 4.00PM SEDE VALLE VIEJO"+"\n"+
                                                      "2. 30 DE SEPTIEMBRE 2024 8.00AM SEDE EPS"+"\n");
                 
                 docto2=Integer.parseInt(JOptionPane.showInputDialog("¿CUAL DE LAS FECHAS ANTERIORES ELIGE:"+"\n"+
                                                                       "1. 15 DE MAYO DE FEBRERO 2024 4.00PM SEDE VALLE VIEJO"+"\n"+
                                                                       "2. 30 DE SEPTIEMBRE 2024 8.00AM SEDE EPS"+"\n"));
                 switch(docto2)
                 {
                     case 1:
                     JOptionPane.showMessageDialog(null, "PARA EL PACIENTE"+" "+nom+" "+"QUEDA AGENDADA PARA EL DIA 15 DE MAYO DE 2024 4.00PM SEDE VALLE VIEJO");
                     break;
                     
                     case 2:
                     JOptionPane.showMessageDialog(null, "PARA EL PACIENTE"+" "+nom+" "+"QUEDA AGENDADA PARA EL DIA 30 DE SEPTIEMBRE DE 2024 8.00AM EPS");   
                     break;
                 } 
                 break;
                 
                 case 2:
                 JOptionPane.showMessageDialog(null, "EL UROLOGO MICHEL BREOMN TIENE DISPONIBLE LAS SIGUIENTES FECHAS:"+"\n"+
                                                      "1. 30 DE FEBRERO 2024 4.00PM SEDE VALLE VIEJO"+"\n"+
                                                      "2. 12 DE JULIO 2024 8.00AM SEDE EPS"+"\n"); 
                 
                 docto2=Integer.parseInt(JOptionPane.showInputDialog("¿CUAL DE LAS FECHAS ANTERIORES ELIGE:"+"\n"+
                                                                     "1. 30 DE FEBRERO 2024 4.00PM SEDE VALLE VIEJO"+"\n"+
                                                                     "2. 12 DE JULIO 2024 8.00AM SEDE EPS"+"\n")); 
                 
                 switch(docto2)
                 {
                     case 1:
                     JOptionPane.showMessageDialog(null, "PARA EL PACIENTE"+" "+nom+" "+"QUEDA AGENDADA PARA EL DIA 30 DE FEBRERO DE 2024 4.00PM SEDE VALLE VIEJO");
                     break;
                     
                     case 2:
                     JOptionPane.showMessageDialog(null, "PARA EL PACIENTE"+" "+nom+" "+"QUEDA AGENDADA PARA EL DIA 12 DE JULIO DE 2024 8.00AM EPS");   
                     break;
                 } 
                 break;
                 
             }
  }

    public void nutri(List<pacientes> lista,String nom)
  {
      JOptionPane.showMessageDialog(null, "PARA CITA DE NUTRICIONISTA TENEMOS DISPONIBLE A LO DOCTORES:"+"\n"+
                                          "1. JULIANA VEGA"+"\n"+
                                          "2. JESSICA CEDIEL"+"\n");
      
      int docto=0,docto2=0;
      

             docto=Integer.parseInt(JOptionPane.showInputDialog("CUAL DE ESTOS DOCTORES DESEA ELEGIR PARA SU CITA MEDICA:"+"\n"+
                                                                "1. JULIANA VEGA"+"\n"+
                                                                "2. JESSICA CEDIEL"+"\n"));
             switch(docto)
             {
                 case 1:
                 JOptionPane.showMessageDialog(null, "LA NUTRICIONISTA JULIANA VEGA TIENE DISPONIBLE LAS SIGUIENTES FECHAS:"+"\n"+
                                                      "1. 30 DE FEBRERO 2024 4.00PM SEDE VALLE VIEJO"+"\n"+
                                                      "2. 5 DE ABRIL 2024 8.00AM SEDE EPS"+"\n");
                 
                 docto2=Integer.parseInt(JOptionPane.showInputDialog("¿CUAL DE LAS FECHAS ANTERIORES ELIGE:"+"\n"+
                                                      "1. 30 DE FEBRERO 2024 4.00PM SEDE VALLE VIEJO"+"\n"+
                                                      "2. 5 DE ABRIL 2024 8.00AM SEDE EPS"+"\n"));
                 switch(docto2)
                 {
                     case 1:
                     JOptionPane.showMessageDialog(null, "PARA EL PACIENTE"+" "+nom+" "+"QUEDA AGENDADA PARA EL DIA 30 DE FEBRERO DE 2024 4.00PM SEDE VALLE VIEJO");
                     break;
                     
                     case 2:
                     JOptionPane.showMessageDialog(null, "PARA EL PACIENTE"+" "+nom+" "+"QUEDA AGENDADA PARA EL DIA 5 DE ABRIL DE 2024 8.00AM EPS");   
                     break;
                 } 
                 break;
                 
                 case 2:
                 JOptionPane.showMessageDialog(null, "LA NUTRICIONISTA JESSICA CEDIEL TIENE DISPONIBLE LAS SIGUIENTES FECHAS:"+"\n"+
                                                      "1. 15 DE MAYO DE FEBRERO 2024 4.00PM SEDE VALLE VIEJO"+"\n"+
                                                      "2. 15 DE AGOSTO 2024 8.00AM SEDE EPS"+"\n"); 
                 
                 docto2=Integer.parseInt(JOptionPane.showInputDialog("¿CUAL DE LAS FECHAS ANTERIORES ELIGE:"+"\n"+
                                                                      "1. 15 DE MAYO DE FEBRERO 2024 4.00PM SEDE VALLE VIEJO"+"\n"+
                                                                      "2. 15 DE AGOSTO 2024 8.00AM SEDE EPS"+"\n"));
                 
                 switch(docto2)
                 {
                     case 1:
                     JOptionPane.showMessageDialog(null, "PARA EL PACIENTE"+" "+nom+" "+"QUEDA AGENDADA PARA EL DIA 15 DE MAYO DE 2024 4.00PM SEDE VALLE VIEJO");
                     break;
                     
                     case 2:
                     JOptionPane.showMessageDialog(null, "PARA EL PACIENTE"+" "+nom+" "+"QUEDA AGENDADA PARA EL DIA 15 DE AGOSTO DE 2024 8.00AM EPS");   
                     break;
                 } 
                 break;
                 
             }
  }
    
     public void denti(List<pacientes> lista,String nom)
  {
      JOptionPane.showMessageDialog(null, "PARA CITA DE DENTISTA TENEMOS DISPONIBLE A LO DOCTORES:"+"\n"+
                                          "1. MICHELL PADILLA"+"\n"+
                                          "2. LAURA OSORIO"+"\n");
      
      int docto=0,docto2=0;
      
             docto=Integer.parseInt(JOptionPane.showInputDialog("CUAL DE ESTOS DOCTORES DESEA ELEGIR PARA SU CITA MEDICA:"+"\n"+
                                                                "1. MICHELL PADILLA"+"\n"+
                                                                "2. LAURA OSORIO"+"\n"));
             switch(docto)
             {
                 case 1:
                 JOptionPane.showMessageDialog(null, "LA DENTISTA MICHELL PADILLA TIENE DISPONIBLE LAS SIGUIENTES FECHAS:"+"\n"+
                                                      "1. 30 DE FEBRERO 2024 4.00PM SEDE VALLE VIEJO"+"\n"+
                                                      "2. 5 DE ABRIL 2024 8.00AM SEDE EPS"+"\n");
                 
                 docto2=Integer.parseInt(JOptionPane.showInputDialog("¿CUAL DE LAS FECHAS ANTERIORES ELIGE:"+"\n"+
                                                      "1. 30 DE FEBRERO 2024 4.00PM SEDE VALLE VIEJO"+"\n"+
                                                      "2. 5 DE ABRIL 2024 8.00AM SEDE EPS"+"\n"));
                 switch(docto2)
                 {
                     case 1:
                     JOptionPane.showMessageDialog(null, "PARA EL PACIENTE"+" "+nom+" "+"QUEDA AGENDADA PARA EL DIA 30 DE FEBRERO DE 2024 4.00PM SEDE VALLE VIEJO");
                     break;
                     
                     case 2:
                     JOptionPane.showMessageDialog(null, "PARA EL PACIENTE"+" "+nom+" "+"QUEDA AGENDADA PARA EL DIA 5 DE ABRIL DE 2024 8.00AM EPS");   
                     break;
                 } 
                 break;
                 
                 case 2:
                 JOptionPane.showMessageDialog(null, "LA DENTISTA LAURA OSORIO TIENE DISPONIBLE LAS SIGUIENTES FECHAS:"+"\n"+
                                                      "1. 13 DE MAYO DE FEBRERO 2024 4.00PM SEDE VALLE VIEJO"+"\n"+
                                                      "2. 7 DE AGOSTO 2024 8.00AM SEDE EPS"+"\n"); 
                 
                 docto2=Integer.parseInt(JOptionPane.showInputDialog("¿CUAL DE LAS FECHAS ANTERIORES ELIGE:"+"\n"+
                                                                      "1. 13 DE MAYO DE FEBRERO 2024 4.00PM SEDE VALLE VIEJO"+"\n"+
                                                                      "2. 7 DE AGOSTO 2024 8.00AM SEDE EPS"+"\n"));
                 
                 switch(docto2)
                 {
                     case 1:
                     JOptionPane.showMessageDialog(null, "PARA EL PACIENTE"+" "+nom+" "+"QUEDA AGENDADA PARA EL DIA 13 DE MAYO DE 2024 4.00PM SEDE VALLE VIEJO");
                     break;
                     
                     case 2:
                     JOptionPane.showMessageDialog(null, "PARA EL PACIENTE"+" "+nom+" "+"QUEDA AGENDADA PARA EL DIA 7 DE AGOSTO DE 2024 8.00AM EPS");   
                     break;
                 } 
                 break;
                 
             }
  }
    
}
