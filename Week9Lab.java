/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week9lab;

/**
 *
 * @author Lenovo
 */
public class Week9Lab {

    public static void main(String[] args) { 
    new Person().printPerson(); 
    new Student().printPerson(); 
    } 
} 

class Student extends Person { 
    private String getInfo() { 
    return "Student"; 
    } 
} 

class Person { 
    private String getInfo() { 
    return "Person"; 
    }
    
    public void printPerson() { 
    System.out.println(getInfo()); 
    } 
}


