/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week6lab;

/**
 *
 * @author Lenovo
 */
public class Week6Lab {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int mahasiswa = 8, jumlahjawab = 10;
        char[][] jawaban = {
        {'A', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'}, 
        {'D', 'B', 'A', 'B', 'C', 'A', 'E', 'E', 'A', 'D'},
        {'E', 'D', 'D', 'A', 'C', 'B', 'E', 'E', 'A', 'D'}, 
        {'C', 'B', 'A', 'E', 'D', 'C', 'E', 'E', 'A', 'D'},
        {'A', 'B', 'D', 'C', 'C', 'D', 'E', 'E', 'A', 'D'}, 
        {'B', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
        {'B', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'}, 
        {'E', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'}
        };

        char[] kunci = {'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D'};
        int[] result = new int[mahasiswa];

        for(int i=0 ; i<mahasiswa ; ++i) {
            int benar = 0;
            for(int j=0 ; j<jumlahjawab ; ++j) {
                if(jawaban[i][j] == kunci[j]) {
                    benar++;
                }
            }
            result[i] = benar;
        }

        System.out.println("jawaban benar masing-masing mahasiswa: \n");
        for(int i=0 ; i<mahasiswa ; ++i) {
            System.out.println("Mhs " + i + " jumlah jawaban benar adalah " + result[i]+" dari 10 Soal");
        }
    }
    
}
