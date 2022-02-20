#include <iostream>
using namespace std;
int main()
{
    int num1,num2,sum {0},temp;
    cin>>num1;
    cin>>num2;
    (num1>num2)?temp=num1,num1=num2,num2=temp:num1=num1;
    while (num1 <= num2)
    {
        (num1%13 != 0)?sum+=num1,++num1:++num1; 
    }
    cout<<sum<<endl;

    return 0;
}