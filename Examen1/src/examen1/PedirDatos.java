/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen1;
//Bibliteca
import javax.swing.JOptionPane;

/**
 *
 * @author Laboratorio
 */
public class PedirDatos {
    
    //Pedir los datos al usuario 
     public AgVentas SolicitardatosAgVentas() {
         
         String Nombre = JOptionPane.showInputDialog("Ingrese el nombre del agente de ventas:");
         
         int Cedula = Integer.parseInt(JOptionPane.showInputDialog("Ditite el numero de su cedula:"));
         
         int Codigo = Integer.parseInt(JOptionPane.showInputDialog("Digite su codigo:"));
         
         String Sucursal = JOptionPane.showInputDialog("Ingrese el nombre de la sucursal:");
         
         String VeiProp = JOptionPane.showInputDialog("¿Posee veiculo propio?(Si/No):");
         
          //Respuesta Final 
          JOptionPane.showMessageDialog(null, "Nombre:" + Nombre + "Cedula:" + Cedula + "Codigo:" + Codigo + "Sucursal" + Sucursal + "¿Posee veiculo propio?=" +VeiProp);
         
          return new AgVentas(Nombre, Cedula, Codigo, Sucursal, VeiProp);
          
         
        
        
         
         
     }
}
