#include <iostream>
#include <stdlib.h>
using namespace std;
int main()
{
    int num1,num2,temp;
    cin>>num1;
    cin>>num2;
    (num1>num2)?temp=num1,num1=num2,num2=temp:num1=num1;
    ++num1;
    while(num1 < num2){
        if((num1%5 == 2) || (num1%5 == 3)){
            cout<<num1<<endl;
        }
        ++num1;
    }

    return 0;
}