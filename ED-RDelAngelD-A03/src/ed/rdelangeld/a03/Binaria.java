/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ed.rdelangeld.a03;

/**
 *
 * @author A01411440
 */
public class Binaria extends BusquedaClase{

    @Override
    int fetch(int n) {//Se escribe dentro del metodo
           int centro, inicio, fin; //Se crean los puntos de referencia para el metodo
           inicio = 0;
           fin = vector.length-1;
           
        while(inicio <= fin){ //Mientras que el valor de inicio sea menor o igual al valor final del arreglo
            centro = (inicio + fin) /2; //Se suman y dividen entre 2 para poder encontrar la posicion central
     
                if(vector[centro] == n){//Si el valor del vector en el centro es igual al valor buscado
                    System.out.println("Realizando busqueda binaria...");
                    return centro; //Se regresa el valor conseguido del centro
                }
                if(n < vector[centro]){ //Si el valor buscado es menor que el valor del vector en el centro
                        fin = centro - 1; //mover final a centro -1
                        }else{
                    inicio = centro + 1; //mover final a centro +1
                }
                }
        System.out.println("Realizando busqueda binaria...");
        return -1; //Regresa una posicion inexistente
        }
    }
