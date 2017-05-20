package com.mauro.ejerprogavanzada;

/**
 * Hello world!
 *
 */
public class App {

    public static void main(String[] args) {
//        String input = "Mildred\nConstance\nLadawn\nBronwyn\nMaisha\nFrance\n"
//                + "Myrtle\nOrlando\nAlysha\nRena\nCoralie\nKatie\nKati\nRosy\n"
//                + "Vanetta\nJake\nStefan\nJim\nSheridan\nHilary\nPablo\nJazmine\n"
//                + "Heidi\nQueenie\nFelicitas\nHelene\nCordelia\nNeal\nRandee\n"
//                + "Bette\nWhitney\nScotty\nCasey\nJohnny\nArlen\nMilo\nWilson\n"
//                + "Ray\nDorsey\nJeremiah\nTerrance\nRonald\nIvory\nTeodoro\n"
//                + "Lorenzo\nVon\nEfrain\nDerrick\nDelbert\nDarius";

        /*
        Aplicación simple: Probar uno de varios posibles errores, y demostrando
        polimorfismo en java por sobreescritura de métodos (Throwable, superclase
        de Error y Exception)
         */
        try {
            switch (new java.util.Random().nextInt(4)) {
                case 1:
                    int i = 1 / 0;
                case 2:
                    Integer.parseInt("ygolufbgvdalvb");
                case 3:
                    new java.util.Scanner(new java.io.File("Archivo_Inexistnte"));
                default:
                    throw new AssertionError("Opción número 4");
            }
        } catch (Throwable t) {
            System.out.println(t.getMessage());
        }
    }
}
