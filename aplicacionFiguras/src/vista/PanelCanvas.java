/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import javax.swing.JPanel;

/**
 *
 * @author estudiantes
 */
public class PanelCanvas extends Canvas implements MouseListener, MouseMotionListener {

    private VentanaPrincipal ventana;
    private int estado;
    private int x1, x2, y1, y2;
    private boolean isPrimerClick;
    private Graphics ga;
    public PanelCanvas(VentanaPrincipal ventana) {
        estado = 1;
        isPrimerClick = true;
        
        this.ventana = ventana;
        this.addMouseListener(this);
        this.setVisible(true);
        this.setSize(600, 620);
        
    }

    @Override
    public void paint(Graphics g) {
        if (estado == 1) {
            //ga = this.getGraphics();
            //this.ga=g;
            paintFigure(g);
            //g.fillRoundRect(x1, y1, x2, y2, 20, 20);
            //g.fillRoundRect(x1, y1, x2, y2, 20, 20);          
        }
    }

    public void paintFigure(Graphics g) {
        g.setColor(Color.red);
        g.fillRoundRect(x1, y1, x2, y2, 20, 20);
        
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (isPrimerClick) {
            this.x1 = e.getX();
            this.y1 = e.getY();
            isPrimerClick = false;
        } else {
            this.x2 = e.getX();
            this.y2 = e.getY();
            isPrimerClick = true;
            
            
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    @Override
    public void mouseDragged(MouseEvent e) {

    }

    @Override
    public void mouseMoved(MouseEvent e) {

    }

    public void setEstado(int estado) {
        this.estado = estado;
        System.out.println(this.estado);
    }
}
