
package Logica;

/**
 *
 * @author estudiantes
 */
public class Triangulo extends Figura {
    private int x1,x2,y1,y2;
    
    public Triangulo(int x1, int y1, int x2, int y2){
        this.x1=x1;
        this.x2=x2;
        this.y1=y1;
        this.y2=y2;
    }
    @Override
    public float getArea() {
        float base = Math.abs(x2 - x1);
        float altura = Math.abs(y2 - y1);        
        return base * altura / 2;
    }

    @Override
    public float getPerimetro() {
        float base = Math.abs(x2 - x1);
        float altura = Math.abs(y2 - y1);
        float hipotenusa = (float) Math.sqrt(Math.pow((base)/2, 2) + Math.pow(altura, 2));
        return base + hipotenusa*2;
    }
}
