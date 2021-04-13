/*
 * To change this license header, choose License Headers in Project Properties.
 * To change t his template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week7lab;
import java.util.ArrayList;
/**
 *
 * @author Lenovo
 */
public class Week7Lab {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Course matkul1 = new Course("Calculus");
        Course matkul2 = new Course("Aljabar");

        matkul1.addStudent("Peter jones");
        matkul1.addStudent("Kim Smith");
        matkul1.addStudent("Anne Kennedy");

        matkul2.addStudent("Peter Jones");
        matkul2.addStudent("Steve Smith");

        System.out.println("Number of Student in matkul1: "+ matkul1.getNumberStuden());
        ArrayList<String> matkul1student = matkul1.getStudents();
        
        for (int i=0 ; i<matkul1student.size() ; i++) {
            System.out.println(matkul1student.get(i) + ", ");
        }
        
        System.out.println("Number of Student in matkul2: "+ matkul2.getNumberStuden());
        ArrayList<String> matkul2student = matkul2.getStudents();
        
        for (int i=0 ; i<matkul2student.size() ; i++) {
            System.out.println(matkul2student.get(i) + ", ");
        }
        
        System.out.println("\nDrop Student in matkul1: ");
        matkul1.hapus("Peter jones");
        System.out.print("Number of Students in matkul1: "+ matkul1.getNumberStuden());
        
        for (int i=0 ; i<matkul1student.size() ; i++) {
            if (i == matkul1student.size() - 1) {
                System.out.println(matkul1student.get(i));
            } else
                System.out.println(matkul1student.get(i)+ ", ");
        }
    }
    }
    
}
