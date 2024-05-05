
package main;


public class paciente 
{
    String nombre;
    String apellido;
    String RH;
    int edad;
    int diac;
    String mes;
    int ano;

    public paciente(String nombre, String apellido, String RH, int edad, int diac, String mes, int ano) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.RH = RH;
        this.edad = edad;
        this.diac = diac;
        this.mes = mes;
        this.ano = ano;
    }

    public paciente() 
    {
        
    }

    

   

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getRH() {
        return RH;
    }

    public void setRH(String RH) {
        this.RH = RH;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getDiac() {
        return diac;
    }

    public void setDiac(int diac) {
        this.diac = diac;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
    
    
    
    
    
}

