package escuela.interfaces.utils;

import escuela.interfaces.Figuras2D.Circulo;
import escuela.interfaces.Figuras2D.Cuadrado;
import escuela.interfaces.Figuras2D.Rectangulo;
import escuela.interfaces.Figuras2D.Triangulo;
import escuela.interfaces.Firguras3D.*;

import javax.swing.*;

public class Figura implements Circulo, Cuadrado, Rectangulo, Triangulo, Cilindro,
        Cono, Cubo, Esfera, PiramideCuadrada, PiramideTriangular, PrismaHexagonal, PrismaRectangular,
        PrismaTriangular
{


    private double area = 0;
    private double perimetro = 0;


    @Override
    public void areaCirculo(double radio) {
        area = 3.1416 * (radio * radio);
        cuadroDialogoArea(area);
    }

    @Override
    public void perimetroCirculo(double radio) {
        perimetro = (2 * 3.1416) * radio;
        cuadroDialogoPerimetro(perimetro);


    }

    @Override
    public void allCirculo(double radio) {


        area = 3.1416 * (radio * radio);
        perimetro = (2 * 3.1416) * radio;
        cuadroDialogoAll(area,perimetro);

    }

    @Override
    public void areaCuadrado(double lado) {
        area = lado * lado;
                cuadroDialogoArea(area);


    }

    @Override
    public void perimetroCuadrado(double lado) {
        perimetro = lado * 4;
        cuadroDialogoPerimetro(perimetro);

    }

    @Override
    public void allCuadrado(double lado) {
        area = lado * lado;
        perimetro = lado * 4;

        cuadroDialogoAll(area,perimetro);

    }

    @Override
    public void areaRectangulo(double base, double altura) {
        area = base * altura;
                cuadroDialogoArea(area);


    }

    @Override
    public void perimetroRectangulo(double base, double altura) {
        perimetro = (base * 2) + (altura * 2);
        cuadroDialogoPerimetro(perimetro);


    }

    @Override
    public void allRectangulo(double base, double altura) {
        area = base * altura;
        perimetro = (base * 2) + (altura * 2);
        cuadroDialogoAll(area,perimetro);


    }

    @Override
    public void areaTriangulo(double base, double altura) {
        area = (base * altura) / 2;
    }

    @Override
    public void perimetroTriangulo(double lado) {
        perimetro = lado * 3;

    }

    @Override
    public void allTriangulo(double base, double altura, double lado) {
        area = (base * altura) / 2;
        perimetro = lado * 3;
        cuadroDialogoAll(area,perimetro);
    }



    @Override
    public void areaCilindro(double radio, double altura) {

        area = ((2 * 3.1416) * radio) * (radio * altura);
        cuadroDialogoArea(area);
    }

    @Override
    public void perimetroCilindro() {
        perimetro = 0;
        cuadroDialogoPerimetro(perimetro);

    }

    @Override
    public void allCilindro(double radio, double altura) {
        area = ((2 * 3.1416) * radio) * (radio * altura);
        perimetro = 0;

        cuadroDialogoAll(area,perimetro);

    }


    @Override
    public void areaCono(double base, double superficieLateral) {

        area = ((3.1416 * 6)* 10) + ((3.1416 * 6)*2);
        cuadroDialogoArea(area);

    }

    @Override
    public void perimetroCono(double radio) {
        perimetro = (2 * 3.1416) * radio;
        cuadroDialogoPerimetro(perimetro);
    }

    @Override
    public void allCono(double base, double superficieLateral, double radio) {
        area = ((3.1416 * 6)* 10) + ((3.1416 * 6)*2);
        perimetro = (2 * 3.1416) * radio;
        cuadroDialogoAll(area,perimetro);
    }


    @Override
    public void areaCubo(double aristas) {
        area = 6 * (aristas*2);
        cuadroDialogoArea(area);
    }

    @Override
    public void perimetroCubo() {
        perimetro = 0;
        cuadroDialogoPerimetro(perimetro);
    }

    @Override
    public void allCubo(double aristas) {
        area = 6 * (aristas*2);
        perimetro = 0;
        cuadroDialogoAll(area,perimetro);
    }


    @Override
    public void areaEsfera(double var) {
        area = (4 * 3.1416) * (var * var);

        cuadroDialogoArea(area);
    }

    @Override
    public void perimetroEsfera(double radio) {
        perimetro = (2 * 3.1416) * radio;
        cuadroDialogoPerimetro(perimetro);
    }

    @Override
    public void allEsfera(double var, double radio) {
        area = (4 * 3.1416) * (var * var);
        perimetro = (2 * 3.1416) * radio;

        cuadroDialogoAll(area,perimetro);
    }

    @Override
    public void areaPiramideCuadrada(double arista, double ap) {
        area = arista * ( (2 * ap) + arista );

        cuadroDialogoArea(area);
    }

    @Override
    public void perimetroPiramideCuadrada() {
        perimetro = 0;
        cuadroDialogoPerimetro(perimetro);
    }

    @Override
    public void allPiramideCuadrada(double arista, double ap) {
        area = arista * ( (2 * ap) + arista );
        perimetro = 0;
        cuadroDialogoAll(area,perimetro);

    }


    @Override
    public void areaPiramideTriangular(double arista, double ap) {
        area =  ( (Math.sqrt(3)/2) * arista ) * ( ((1/2) * arista) + (Math.sqrt(3) * arista) );
        cuadroDialogoArea(area);
    }

    @Override
    public void perimetroPiramideTriangular() {
        perimetro = 0;
        cuadroDialogoPerimetro(perimetro);
    }

    @Override
    public void allPiramideTriangular(double arista, double ap) {
        area =  ( (Math.sqrt(3)/2) * arista ) * ( ((1/2) * arista) + (Math.sqrt(3) * arista) );
        perimetro = 0;
        cuadroDialogoAll(area,perimetro);
    }


    @Override
    public void areaPrismaHexagonal(double lado, double apotema, double altura) {
        area = (6 * lado) * (apotema * altura);
        cuadroDialogoArea(area);
    }

    @Override
    public void perimetroPrismaHexagonal() {
        perimetro = 0;
        cuadroDialogoPerimetro(perimetro);
    }

    @Override
    public void allPrismaHexagonal(double lado, double apotema, double altura) {
        area = (6 * lado) * (apotema * altura);
        perimetro = 0;
        cuadroDialogoAll(area,perimetro);
    }

    @Override
    public void areaPrismaRectangular(double ladoA, double ladoB, double altura) {
        area = 2 * ( (ladoA * ladoB) + (ladoA + altura) + (ladoB * altura) );
        cuadroDialogoArea(area);
    }

    @Override
    public void perimetroPrismaRectangular(double largo, double ancho, double profundidad) {
        //P = 4*L + 4*B + 4*C
        perimetro = (4 * largo) + (4 * ancho) + (4 * profundidad);
        cuadroDialogoPerimetro(perimetro);

    }

    @Override
    public void allPrismaRectangular(double ladoA, double ladoB, double altura, double largo, double ancho, double profundidad) {
        area = 2 * ( (ladoA * ladoB) + (ladoA + altura) + (ladoB * altura) );
        perimetro = (4 * largo) + (4 * ancho) + (4 * profundidad);

        cuadroDialogoAll(area,perimetro);
    }



    @Override
    public void areaPrismaTriangular(double ladoBase, double altura) {

        area = ladoBase * (  ( (Math.sqrt(3) / 2) * ladoBase ) +  (3 * altura) );
        cuadroDialogoArea(area);
    }

    @Override
    public void perimetroPrismaTriangular() {
        perimetro = 0;
        cuadroDialogoPerimetro(perimetro);
    }

    @Override
    public void allPrismaTriangular(double ladoBase, double altura) {
        area = ladoBase * (  ( (Math.sqrt(3) / 2) * ladoBase ) +  (3 * altura) );
        perimetro = 0;
        cuadroDialogoAll(area,perimetro);
    }




    /**
     * Dialogs for message response user
     * @param area
     * @param perimetro
     */



    public void cuadroDialogoAll(double area, double perimetro){

        JOptionPane.showMessageDialog(JOptionPane.getRootFrame(), "Area: "+area+" Perimetro: "+perimetro, "Resultado de las operaciones", JOptionPane.DEFAULT_OPTION);


    }

    public void cuadroDialogoArea(double area){
        JOptionPane.showMessageDialog(JOptionPane.getRootFrame(), "Area: "+area, "Resultado de las operaciones", JOptionPane.DEFAULT_OPTION);

    }

    public void cuadroDialogoPerimetro(double perimetro){
        JOptionPane.showMessageDialog(JOptionPane.getRootFrame(), "Perimetro: "+perimetro, "Resultado de las operaciones", JOptionPane.DEFAULT_OPTION);

    }



}
