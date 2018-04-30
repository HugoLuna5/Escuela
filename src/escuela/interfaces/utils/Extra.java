package escuela.interfaces.utils;

import escuela.interfaces.Figuras2D.Circulo;
import escuela.interfaces.Figuras2D.Cuadrado;
import escuela.interfaces.Figuras2D.Rectangulo;
import escuela.interfaces.Figuras2D.Triangulo;
import escuela.interfaces.Firguras3D.*;

public class Extra {

    /**************************************/
    /*/            Figuras 2D            /*/
    /**************************************/



    /**
     * circulo
     * @param cr
     * @param value
     */
    public static void areaCirculo(Circulo cr, double value){
        cr.areaCirculo(value);

    }
    public static void perimetroCirculo(Circulo cr, double value){
        cr.perimetroCirculo(value);

    }
    public static void allCirculo(Circulo cr, double value){
        cr.allCirculo(value);

    }

    /**
     * cuadrado
     * @param cuadrado
     * @param lado
     */

    public static void areaCuadrado(Cuadrado cuadrado, double lado){
        cuadrado.areaCuadrado(lado);
    }
    public static void perimetroCuadrado(Cuadrado cuadrado, double lado){
        cuadrado.areaCuadrado(lado);
    }
    public static void allCuadrado(Cuadrado cuadrado, double lado){
        cuadrado.allCuadrado(lado);
    }


    /**
     * rectangulo
     * @param rectangulo
     * @param base
     * @param altura
     */

    public static void areaRectangulo(Rectangulo rectangulo, double base, double altura){
        rectangulo.areaRectangulo(base,altura);

    }

    public static void perimetroRectangulo(Rectangulo rectangulo,double base, double altura){
        rectangulo.perimetroRectangulo(base,altura);
    }
    public static void allRectangulo(Rectangulo rectangulo,double base, double altura){
        rectangulo.allRectangulo(base,altura);
    }


    /**
     * triangulo
     * @param triangulo
     * @param base
     * @param altura
     */
    public static void areaTriangulo(Triangulo triangulo, double base, double altura){

        triangulo.areaTriangulo(base, altura);

    }

    public static void perimetroTriangulo(Triangulo triangulo, double base, double altura){

        triangulo.areaTriangulo(base, altura);

    }

    public static void allTriangulo(Triangulo triangulo, double base, double altura){

        triangulo.areaTriangulo(base, altura);

    }


    /**************************************/
    /*/          Fin Figuras 2D          /*/
    /**************************************/




    /**************************************/
    /*/            Figuras 3D            /*/
    /**************************************/


    /**
     * cilindro
     * @param cilindro
     * @param radio
     * @param altura
     */

    public static void areaCilindro(Cilindro cilindro, double radio, double altura){
        cilindro.areaCilindro(radio,altura);
    }

    public static void perimetroCilindro(Cilindro cilindro){
        cilindro.perimetroCilindro();
    }

    public static void allCilindro(Cilindro cilindro,double radio, double altura){
        cilindro.allCilindro(radio,altura);
    }


    /**
     * cono
     * @param cono
     * @param base
     * @param superficieLateral
     */

    public static void areaCono(Cono cono, double base, double superficieLateral){
        cono.areaCono(base,superficieLateral);
    }

    public static void perimetroCono(Cono cono, double radio){
        cono.perimetroCono(radio);
    }

    public static void allCono(Cono cono,double base, double superficieLateral, double radio){
        cono.allCono(base,superficieLateral,radio);
    }


    /**
     * cubo
     * @param cubo
     * @param aristas
     */


    public static void areaCubo(Cubo cubo,double aristas){
        cubo.areaCubo(aristas);
    }

    public static void perimetroCubo(Cubo cubo){
        cubo.perimetroCubo();
    }

    public static void allCubo(Cubo cubo,double aristas){
        cubo.allCubo(aristas);
    }


    /**
     * esfera
     * @param esfera
     * @param var
     */

