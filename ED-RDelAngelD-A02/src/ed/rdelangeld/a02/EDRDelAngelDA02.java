/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ed.rdelangeld.a02;

/**
 *
 * @author A01411440
 */
public class EDRDelAngelDA02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Factorial
        System.out.println(Metodos.factorial(5));
       //Suma vectores
       int[]vector = {20,30,10,45};
       System.out.println(Metodos.sumaVector(vector, vector.length-1));
       //Multiplicar vectores
       System.out.println(Metodos.multVector(vector, vector.length-1));
    }
    
}
