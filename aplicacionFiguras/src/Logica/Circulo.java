/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

/**
 *
 * @author estudiantes
 */
public class Circulo extends Figura{
    private int x1,x2,y1,y2;
    
    public Circulo(int x1, int y1, int x2, int y2){
        this.x1=x1;
        this.x2=x2;
        this.y1=y1;
        this.y2=y2;
    }
    @Override
    public float getArea() {
        float base = Math.abs(x2 - x1);
        float altura = Math.abs(y2 - y1);        
        float radioCuadrado = (float) (Math.pow(base, 2) + Math.pow(altura, 2));        
        return (float) (radioCuadrado * Math.PI);
    }

    @Override
    public float getPerimetro() {
        float base = Math.abs(x2 - x1);
        float altura = Math.abs(y2 - y1);        
        float radio = (float) Math.sqrt(Math.pow(base, 2) + Math.pow(altura, 2));
        return (float) (2 * Math.PI * radio);
    }
}
