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
        int a;
        double resultado;
        //Metodos
        a=menu();
        resultado=calculaAreas(a);
        muestraResultado(resultado);
    }
    public static int menu(){
        int opcion;
        Scanner teclado = new Scanner(System.in);
       do{
        System.out.print("Calculo de areas" + "\n");
        System.out.print("Menu:" + "\n");
        System.out.print("Introduce la opciòn deseada" + "\n");
        System.out.print("1. Area de cuadrados" + "\n");
        System.out.print("2. Area de circulos" + "\n");
        System.out.print("3. Area de triangulos" + "\n");
        System.out.print("0. Salir");
        opcion=teclado.nextInt();
         }while (opcion <0 || opcion >= 4);
        return opcion;
    }
    public static double calculaAreas(int a){
        double area = 0;
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
                mensajeSalida();
        }
        return area;
    }
    public static int solicitarDatos(String d){ //Solicita los valores
        int miDato;
        Scanner entradaEscaner = new Scanner(System.in);
        System.out.print("Introduce el dato " + d);
        miDato= entradaEscaner.nextInt();
        return miDato;
    }
    public static double areaCuadrado(){
        int l = solicitarDatos("lado");
        return Math.pow(l,2);
    }
    public static double areaCirculo(){
        int r = solicitarDatos("radio");
        final double pi = 3.1416;
        return pi*Math.pow(r,2);
    }
    public static double areaTriangulo(){
        int b = solicitarDatos("base");
        int h = solicitarDatos("altura");
        return (b*h)/2;
    }
    public static void mensajeSalida(){
        System.out.print("Hasta luego");
        System.exit(0);
    }
    public static void muestraResultado(double a){
        System.out.print("El area es " + a);
    }
}
