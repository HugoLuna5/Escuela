/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package escuela;

import escuela.interfaces.utils.Extra;
import escuela.interfaces.utils.Figura;

import javax.swing.*;

/**
 *
 * @author HugoLuna
 */
public class AppMain extends Extra{


    public static final String[] figuras = { "Circulo 2D", "Cuadrado 2D", "Rectangulo 2D", "Triangulo 2D",
    "Cilindro 3D", "Cono 3D", "Cubo 3D", "Esfera 3D", "Piramide Cuadrada 3D", "Piramide Triangular 3D", "Prisma Hexagonal 3D"
    , "Prisma Rectangular 3D", "Prisma Triangular 3D"};

    public static final String[] options = {"Area", "Perimetro", "Ambos"};


    public static void initApp (){

        JFrame frame = new JFrame("Figuras 2D y 3D");
        String figura = (String) JOptionPane.showInputDialog(frame,
                "Elige una figura",
                "Escuela",
                JOptionPane.QUESTION_MESSAGE,
                null,
                figuras,
                figuras[0]);


        JFrame opt = new JFrame("Opciones");
        String op = (String) JOptionPane.showInputDialog(opt,
                "Opciones",
                "Escuela",
                JOptionPane.QUESTION_MESSAGE,
                null,
                options,
                options[0]);

        // favoritePizza will be null if the user clicks Cancel
        System.out.printf("Figura seleccionada %s.\n", figura);
        System.out.printf("Opcion seleccionada %s.\n", op);



        initOptionSelect(figura.toLowerCase(), op.toLowerCase());
        System.exit(0);

    }

