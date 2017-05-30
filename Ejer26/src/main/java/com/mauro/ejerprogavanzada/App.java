package com.mauro.ejerprogavanzada;

import java.sql.*;

/**
 * Hello world! (Enviar a m.caceres01@ufromail.cl)
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
        Aplicación simple: Cronometrar cada método con 1.000.000 repeticiones.
         */
        conectar(new Tupla(3, "Hola"));
    }

    public static void conectar(Tupla t) {
        long ini, fin;
        String url = "jdbc:mariadb://localhost:3306/ProgAvanzada";
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url, "user", "pass");
            ini = System.currentTimeMillis();
            for (int i = 0; i < 1000000; i++) {
                if (i % 100000 == 0) {
                    System.out.print(i / 100000);
                }
                Statement st = conn.createStatement();
                String sql = "Select d2 from Tupla where d1 = " + t.getDt1()
                        + " and d2 = '" + t.getDt2() + "'";
                st.executeQuery(sql);
            }
            fin = System.currentTimeMillis();
            System.out.printf("\nTiempo Statement: %f%s", (fin - ini) / 1000.0, "\n");
            ini = System.currentTimeMillis();
            for (int i = 0; i < 1000000; i++) {
                if (i % 100000 == 0) {
                    System.out.print(i / 100000);
                }
                String sql = "Select d2 from Tupla where d1 = ? and d2 = ?";
                PreparedStatement ps = conn.prepareStatement(sql);
                ps.setInt(1, t.getDt1());
                ps.setString(2, t.getDt2());
                ps.executeQuery();
            }
            fin = System.currentTimeMillis();
            System.out.printf("\nTiempo PreparedStatement: %f%s", (fin - ini) / 1000.0, "\n");
            ini = System.currentTimeMillis();
            PreparedStatement ps = null;
            for (int i = 1; i <= 1000000; i++) {
                if (i % 100000 == 0) {
                    System.out.print(i / 100000);
                }
                String sql = "Select d2 from Tupla where d1 = ? and d2 = ?";
                ps = conn.prepareStatement(sql);
                ps.setInt(1, t.getDt1());
                ps.setString(2, t.getDt2());
                ps.addBatch();
            }
            ps.executeQuery();
            fin = System.currentTimeMillis();
            System.out.printf("\nTiempo PreparedStatement c/ batch: %f%s", (fin - ini) / 1000.0, "\n");
            conn.close();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
}
