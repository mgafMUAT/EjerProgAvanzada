package com.mauro.ejerprogavanzada;

import java.sql.*;

/**
 * Hello world! (Enviar a m.caceres01@ufromail.cl)
 */
public class App {

    public static void main(String[] args) {
        String input = "Mildred\nConstance\nLadawn\nBronwyn\nMaisha\nFrance\n"
                + "Myrtle\nOrlando\nAlysha\nRena\nCoralie\nKatie\nKati\nRosy\n"
                + "Vanetta\nJake\nStefan\nJim\nSheridan\nHilary\nPablo\nJazmine\n"
                + "Heidi\nQueenie\nFelicitas\nHelene\nCordelia\nNeal\nRandee\n"
                + "Bette\nWhitney\nScotty\nCasey\nJohnny\nArlen\nMilo\nWilson\n"
                + "Ray\nDorsey\nJeremiah\nTerrance\nRonald\nIvory\nTeodoro\n"
                + "Lorenzo\nVon\nEfrain\nDerrick\nDelbert\nDarius";

        /*
        Aplicación simple: Insertar tuplas con los nombres provistos.
        DELIMITER //
         CREATE PROCEDURE insertar(in dt1 integer, in dt2 varchar(50))
           BEGIN
            insert into Tupla values(dt1, dt2);
           END //
        DELIMITER ;
         */
        conectar(input.split("\n"));
    }

    public static void conectar(String[] in) {
        String url = "jdbc:mariadb://localhost:3306/ProgAvanzada";
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url, "user", "pass");
            String sql = "{call insertar(?,?)}";
            CallableStatement cs = null;
            for (int i = 0; i < in.length; i++) {
                cs = conn.prepareCall(sql);
                cs.setInt(1, i);
                cs.setString(2, in[i]);
                cs.execute();
                cs.close();
            }
            conn.close();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
}