    public static void initOptionSelect(String figura, String op){
        String text;
        String base;
        String altura;
        String radio;
        String aristas;
        String ap;
        String largo;
        String ancho;
        String profundidad;
        String lado;
        String ladoB;
        String superficieLateral;
        Figura fi = new Figura();

        try{

            switch (figura){
                case "circulo 2d":
                    switch (op){
                        case "area":
                            text = JOptionPane.showInputDialog("Ingresa el radio");
                            areaCirculo(fi, Double.parseDouble(text));
                            break;
                        case "perimetro":
                            text = JOptionPane.showInputDialog("Ingresa el radio");
                            perimetroCirculo(fi, Double.parseDouble(text));
                            break;
                        case "ambos":
                            text = JOptionPane.showInputDialog("Ingresa el radio");
                            allCirculo(fi, Double.parseDouble(text));

                            break;
                    }

                    break;
                case "cuadrado 2d":

                    switch (op){
                        case "area":
                            text = JOptionPane.showInputDialog("Ingresa el lado");
                            areaCuadrado(fi, Double.parseDouble(text));
                            break;
                        case "perimetro":
                            text = JOptionPane.showInputDialog("Ingresa el lado");
                            perimetroCuadrado(fi, Double.parseDouble(text));
                            break;
                        case "ambos":
                            text = JOptionPane.showInputDialog("Ingresa el lado");
                            allCuadrado(fi, Double.parseDouble(text));

                            break;
                    }


                    break;
                case "rectangulo 2d":
                    base = JOptionPane.showInputDialog("Ingresa la base");
                    altura = JOptionPane.showInputDialog("Ingresa la altura");
                    switch (op){
                        case "area":

                            areaRectangulo(fi, Double.parseDouble(base), Double.parseDouble(altura));
                            break;
                        case "perimetro":
                            perimetroRectangulo(fi, Double.parseDouble(base), Double.parseDouble(altura));

                            break;
                        case "ambos":
                            allRectangulo(fi, Double.parseDouble(base), Double.parseDouble(altura));


                            break;
                    }
                    break;
                case "triangulo 2d":

                    base = JOptionPane.showInputDialog("Ingresa la base");
                    altura = JOptionPane.showInputDialog("Ingresa la altura");
                    switch (op){
                        case "area":

                            areaRectangulo(fi, Double.parseDouble(base), Double.parseDouble(altura));
                            break;
                        case "perimetro":
                            perimetroRectangulo(fi, Double.parseDouble(base), Double.parseDouble(altura));

                            break;
                        case "ambos":
                            allRectangulo(fi, Double.parseDouble(base), Double.parseDouble(altura));


                            break;
                    }

                    break;
                case "cilindro 3d":

                    radio = JOptionPane.showInputDialog("Ingresa el radio");
                    altura = JOptionPane.showInputDialog("Ingresa la altura");
                    switch (op){
                        case "area":

                            areaCilindro(fi, Double.parseDouble(radio), Double.parseDouble(altura));
                            break;
                        case "perimetro":
                            perimetroCilindro(fi);

                            break;
                        case "ambos":
                            allCilindro(fi, Double.parseDouble(radio), Double.parseDouble(altura));


                            break;
                    }

                    break;
                case "cono 3d":


                    switch (op){
                        case "area":
                            base = JOptionPane.showInputDialog("Ingresa la base");
                            superficieLateral = JOptionPane.showInputDialog("Ingresa la superficie lateral");
                            areaCono(fi, Double.parseDouble(base), Double.parseDouble(superficieLateral));
                            break;
                        case "perimetro":
                            radio = JOptionPane.showInputDialog("Ingresa el radio");

                           perimetroCono(fi,Double.parseDouble(radio));

                            break;
                        case "ambos":
                            base = JOptionPane.showInputDialog("Ingresa la base");
                            superficieLateral = JOptionPane.showInputDialog("Ingresa la superficie lateral");
                            radio = JOptionPane.showInputDialog("Ingresa el radio");

                            allCono(fi,Double.parseDouble(base),Double.parseDouble(superficieLateral),Double.parseDouble(radio));

                            break;
                    }



                    break;


                case "cubo 3d":
                    aristas = JOptionPane.showInputDialog("Ingresa una arista");

                    switch (op){
                        case "area":

                            areaCubo(fi,Double.parseDouble(aristas));
                            break;
                        case "perimetro":
                           perimetroCubo(fi);

                            break;
                        case "ambos":
                            allCubo(fi,Double.parseDouble(aristas));
                            break;
                    }
                    break;

                case "esfera 3d":




                    switch (op){
                        case "area":
                            text = JOptionPane.showInputDialog("Ingresa los datos");
                            areaEsfera(fi,Double.parseDouble(text));
                                break;
                        case "perimetro":
                            text = JOptionPane.showInputDialog("Ingresa el radio");

                            perimetroEsfera(fi, Double.parseDouble(text));

                            break;
                        case "ambos":
                            text = JOptionPane.showInputDialog("Ingresa el dato");
                            radio = JOptionPane.showInputDialog("Ingresa el radio");
                            allEsfera(fi,Double.parseDouble(text),Double.parseDouble(radio));
                            break;
                    }
                    break;

                case "piramide cuadrada 3d":


                    switch (op){
                        case "area":
                            aristas = JOptionPane.showInputDialog("Ingresa una rista");
                            ap = JOptionPane.showInputDialog("Ingresa la apotema");
                            areaPiramideCuadrada(fi,Double.parseDouble(aristas),Double.parseDouble(ap));
                            break;
                        case "perimetro":
                            perimetroPiramideCuadrada(fi);
                            break;
                        case "ambos":
                            aristas = JOptionPane.showInputDialog("Ingresa una rista");
                            ap = JOptionPane.showInputDialog("Ingresa la apotema");
                            allPiramideCuadrada(fi,Double.parseDouble(aristas),Double.parseDouble(ap));
                            break;
                    }

                    break;

                case "piramide triangular 3d":

                    switch (op){
                        case "area":
                            aristas = JOptionPane.showInputDialog("Ingresa una rista");
                            ap = JOptionPane.showInputDialog("Ingresa la apotema");
                            areaPiramideTriangular(fi,Double.parseDouble(aristas),Double.parseDouble(ap));
                            break;
                        case "perimetro":
                            perimetroPiramideTriangular(fi);
                            break;
                        case "ambos":
                            aristas = JOptionPane.showInputDialog("Ingresa una rista");
                            ap = JOptionPane.showInputDialog("Ingresa la apotema");
                            allPiramideTriangular(fi,Double.parseDouble(aristas),Double.parseDouble(ap));
                            break;
                    }

                    break;


                case "prisma hexagonal 3d":

                    switch (op){
                        case "area":
                            lado = JOptionPane.showInputDialog("Ingresa un lado");
                            ap = JOptionPane.showInputDialog("Ingresa la apotema");
                            altura = JOptionPane.showInputDialog("Ingresa la altura");
                            areaPrismaHexagonal(fi,Double.parseDouble(lado),Double.parseDouble(ap),Double.parseDouble(altura));
                        break;
                        case "perimetro":
                            perimetroPrismaHexagonal(fi);
                            break;
                        case "ambos":
                            lado = JOptionPane.showInputDialog("Ingresa un lado");
                            ap = JOptionPane.showInputDialog("Ingresa la apotema");
                            altura = JOptionPane.showInputDialog("Ingresa la altura");
                            allPrismaHexagonal(fi,Double.parseDouble(lado),Double.parseDouble(ap),Double.parseDouble(altura));
                            break;
                    }

                    break;

                case "prisma rectangular 3d":
                    switch (op){
                        case "area":
                            lado = JOptionPane.showInputDialog("Ingresa un lado");
                            ladoB = JOptionPane.showInputDialog("Ingresa otro lado");
                            altura = JOptionPane.showInputDialog("Ingresa la altura");
                            areaPrismaHexagonal(fi,Double.parseDouble(lado),Double.parseDouble(ladoB),Double.parseDouble(altura));
                            break;
                        case "perimetro":
                            largo = JOptionPane.showInputDialog("Ingresa el largo");
                            ancho = JOptionPane.showInputDialog("Ingresa el ancho");
                            profundidad = JOptionPane.showInputDialog("Ingresa la profundidad");
                            perimetroPrismaRectangular(fi,Double.parseDouble(largo),Double.parseDouble(ancho),Double.parseDouble(profundidad));
                            break;
                        case "ambos":
                            lado = JOptionPane.showInputDialog("Ingresa un lado");
                            ladoB = JOptionPane.showInputDialog("Ingresa otro lado");
                            altura = JOptionPane.showInputDialog("Ingresa la altura");

                            largo = JOptionPane.showInputDialog("Ingresa el largo");
                            ancho = JOptionPane.showInputDialog("Ingresa el ancho");
                            profundidad = JOptionPane.showInputDialog("Ingresa la profundidad");
                            allPrismaRectangular(fi,Double.parseDouble(lado),Double.parseDouble(ladoB),Double.parseDouble(altura),Double.parseDouble(largo),Double.parseDouble(ancho),Double.parseDouble(profundidad));
                            break;
                    }

                    break;
                case "prisma triangular 3d":
                    switch (op){
                        case "area":
                            lado = JOptionPane.showInputDialog("Ingresa un lado");
                            altura = JOptionPane.showInputDialog("Ingresa la altura");
                            areaPrismaTriangular(fi,Double.parseDouble(lado),Double.parseDouble(altura));
                            break;
                        case "perimetro":
                            perimetroPrismaTriangular(fi);
                            break;
                        case "ambos":
                            lado = JOptionPane.showInputDialog("Ingresa un lado");
                            altura = JOptionPane.showInputDialog("Ingresa la altura");
                            allPrismaTriangular(fi,Double.parseDouble(lado),Double.parseDouble(altura));
                            break;
                    }
                    break;


            }

        }catch (Exception e){

        }


    }










    public static void main(String[] args) {

        initApp();

    }
    
}
