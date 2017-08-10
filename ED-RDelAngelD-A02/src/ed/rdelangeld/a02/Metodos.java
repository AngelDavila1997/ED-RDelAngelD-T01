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
public class Metodos {
    public static int factorial(int n){
        //caso base
        if (n==0){
            return 1;
        }
        //caso recursivo
        else{
            //Se muestra en que numero va
            System.out.println(n);
            return n * factorial(n-1);
        }
    }
    public static int sumaVector(int[] v, int p){
        //caso base
        if(p==0){
            return v[p];
        }else{
        //caso recursivo
            System.out.println("Posición:" + p);
            return sumaVector(v, p-1) + v[p];
        }
    }
    public static int multVector(int[] v, int p){
        //caso base
        if(p==0){
            return v[p];
        }else{
        //caso recursivo
            System.out.println("Posición:" + p);
            return multVector(v, p-1) * v[p];
        }
    }
}
