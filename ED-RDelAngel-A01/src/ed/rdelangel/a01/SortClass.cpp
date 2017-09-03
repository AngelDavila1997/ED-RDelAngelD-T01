#include <iostream>
#include "SortClass.h"

void SortClass::selection(int a[]) {
	for (int i = 0; i < sizeof(a) - 1; i++)//Mientras i sea menor al largo del vector -1
	{
		int menor = i;//La posicion menor se guardara
		for (int j = i + 1; j < sizeof(a); j++)//Mientras que j sea menor que el largo del vector
		{
			if (a[j] < a[menor])//Si el valor en la posicion j es menor
			{
				menor = j;//menor iguala a la posicion j
			}
		}
		if (i != menor) //si i es diferente de menor
		{
			int temp = a[i];
			a[i] = a[menor];
			a[menor] = temp;
		}
	}
}

void SortClass::insertion(int a[]) {
	for (int i = 1; i < sizeof(a); i++) {//Mientras i sea menor al largo del vector
		int temp = a[i];//El valor del vector en la posicion i se guarda en temp
		int j = i - 1;// En la variable j e guarda el valor de i -1
		while ((j >= 0) && (a[j] > temp)) {//Mientras que j sea mayor o igual a0
										   //Y el valor del vector en la pos j sea mayor que temp
			a[j + 1] = a[j];
			j--;
		}
		a[j + 1] = temp;
	}
}

void SortClass::bubble(int a[]) {
	for (int i = 1; i < sizeof(a); i++) {
		for (int j = 0; j < sizeof(a) - 1; j++) {
			if (a[j] > a[j + 1]) {
				int temp = a[j];
				a[j] = a[j + 1];
				a[j + 1] = temp;
			}
		}
	}
}

void SortClass::quickSort(int a[], int i, int f) {
	int i2, j2, pivote;
	i2 = i;
	j2 = f;
	pivote = a[(i + f) / 2];//Se obtiene el pivote sumando las posiciones inicio y final-inicio
							//del vector entre 2 y el valor de esa posicion se le da a pivote
	do {//Mientras que la condicion de i<=j se cumpla
		while (a[i2] < pivote) {//Si el valor del vector en la posicion i es menor al pivote
			i2++;//El apuntador avanzara
		}
		while (a[j2] > pivote) {//Si el valor del vector en la posicion j es mayor al pivote
			j2--;//El apuntador ira para atras
		}
		if (i2 <= j2) {//Si i<=j se realizara el intercambio de valores y se moveran los apuntadores
			int temp = a[i2];
			a[i2] = a[j2];
			a[j2] = temp;
			i2++;
			j2--;
		}
	} while (i2 <= j2);

	if (i < j2) {//Si el inicio del arreglo es menor que j
		quickSort(a, i, j2); //Se enviara un arreglo con estas dos posiciones como parametros
	}
	if (i2 < f) {//Si el i es menor que el final del arreglo
		quickSort(a, i2, f);//Se enviara un arreglo con estas dos posiciones como parametros
	}
}

void SortClass::mergeSort(int a[], int c, int b) {
	if (c < b) {//Checa si el inicio es mas pequeño que el ultimo (son numero de posiciones)
		int medio = (c + b) / 2;//Se obtiene la posicion media
								//Comienza a dividir el lado izquierdo del arreglo
		mergeSort(a, c, medio);
		//Comienza a dividir el lado derecho del arreglo
		mergeSort(a, medio + 1, b);
		//Se combinan los arreglos
		merge(a, c, b, medio);
	}
}

void SortClass::merge(int a[], int c, int b, int medio) {
	int auxiliar[sizeof(a)];//Se crea un arreglo auxiliar
	for (int i = c; i <= b; i++) {
		auxiliar[i] = a[i];//Se copian ambas partes en el arreglo auxiliar
	}
	int i = c;
	int j = medio + 1;
	int k = c;
	// Se copian los valores mas pequeños de, ya sea el lado izq o der hacia el arreglo original
	while (i <= medio && j <= b) {//Mientras que i sea menor o igual al medio y j sea menor o igual a ultimo
		if (auxiliar[i] <= auxiliar[j]) {//Si el valor de la posicion i en el arreglo auxiliar
										 //es menor o igual al valor de la posicion j en el mismo arreglo
			a[k] = auxiliar[i];//En el vector original se guardara el valor de la pos i del arreglo auxiliar
			i++;//i aumenta en 1, osea se mueve el indicador de posicion
		}
		else {//Sino
			a[k] = auxiliar[j];//En el vector original se guardara el valor de la pos j en el arreglo auxiliar
			j++;//j aumenta en 1, y se aumenta el indicador de posicion
		}
		k++;//Aumenta la posicion del arreglo original
	}
	//Se copia el resto del arreglo izq en el arreglo original
	while (i <= medio) {
		a[k] = auxiliar[i];
		k++;
		i++;
	}
}