/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examen1;
//Biblioteca 
import javax.swing.JOptionPane;

/**
 *
 * @author Laboratorio
 */
public class Examen1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PedirDatos pedir = new PedirDatos(); 
       AgVentas AgVentas = pedir.SolicitardatosAgVentas();
       JOptionPane.showMessageDialog(null, AgVentas.toString());
                
               
    }
    
}
