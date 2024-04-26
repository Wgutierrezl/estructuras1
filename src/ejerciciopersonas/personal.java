
package ejerciciopersonas;

import javax.swing.JOptionPane;
import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;

   
    public class personal 
    {
    String nombre;
    int edad;
    String cedula;
    int salario;

    public personal(String nombre, int edad, String cedula, int salario) 
    {
        this.nombre = nombre;
        this.edad = edad;
        this.cedula = cedula;
        this.salario = salario;
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

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }
    
    
    
    public List<personal> llenar(List<personal> lista)
    {
        int cant;
        cant=Integer.parseInt(JOptionPane.showInputDialog("DIGITE LA CANTIDAD DE TRABAJADORES"));
        
        for(int i=0;i<cant;i++)
        {
            nombre=JOptionPane.showInputDialog("DIGITE EL NOMBRE DEL TRABAJADOR");
            edad=Integer.parseInt(JOptionPane.showInputDialog("DIGITE LA EDAD DEL TRABAJADOR"));
            cedula=JOptionPane.showInputDialog("DIGITE LA CEDULA");
            salario=Integer.parseInt(JOptionPane.showInputDialog("DIGIGTE CUANTO GANA AL MES"));
            lista.add(new personal(nombre,edad,cedula,salario));
            
        }
        return lista;
    }

    public List<personal> mostrar(List<personal> lista)
    {
        String texto="";
        for(int i=0;i<lista.size();i++)
        {
            texto=texto+"NOMBRE"+" "+lista.get(i).getNombre()+"\n"+
                        "EDAD"+" "+lista.get(i).getEdad()+"\n"+
                    
                       (lista.get(i).getCedula()!=null+ "CEDULA"+" "+lista.get(i).getCedula())+"\n"+
                        "SALARIO"+" "+lista.get(i).getSalario()+"\n";
        }
        
        JOptionPane.showMessageDialog(null, "LISTA DE TRABAJADORES"+"\n"+texto);
        return lista;
    }
    
    
    
}

    

