#include <iostream> 
#include "SecClass.h"
#include "BinClass.h"
#include "FetchClass.h"
#include "SortClass.h"
using namespace std;



int main(int argc, char *argv[]) {
	int fofo[] = {2,3,4};

	SecClass re;
	re.setArray(re.RandArray(3));
	re.showArray();
	//re.showFetch(re.sFetch(7));
		cout << "\n---------------" << endl;
	/*int fafa[] = {1,2,3,4};
	int fefe[] = {2,3,4,1};
	BinClass abc;
	abc.setArray(fefe);
	abc.selection(fefe);
	abc.showArray();
	abc.showFetch(abc.bFetch(4));
		cout << "\n---------------" << endl;*/
	cin.get();
}