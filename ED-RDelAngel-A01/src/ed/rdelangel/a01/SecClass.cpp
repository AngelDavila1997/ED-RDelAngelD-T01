#include <iostream>
#include "SecClass.h"

SecClass::SecClass() {

}
int SecClass::sFetch(int e) {
	return sFetch(myArray, e);
}

int SecClass::sFetch(int a[], int e) {
	for (int i = 0; i < sizeof(a); i++) { //Ciclo for
		if (a[i] == e) {//Si el valor dentro de esa posicion de vector es igual al valor enviado
			cout << "\nRealizando busqueda secuencial.." << endl;
			return i;//Regresara la posicion
		}
	}
	cout << "\nRealizando busqueda secuencial.." << endl;
	return -1;//Sino regresara -1 (posicion que no existe)
}