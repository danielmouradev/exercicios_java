package program;

import entities.Circulo;
import entities.Retangulo;
import interf.FormasGeometricas;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {

        List<FormasGeometricas> formasGeometricas = new ArrayList<>();

        formasGeometricas.add(new Circulo(5.5));
        formasGeometricas.add(new Retangulo(7.3, 6.2));
        formasGeometricas.add(new Retangulo(5.6, 6.6));

        for (FormasGeometricas forma : formasGeometricas){
            System.out.print(" Área: ");
            forma.calcularArea();
        }



    }
}
