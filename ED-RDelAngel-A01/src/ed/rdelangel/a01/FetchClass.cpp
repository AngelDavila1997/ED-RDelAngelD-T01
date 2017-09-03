#include <iostream>
#include <stdio.h>
#include "FetchClass.h"
#include <time.h>
#include <string>
using namespace std;

FetchClass::FetchClass() {

}

void FetchClass::setArray(int a[]) {
	myArray = a;
}

int* FetchClass::getArray() {
	return myArray;
}

int* FetchClass::RandArray(int size) {
	srand(time(NULL));
	int *temp = new int[size];
	for (int i = 0; i < sizeof(temp); i++) {
		temp[i] = (int)(rand() % 125 + 1);
	}
	return temp;
}

void FetchClass::showArray() {
	showArray(myArray);
}

void FetchClass::showFetch(int position) {
	if (position >= 0) {
		std::cout <<"La posicion del numero es: " << position << endl;
	}
	else {
		std::cout << "El numero no se encuentra en el arreglo" << endl;
	}
}

void FetchClass::showArray(int a[]) {
	for (int i = 0; i < sizeof(a); i++) {
		cout << "arreglo[" << i << "] = " << a[i];
	}
}