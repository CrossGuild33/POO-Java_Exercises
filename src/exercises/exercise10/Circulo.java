package exercises.exercise10;

public class Circulo extends FormaGeometrica{
    public Circulo(){

    }
    public void calcularArea(double r){
        double pi = 3.14;
        System.out.printf("\nO valor da área do círculo é:" + pi * (r * r) );
    }

}
