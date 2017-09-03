#pragma once
#include <iostream>
using namespace std;

class FetchClass {
protected:
	int *myArray;
public:
	FetchClass();
	virtual void setArray(int a[]);
	virtual int* getArray();
	virtual int* RandArray(int size);
	virtual void showArray();
	virtual void showFetch(int position);
	virtual void showArray(int a[]);
};