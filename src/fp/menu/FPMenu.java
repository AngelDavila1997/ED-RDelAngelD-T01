/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fp.menu;
import java.util.*;
/**
 *
 * @author PC
 */
public class FPMenu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Declaraciòn de variables
       
        //Metodos
        System.out.print("La opcion elegida es:" + menu());
    }
    public static int menu(){
        int opcion;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Calculo de areas");
        System.out.print("Menù:");
        System.out.print("Introduce la opciòn deseada");
        System.out.print("1. Area de cuadrados");
        System.out.print("2. Area de circulos");
        System.out.print("3. Area de triangulos");
        opcion=teclado.nextInt();
        return opcion;
    }
}