    public static void areaEsfera(Esfera esfera, double var){
        esfera.areaEsfera(var);
    }

    public static void perimetroEsfera(Esfera esfera, double radio){
        esfera.perimetroEsfera(radio);
    }

    public static void allEsfera(Esfera esfera, double var, double radio){
        esfera.allEsfera(var, radio);
    }


    /**
     * piramide cuadrada
     * @param piramideCuadrada
     * @param arista
     * @param ap
     */

    public static void areaPiramideCuadrada(PiramideCuadrada piramideCuadrada, double arista, double ap){
        piramideCuadrada.areaPiramideCuadrada(arista,ap);

    }

    public static void perimetroPiramideCuadrada(PiramideCuadrada piramideCuadrada){
        piramideCuadrada.perimetroPiramideCuadrada();
    }

    public static void allPiramideCuadrada(PiramideCuadrada piramideCuadrada, double arista, double ap){
        piramideCuadrada.allPiramideCuadrada(arista,ap);

    }


    /**
     * piramide triangular
     * @param piramideTriangular
     * @param arista
     * @param ap
     */


    public static void areaPiramideTriangular(PiramideTriangular piramideTriangular,double arista, double ap){
        piramideTriangular.areaPiramideTriangular(arista,ap);

    }

    public static void perimetroPiramideTriangular(PiramideTriangular piramideTriangular){
        piramideTriangular.perimetroPiramideTriangular();

    }

    public static void allPiramideTriangular(PiramideTriangular piramideTriangular,double arista, double ap){
        piramideTriangular.allPiramideTriangular(arista,ap);

    }


    /**
     * prisma hexagonal
     * @param prismaHexagonal
     * @param lado
     * @param apotema
     * @param altura
     */

    public static void areaPrismaHexagonal(PrismaHexagonal prismaHexagonal,double lado, double apotema, double altura){
        prismaHexagonal.areaPrismaHexagonal(lado,apotema,altura);
    }

    public static void perimetroPrismaHexagonal(PrismaHexagonal prismaHexagonal){
        prismaHexagonal.perimetroPrismaHexagonal();
    }

    public static void allPrismaHexagonal(PrismaHexagonal prismaHexagonal,double lado, double apotema, double altura){
        prismaHexagonal.allPrismaHexagonal(lado,apotema,altura);
    }


    /**
     * prisma rectangular
     * @param prismaRectangular
     * @param ladoA
     * @param ladoB
     * @param altura
     */

    public static void areaPrismaRectangular(PrismaRectangular prismaRectangular,double ladoA, double ladoB, double altura){
        prismaRectangular.areaPrismaRectangular(ladoA,ladoB,altura);
    }

    public static void perimetroPrismaRectangular(PrismaRectangular prismaRectangular,double largo, double ancho, double profundidad){
        prismaRectangular.perimetroPrismaRectangular(largo,ancho,profundidad);
    }

    public static void allPrismaRectangular(PrismaRectangular prismaRectangular,double ladoA, double ladoB, double altura, double largo, double ancho, double profundidad){
        prismaRectangular.allPrismaRectangular( ladoA,  ladoB,  altura,  largo,  ancho,  profundidad);
    }


    /**
     * prisma triangular
     * @param prismaTriangular
     * @param ladoBase
     * @param altura
     */


    public static void areaPrismaTriangular(PrismaTriangular prismaTriangular,double ladoBase, double altura){
        prismaTriangular.areaPrismaTriangular(ladoBase,altura);
    }

    public static void perimetroPrismaTriangular(PrismaTriangular prismaTriangular){
        prismaTriangular.perimetroPrismaTriangular();
    }

    public static void allPrismaTriangular(PrismaTriangular prismaTriangular,double ladoBase, double altura){
        prismaTriangular.allPrismaTriangular(ladoBase,altura);
    }


    /**************************************/
    /*/          Fin Figuras 3D          /*/
    /**************************************/
}
