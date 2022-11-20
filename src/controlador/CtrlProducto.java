/*https://www.taringa.net/+vulnerabilidades/tutorial-crear-un-formulario-de-datos-en-netbeans-java_s787h*/
package controlador;

import java.awt.event.ActionEvent;/**/
import java.awt.event.ActionListener;/*Se usa para detectar y manejar eventos de acción*/
import javax.swing.JOptionPane;/*es una clase que nos provee una conjunto de ventanas de dialogo que es ideal, para mostrar mensajes al usuario. Ya sean informativos, advertencias, errores, confirmaciones*/
import modelo.ConsultaProducto;/*CLASE IMPORTADA DEL PAQUETE MODELO*/
import modelo.producto;/*CLASE IMPORTADA DEL PAQUETE MODELO*/
import vista.frmProducto;/*CLASE IMPORTADA DEL PAQUETE VISTA*/

public class CtrlProducto implements ActionListener {
    private producto mod;
    private ConsultaProducto modC;
    private frmProducto frm;
    
    public CtrlProducto (producto mod, ConsultaProducto modC, frmProducto frm){
        this.mod = mod;
        this.modC = modC;
        this.frm = frm;
        this.frm.btnGuardar.addActionListener(this);
    }
    
    public void iniciar (){
        frm.setTitle("Estudiantes");
        frm.setLocationRelativeTo(null);
    }
    @Override 
    public void actionPerformed(ActionEvent e){
        if (e.getSource()== frm.btnGuardar){
            mod.setCodigo(frm.textCodigo.getText()); /*SET: definir y GET para obtener*/
            mod.setNombre(frm.textNombre.getText());
            mod.setApellido(frm.textApellido.getText());
            mod.setTelefono(Integer.valueOf(frm.textTelefono.getText()));
            mod.setCantidad(Integer.valueOf(frm.textCantidad.getText()));
            if (modC.registrar(mod))
            {
                JOptionPane.showMessageDialog(null, "registro guardado");
            }else{
                JOptionPane.showMessageDialog(null, "No guardado");
            }
        }
    }
}
