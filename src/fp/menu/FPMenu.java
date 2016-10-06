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
        //FORMA 1
        //Declaraciòn de variables
        int a;
        double resultado;
        //Metodos
        a=menu();
        resultado=calculaAreas(a);
        muestraResultado(resultado, a);
        //FORMA 2
        muestraResultado(calculaAreas(menu()));
    }
    public static int menu(){
        int opcion;
        Scanner teclado = new Scanner(System.in); //Entrada de teclado para selección de opciones
       do{
        System.out.print("Calculo de areas" + "\n");
        System.out.print("Menu:" + "\n");
        System.out.print("Introduce la opciòn deseada" + "\n");
        System.out.print("1. Area de cuadrados" + "\n");
        System.out.print("2. Area de circulos" + "\n");
        System.out.print("3. Area de triangulos" + "\n");
        System.out.print("0. Salir" + "\n");
        opcion=teclado.nextInt();
         }while (opcion <0 || opcion >= 4); //Mientras que la opcion ingresada sea menor que 0 O mayor igual a 4
                                           // seguira mostrando el menu
        return opcion;
    }
    public static double calculaAreas(int opcionelegida){ //Seleccion de area a calcular
        double area; //El 0 es debido al mensaje de salida que no regresa un valor
        switch(opcionelegida){ //Seleccion multiple
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
                area=0;
        }
        return area;
    }
    public static int solicitarDatos(String d){ //Solicita los valores
        int miDato;
        Scanner entradaEscaner = new Scanner(System.in);
        System.out.print("Introduce el dato " + d + "\n");
        miDato= entradaEscaner.nextInt();
        return miDato;
    }
    public static double areaCuadrado(){
        int l = solicitarDatos("lado"); //Se utiliza el metodo para ingresar los datos 
        return Math.pow(l,2);
    }
    public static double areaCirculo(){
        int r = solicitarDatos("radio"); //Se utiliza el metodo para ingresar los datos 
        final double pi = 3.1416;
        return pi*Math.pow(r,2);
    }
    public static double areaTriangulo(){
        int b = solicitarDatos("base"); //Se utiliza el metodo para ingresar los datos 
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
    public static void muestraResultado(double a, int r){
        String figura;
        if (r==1){ figura="cuadrado";
        }else{
        if (r==2){ figura="circulo";
        }else{
            figura="triangulo";
        }
        }
        System.out.print("El area del " + figura + " es " + a);
    }
}
