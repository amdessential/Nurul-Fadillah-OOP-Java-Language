/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week5lab;

/**
 *
 * @author Lenovo
 */
public class NilaiDefault {
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner kg = new Scanner(System.in);
        Tabung tes1 = new Tabung();

        //Contructor Nilai default
        System.out.println("== Contructor Nilai default ==");
        System.out.println("Nilai radius di Nilai default: "+ tes1.radius);
        System.out.println("Nilai Tinggi di Nilai default: "+ tes1.tinggi);
        System.out.println("Nilai Luas Alas Tabung: "+ tes1.getLuasAlas());
        System.out.println("Nilai Volume Tabung: "+ tes1.getVolume());


        //Countructor Nilai bebas
        System.out.println("\n\n== Contructor Nilai Bebas input ==");
        System.out.print("Masukkan Nilai Radius : ");
        double rad = kg.nextDouble();
        System.out.print("Masukkan Nilai Tinggi : ");
        double tin = kg.nextDouble();



        Tabung tes2 = new Tabung();
        tes2.radius = rad;
        tes2.tinggi = tin;

        System.out.println("Nilai radius di Nilai input : "+ rad);
        System.out.println("Nilai Tinggi di Nilai input : "+ tin);
        System.out.println("Nilai Luas Alas Tabung: "+ tes2.getLuasAlas());
        System.out.println("Nilai Volume Tabung: "+ tes2.getVolume());
        
        
    }
}
