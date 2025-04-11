package entities;

import interf.FormasGeometricas;

public class Triangulo implements FormasGeometricas {
    private Double base, altura, num1, num2,num3;

    public Triangulo() {
    }

    public Triangulo(Double base, Double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public void calcularArea() {
        Double area = base * altura;
        System.out.printf("%.2f", area);
    }

    @Override
    public void calcularPerimetro() {
        Double perimetro = num1 + num2 + num3;
        System.out.printf("%.2f", perimetro);
    }


    public Double getBase() {
        return base;
    }

    public void setBase(Double base) {
        this.base = base;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }


}
