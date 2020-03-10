
package Logica;

/**
 *
 * @author estudiantes
 */
public class Rectangulo extends Figura{
    
    private int x1,x2,y1,y2;
    
    public Rectangulo(int x1, int y1, int x2, int y2){
        this.x1=x1;
        this.x2=x2;
        this.y1=y1;
        this.y2=y2;
    }

    @Override
    public float getArea() {
        float base = Math.abs(x2 - x1);
        float altura = Math.abs(y2 - y1);
        return base * altura;
    }

    @Override
    public float getPerimetro() {
        float base = Math.abs(x2 - x1);
        float altura = Math.abs(y2 - y1);
        return base * 2 + altura * 2;
    }
    
}
