/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week5lab;

import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 *
 * @author Lenovo
 */
public class Week5Lab {

        /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();

        SimpleDateFormat contoh1 = new SimpleDateFormat("EE, dd/MM/yyyy HH:mm:ss");
        SimpleDateFormat contoh2 = new SimpleDateFormat("dd-MM-yyyy");
        SimpleDateFormat contoh3 = new SimpleDateFormat("d-MMM-yyyy");
        SimpleDateFormat contoh4 = new SimpleDateFormat("EEEE, d MMMM yyyy");
        SimpleDateFormat contoh5 = new SimpleDateFormat("HH:mm:ss");

        String Tanggal1 = contoh1.format(cal.getTime());
        String Tanggal2 = contoh2.format(cal.getTime());
        String Tanggal3 = contoh3.format(cal.getTime());
        String Tanggal4 = contoh4.format(cal.getTime());
        String Tanggal5 = contoh5.format(cal.getTime());

        System.out.println(Tanggal1);
        System.out.println(Tanggal2);
        System.out.println(Tanggal3);
        System.out.println(Tanggal4);
        System.out.println(Tanggal5);
    }    
    
}
