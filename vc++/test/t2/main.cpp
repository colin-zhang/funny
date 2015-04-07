#include <iostream>
#include "t.h"
using namespace std;

int main()
{
	int i;
	cout << "test number 1-2 :" << endl;
	cin >> i;

	switch(i){
		case 1:
			t1();
			break;
		deafult:
			break;
	}

	cout << "quit" << endl;
	return 0;
}