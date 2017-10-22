
package Controlador;

import Interfaz.Acceso;


public class Basededatoscia {

   
    public static void main(String[] args) {
     ConexionCia con=new ConexionCia();
     con.Conexiondb();
     
    Acceso acc=new Acceso();
    acc.setVisible(true);
    acc.setLocationRelativeTo(null);
     
    }
    
}
