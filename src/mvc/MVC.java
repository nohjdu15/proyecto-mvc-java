/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mvc;

import modelo.producto;
import modelo.ConsultaProducto; /*IMPORTA DEL PAQUETE MODELO la clase consulta producto*/
import vista.frmProducto;
import controlador.CtrlProducto;

public class MVC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        producto mod = new producto();/*CLASE nombre objeto = new nombre de la clase() */
        ConsultaProducto modC = new ConsultaProducto ();
        frmProducto frm = new frmProducto();
        CtrlProducto ctrl = new CtrlProducto (mod, modC, frm);
        ctrl.iniciar(); /*objeto.metodos de la clase propia*/
        frm.setVisible(true);
        
    }
    
}
