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
       do{
        System.out.print("Calculo de areas");
        System.out.print("Menu:");
        System.out.print("Introduce la opciòn deseada");
        System.out.print("1. Area de cuadrados");
        System.out.print("2. Area de circulos");
        System.out.print("3. Area de triangulos");
        System.out.print("0. Salir");
        opcion=teclado.nextInt();
         }while (opcion <0 || opcion >= 4);
        return opcion;
    }
    public static float calculaAreas(int a){
      float area;
        switch(a){
            case 1:
                area = areaCuadrado();
                break;
            case 2:
                area = areaCirculo();
                break;
            case 3:
                area = areaTriangulo();
                break;
            default:
                area = mensajeSalida();
                break;
        }
        return area;
    }
    public static int areaCuadrado(int a){
        return Math.pow(a,2);
    }
    public static int areaCirculo(int a){
        return 
    }
}
