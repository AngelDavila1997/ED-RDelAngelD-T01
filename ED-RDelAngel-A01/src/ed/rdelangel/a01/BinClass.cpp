#include <iostream>
#include "BinClass.h"
#include "SortClass.h"

BinClass::BinClass() {

}

int BinClass::bFetch(int e) {
	return bFetch(myArray, e);
}

int BinClass::bFetch(int a[], int e) {
	int centro, inicio, fin; //Se crean los puntos de referencia para el metodo
	inicio = 0;
	fin = sizeof(a) - 1;

	while (inicio <= fin) { //Mientras que el valor de inicio sea menor o igual al valor final del arreglo
		centro = (inicio + fin) / 2; //Se suman y dividen entre 2 para poder encontrar la posicion central

		if (a[centro] == e) {//Si el valor del vector en el centro es igual al valor buscado
			cout << "\nRealizando busqueda binaria..." << endl;
			return centro; //Se regresa el valor conseguido del centro
		}
		if (e < a[centro]) { //Si el valor buscado es menor que el valor del vector en el centro
			fin = centro - 1; //mover final a centro -1
		}
		else {
			inicio = centro + 1; //mover final a centro +1
		}
	}
	cout << "\nRealizando busqueda binaria..." << endl;
	return -1; //Regresa una posicion inexistente
}