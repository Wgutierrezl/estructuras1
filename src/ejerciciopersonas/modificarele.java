
package ejerciciopersonas;


import javax.swing.JOptionPane;
import java.util.List;
import java.util.ArrayList;
public class modificarele 
{

    public modificarele() 
    {
        
    }
    
    public List<personal> cambiar(List<personal> lista)
    {
       for(int i=0;i<lista.size();i++)
       {
            if(lista.get(i).getSalario()>1000000)
            {
                lista.get(i).setSalario(Integer.parseInt(JOptionPane.showInputDialog("ACTUALICE SU SALARIO"+" "+lista.get(i).getNombre())));
                lista.get(i).setCedula(" ");
            }
       }
       return lista;
    }
    
 }
    

