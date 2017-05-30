package com.mauro.ejerprogavanzada;

import java.sql.*;

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
        Aplicación simple: Variación del ejemplo mostrado en el video.
         */
        conectar(new Tupla(3, "lhfgbdlh' or 'H' = 'H"));
    }
    
    public static void conectar(Tupla t) {
        String url = "jdbc:mariadb://localhost:3306/ProgAvanzada";
        try {
            Connection conn = DriverManager.getConnection(url, "user", "pass");
            Statement st = conn.createStatement();
            String sql = "Select d2 from Tupla where d1 = " + t.getDt1()
                    + " and d2 = '" + t.getDt2() + "'";
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                System.out.println(rs.getString("d2"));
            }
            conn.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
