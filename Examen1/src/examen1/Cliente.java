/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen1;

/**
 *
 * @author Laboratorio
 */
public class Cliente {
    
    //Atributos Cliente 
    
    String nombre;
    int Cedula;
    int CodFactura;
    int MontFactura;
    String mes;
    int NumMes;
    String PElectronicos;
    String PAutomotrices;
    String PConstruccion;
    
    //Constructor y concatenar
    public Cliente(String nombre, int Cedula, int CodFactura, int MontFactura, String mes, int NumMes, String PElectronicos, String PAutomotrices, String PConstruccion) {
        this.nombre = nombre;
        this.Cedula = Cedula;
        this.CodFactura = CodFactura;
        this.MontFactura = MontFactura;
        this.mes = mes;
        this.NumMes = NumMes;
        this.PElectronicos = PElectronicos;
        this.PAutomotrices = PAutomotrices;
        this.PConstruccion = PConstruccion;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCedula() {
        return Cedula;
    }

    public int getCodFactura() {
        return CodFactura;
    }

    public int getMontFactura() {
        return MontFactura;
    }

    public String getMes() {
        return mes;
    }

    public int getNumMes() {
        return NumMes;
    }

    public String getPElectronicos() {
        return PElectronicos;
    }

    public String getPAutomotrices() {
        return PAutomotrices;
    }

    public String getPConstruccion() {
        return PConstruccion;
    }
    
    
}
