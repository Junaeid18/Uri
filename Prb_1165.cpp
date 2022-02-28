#include <iostream>
#include <cmath>
using namespace std;
int main()
{
    int x, count {0}, start, num;
    cin >> x;
    while (count < x)
    {
        cin>> num ;
		int c {0};
        if(num <= 2){
			cout<<num<<" eh primo"<<endl;
		}else{
			for(int i=2;i <= sqrt(num); ++i){
				if(num % i == 0){
					cout<<num<<" nao eh primo"<<endl;
					++c;
					break;
				}
			}
			if(c == 0){
				cout<<num<<" eh primo"<<endl;
			}
		}
		++count;
    }
    return 0;
}