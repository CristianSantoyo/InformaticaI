/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import javax.swing.JPanel;
import javax.swing.JTextArea;

/**
 *
 * @author estudiantes
 */
public class PanelDatosFigura extends JPanel {
    private JTextArea informacion;
    private VentanaPrincipal ventana;

    public PanelDatosFigura(VentanaPrincipal ventana) {
        this.ventana=ventana;
        informacion = new JTextArea();
        informacion.setBounds(20, 20, 160, 260);
        informacion.setEditable(false);
        informacion.setText("Carreta");
        this.add(informacion);
        this.setLayout(null);
        this.setSize(190, 300);
        
    }
    
    
}
