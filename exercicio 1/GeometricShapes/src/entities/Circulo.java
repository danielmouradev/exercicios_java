package entities;

import interf.FormasGeometricas;

public class Circulo implements FormasGeometricas {

    private Double area, perimetro, raio;
    private double pi = Math.PI;

    public Circulo() {
    }



    public Circulo(Double raio) {
       this.raio = raio;
    }

    @Override
    public void calcularArea() {
        Double area = pi * Math.pow(raio, 2);
        System.out.printf("%.2f", area);
    }

    @Override
    public void calcularPerimetro() {
        perimetro = raio * Math.pow(pi, 2);
        System.out.printf("%.2f", getPerimetro());
    }

    public Double getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(Double perimetro) {
        this.perimetro = perimetro;
    }

    public Double getArea() {
        return area;
    }

    public void setArea(Double area) {
        this.area = area;
    }


}
