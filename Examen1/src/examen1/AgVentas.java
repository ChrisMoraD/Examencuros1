/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen1;
//Biblioteca
import javax.swing.JOptionPane;

/**
 *
 * @author Laboratorio
 */
public class AgVentas {
    
    //Atributos del agente 
    private String Nombre;
    private int Cedula;
    private int Codigo;
    private String Sucursal;
    private String VeiProp;
   
    //Constructor y Concatenar
    public AgVentas(String Nombre, int Cedula, int Codigo, String Sucursal, String VeiProp) {
        this.Nombre = Nombre;
        this.Cedula = Cedula;
        this.Codigo = Codigo;
        this.Sucursal = Sucursal;
        this.VeiProp = VeiProp;
    }

    public String getNombre() {
        return Nombre;
    }
    
public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getCedula() {
        return Cedula;
    }
    
public void setCedula(int Cedula){
    this.Cedula = Cedula;
}
    
    public int getCodigo() {
        return Codigo;
    }

public void setCodigo(int Codigo){
    this.Codigo = Codigo;
}
    
    public String getSucursal() {
        return Sucursal;
    }

public void setSucursal(String Sucursal){
    this.Sucursal = Sucursal;
}    
    
    public String getVeiProp() {
        return VeiProp;
    }
    
public void setVeiProp(String VeiProp)  {
    this.VeiProp = VeiProp;
}  
    
    
}
