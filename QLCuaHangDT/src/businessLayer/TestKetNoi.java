/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package businessLayer;
import java.sql.Connection;

/**
 *
 * @author caoth
 */
public class TestKetNoi {
    public static void main(String[] args) {
        Connection kn = CSDL.getKetNoi();
    }
}
