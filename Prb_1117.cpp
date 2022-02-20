#include <iostream>
#include <iomanip>
using namespace std;
int main()
{
    double num1,num2;
    bool exit = false;
    
    cin>>num1;
    cin>>num2;
    if(num1<0 || num1> 10){
        while(num1<0 || num1> 10){
            cout<<"nota invalida"<<endl;
            cin>>num1;
        }
    }
    if(num2<0 || num2> 10){
        while(num2<0 || num2> 10){
            cout<<"nota invalida"<<endl;
            cin>>num2;
        }
    }
    double avg = (num1 + num2)/2;
    cout<< "media = "<< setprecision(2)<<fixed << avg<< endl;

    return 0;
}