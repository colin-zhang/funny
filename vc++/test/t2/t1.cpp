#include <iostream>
#include <vector>
#include <string>

using namespace std;
/*
	vector<int> v1,v2;
	vector<string> s1;

	v1.push_back(10);

	cout << "hello world" << endl;
	cout << "lenght of v1:" << v1.size() << "last value of v1" << v1.back();

	cout << endl;
*/
int t1()
{	
	string str;
	vector<string> v1;

	while(getline(cin, str)){
		if(str == "q"){
			cout << "quit" << endl;
			break;
		}
		v1.push_back(str);
	}

	int cnt = 0;
	for(int i = 0; i < v1.size(); i++){
		string s = v1[i];
		cnt += s.size();
	}

	cout<<"total"<<" "<<cnt<<" "<<"chars";
	cout<<endl;

	for(int i = 0; i < v1.size(); i++){
		string s = v1[i];
		cout<<i<<" "<<v1[i]<<" "<<v1[i].size()<<endl;
	}

	return 0;
}