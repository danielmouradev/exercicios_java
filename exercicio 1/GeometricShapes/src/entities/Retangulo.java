package entities;

import interf.FormasGeometricas;

public class Retangulo implements FormasGeometricas {
    private Double base, altura;


    public Retangulo() {
    }

    public Retangulo(Double altura, Double base) {
        this.altura = altura;
        this.base = base;
    }

    @Override
    public void calcularArea() {
        Double area = base * altura;
        System.out.printf("%.2f", area);
    }

    @Override
    public void calcularPerimetro() {
        Double perimetro = 2 * (base * altura);
        System.out.printf("%.2f", perimetro);
    }


    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public Double getBase() {
        return base;
    }

    public void setBase(Double base) {
        this.base = base;
    }



}
