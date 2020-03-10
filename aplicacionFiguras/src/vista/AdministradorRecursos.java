package vista;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.border.Border;
import javax.swing.table.DefaultTableCellRenderer;
/**
 * @author Usuario
 */
public class AdministradorRecursos {

    private Color colorAzul, colorAzulOscuro, colorBlanco, colorGrisBlanco,colorGrisClaro,colorGrisOscuro, colorMorado;
    private Font fuenteTitulo, fuenteSubtitulo, fuenteTexto, fuenteTitulo2; 
    private Border bordeGris, bordegrisDerecha,bordeInferiorAzul, bordeDifuminado,bordeRedondeado, bordeCircular;   
    private Cursor mano;
    
    public AdministradorRecursos(){
        fuenteTitulo= new Font("Century Gothic", Font.BOLD,35);
        fuenteTitulo2= new Font("Century Gothic", Font.BOLD,18);
        fuenteSubtitulo= new Font("Century Gothic", Font.PLAIN,14);
        fuenteTexto= new Font("Century Gothic", Font.PLAIN,12);
        colorGrisClaro= new Color(200,200,200);
        colorGrisBlanco=new Color(245,245,245);
        colorGrisOscuro= new Color(80,80,80);
        colorAzul= new Color(62,86,189);
        colorAzulOscuro= new Color(22,46,149);
        colorMorado= new Color (146,38,159);
        colorBlanco= Color.white;
        mano= new Cursor(Cursor.HAND_CURSOR);
        bordeGris= BorderFactory.createLineBorder(colorGrisClaro, 2, true);
        bordegrisDerecha= BorderFactory.createMatteBorder(0, 0, 0, 3, Color.gray);
        bordeInferiorAzul= BorderFactory.createMatteBorder(0, 0, 3, 0, colorAzul);
    }

    public Color getColorAzul() {
        return colorAzul;
    }

    public Color getColorAzulOscuro() {
        return colorAzulOscuro;
    }

    public Color getColorBlanco() {
        return colorBlanco;
    }

    public Color getColorGrisClaro() {
        return colorGrisClaro;
    }

    public Color getColorGrisOscuro() {
        return colorGrisOscuro;
    }

    public Color getColorMorado() {
        return colorMorado;
    }

    public Color getColorGrisBlanco() {
        return colorGrisBlanco;
    }
    
    public Font getFuenteTitulo() {
        return fuenteTitulo;
    }

    public Font getFuenteTitulo2() {
        return fuenteTitulo2;
    }
    
    public Font getFuenteSubtitulo() {
        return fuenteSubtitulo;
    }

    public Font getFuenteTexto() {
        return fuenteTexto;
    }

    public Border getBordeGris() {
        return bordeGris;
    }

    public Border getBordegrisDerecha() {
        return bordegrisDerecha;
    }

    public Border getBordeDifuminado() {
        return bordeDifuminado;
    }

    public Border getBordeRedondeado() {
        return bordeRedondeado;
    }

    public Border getBordeCircular() {
        return bordeCircular;
    }
    
    public Cursor getMano() {
        return mano;
    }

}
