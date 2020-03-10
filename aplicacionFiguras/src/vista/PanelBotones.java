
package vista;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author estudiantes
 */
public class PanelBotones extends JPanel implements ActionListener {
    
    private JButton btnRectangulo, btnCirculo, btnTriangulo;
    private JLabel mensaje;
    VentanaPrincipal ventana;
    
    public PanelBotones(VentanaPrincipal ventana, ComponentesGraficos componentes, AdministradorRecursos administrador){
        this.ventana=ventana;
        btnRectangulo = componentes.devolverBoton("Rectangulo", 20, 20, 160, 30, administrador.getMano(), null, null, Color.BLUE , Color.white, null, 0, 0);
        btnRectangulo.addActionListener(this);
        this.add(btnRectangulo);
        btnCirculo = componentes.devolverBoton("Circulo", 20, 60, 160, 30, administrador.getMano(), null, null, Color.BLUE , Color.white, null, 0, 0);
        btnCirculo.addActionListener(this);
        this.add(btnCirculo);        
        btnTriangulo = componentes.devolverBoton("Triangulo", 20, 100, 160, 30, administrador.getMano(), null, null, Color.BLUE , Color.white, null, 0, 0);        
        btnTriangulo.addActionListener(this);
        this.add(btnTriangulo);
        
        mensaje = new JLabel("asd");
        mensaje.setBounds(20, 140, 160, 30);
        this.add(mensaje);
        
        this.setLayout(null);
        this.setSize(190, 300);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(this.btnRectangulo)){
            ventana.setEstadoFigura(1);
            mensaje.setText("Rectangulo");
        }            
        if(e.getSource().equals(this.btnCirculo)){
            ventana.setEstadoFigura(2);
            mensaje.setText("Circulo");
        }                  
        if(e.getSource().equals(this.btnTriangulo)){
            ventana.setEstadoFigura(3);
            mensaje.setText("Triángulo");
        }            
    }
}
