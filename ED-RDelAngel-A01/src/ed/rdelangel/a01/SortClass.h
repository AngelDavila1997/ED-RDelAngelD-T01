#pragma once
#include <iostream>
using namespace std;

class SortClass {
public:
	void selection(int a[]);
	void insertion(int a[]);
	void bubble(int a[]);
	void quickSort(int a[], int i, int f);
	void mergeSort(int a[], int c, int b);
	void merge(int a[], int c, int b, int medio);
};