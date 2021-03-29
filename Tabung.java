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
public class Tabung {
    double radius = 1;
    double tinggi = 1;

    public double getVolume(){
        return Math.PI * radius * radius * tinggi;
    }
    public double getLuasAlas(){
        return Math.PI * radius * radius;
    }
    public double setRadius(double R){
       return radius = R;
    }
    public double setTinggi(double T){
       return tinggi = T;
    }
    
}
