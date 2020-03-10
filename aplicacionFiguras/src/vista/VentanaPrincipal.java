
package vista;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author estudiantes
 */
public class VentanaPrincipal extends JFrame {
    private PanelBotones pnlBotones;
    private PanelCanvas pnlCanvas;
    private PanelDatosFigura pnlDatosFigura;
    private JPanel panelIzqSuperior;
    private JPanel panelIzqInferior;
    private JPanel panelDerCanvas;    
    private ComponentesGraficos componentes;
    private AdministradorRecursos administrador;
    
    private int estadoFigura=0;
    
    public VentanaPrincipal() {
        super("Paint que no es paint");
        
        componentes= new ComponentesGraficos();
        administrador = new AdministradorRecursos();
        
        
        panelIzqSuperior = componentes.devolverPanel(0, 0, 200, 300, null, administrador.getBordegrisDerecha());
        panelIzqInferior = componentes.devolverPanel(0, 300, 200, 300, null, administrador.getBordegrisDerecha());
        panelDerCanvas = componentes.devolverPanel(200, 0, 600, 620, null, null);
        
        this.add(panelIzqSuperior);        
        this.add(panelIzqInferior);        
        this.add(panelDerCanvas);
        
        pnlBotones = new PanelBotones(this, componentes, administrador);
        panelIzqSuperior.add(pnlBotones);
        pnlDatosFigura = new PanelDatosFigura(this);
        panelIzqInferior.add(pnlDatosFigura);
        pnlCanvas = new PanelCanvas(this);
        panelDerCanvas.add(pnlCanvas);
        
        
        
        this.setSize(800, 620);
        this.setLocationRelativeTo(null);
        this.setLayout(null);
        this.setResizable(false);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public int getEstadoFigura() {
        return estadoFigura;
    }

    public void setEstadoFigura(int estadoFigura) {
        this.estadoFigura = estadoFigura;
        pnlCanvas.setEstado(estadoFigura);
    }
}
